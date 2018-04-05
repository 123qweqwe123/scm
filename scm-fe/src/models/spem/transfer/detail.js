import {
  queryDetails,
  updateDetail,
  queryLinkMen,
  createOrUpdateLinkMen,
  uploadTransferDetail,
  queryUnselectedBoxes,
  addTransferDetail,
  queryTransferBoxes
} from '../../../services/spem/transfer'
import pathToRegexp from 'path-to-regexp'
import { message } from 'antd'
import lodash from 'lodash'
import { isEqual } from '../../../utils'

export default {

  namespace: 'transferDetail',

  state: {
    list: [],
    item: {}, // 当前 item
    formItem: {}, // form item
    itemSwitched: false,  // 点击切换行
    itemSelected: false,  // 是否选中行
    modalVisible: false,  // 联系人编辑 modal
    formChanged: false, // 表单数据是否变化
    modalType: 'createLinkMan',
    modalItem: {},
    planGetMen: [], //  取样人列表
    link1Men: [], // 主联系人
    link2Men: [],  // 备用联系人,
    uploadModalVisible: false,  // 上传运单 modal
    operatorItem: {},  // 上传运单/补充 关联 item
    previewVisible: true,
    addBoxModalVisible: false,
    unselectedBoxes: {
      dataSource: [],  // 数据源
      targetKeys: [] // 已被选中列表
    },
    boxesByDetailId: {}  // 样本运单明细对应
  },

  subscriptions: {
    setup ({ dispatch, history }) {
      history.listen(location => {
        const match = pathToRegexp('/spem/transfer/:transId').exec(location.pathname)
        if (match) {
          dispatch({ type: 'query', payload: { transId: match[1], pageSize: 100 } })

          dispatch({ type: 'resetState' })

          dispatch({ type: 'queryLinkMen', payload: { linkType: 3 } })

          dispatch({ type: 'queryTransferBoxes' })
        }
      })
    },
  },

  effects: {

    *query ({ payload }, { call, put }) {
      const data = yield call(queryDetails, payload)
      if (data) {
        yield put({
          type: 'querySuccess',
          payload: {
            list: data.array
          },
        })
      }
    },
    *update({ payload }, { call, select, put }) {
      const formItem = yield select(({ transferDetail }) => transferDetail.formItem)
      const match = pathToRegexp('/spem/transfer/:transId').exec(location.pathname)
      const transId = match[1]
      const data = yield call(updateDetail, { ...formItem, transId })
      if (data.success) {
        message.success('保存成功')
        yield put({ type: 'query', payload: { transId: match[1], pageSize: 100 } })
        yield put({ type: 'resetState' })
      } else {
        // 发生异常，formChanged 状态回滚
        yield put({ type: 'isFormChanged', payload: { formChanged: true } })
        throw data.message
      }
    },

    // payload type=3查询取样人 lccCode!=null&&type=1主联系人 lccCode!=null&&type==2备用联系人
    *queryLinkMen ({ payload }, { call, select, put }) {
      const currItem = yield select(({ transferDetail }) => transferDetail.item)
      const { linkType } = payload
      const match = pathToRegexp('/spem/transfer/:transId').exec(location.pathname)
      const transId = match[1]
      let data
      if (linkType === 3) { // 查询取样人
        data = yield call(queryLinkMen, { ...payload, transId })
      } else if (currItem.lccCode) {  // 查询主联系人/备用联系人
        data = yield call(queryLinkMen, { transId, lccCode: currItem.lccCode })
      } else {  // 反选置空
        data = {
          success: true,
          array: []
        }
      }
      if (data.success) {
        yield put({ type: 'queryLinkMenSuccess', payload: { ...payload, list: data.array } })
      }
    },

    *createOrUpdateLinkMan ({ payload }, { call, select, put }) {
      const match = pathToRegexp('/spem/transfer/:transId').exec(location.pathname)
      const transId = match[1]
      const modalItem = yield select(({ transferDetail }) => transferDetail.modalItem)
      const item = yield select(({ transferDetail }) => transferDetail.item)
      const detailId = item.id
      // detailId
      const data = yield call(createOrUpdateLinkMen, { ...modalItem, ...payload, transId, detailId })
      if (data.success) {
        yield put({ type: 'hideModal', payload: { ...modalItem, ...payload, result: data.array[0] } })
      } else {
        throw data.message
      }
    },

    *uploadTransferDetail({ payload }, { call, put }) {
      const data = yield call(uploadTransferDetail, payload)
      if (data.success) {
        yield put({ type: 'hideUploadModal' })
      } else {
        throw data.message
      }
    },

    *queryUnselectedBoxes({ payload }, { call, put }) {
      const { record } = payload
      const data = yield call(queryUnselectedBoxes, { lccCode: record.lccCode })
      if (data.success) {
        yield put({
          type: 'queryUnselectedBoxesSuccess',
          payload: {
            boxes: data.array,
            operatorItem: record
          }
        })
      } else {
        throw data.message
      }
    },

    *addTransferDetail({ payload }, { call, select, put }) {
      const match = pathToRegexp('/spem/transfer/:transId').exec(location.pathname)
      const data = yield call(addTransferDetail, payload)
      if (data.success) {
        message.success('保存成功')
        yield put({ type: 'query', payload: { transId: match[1], pageSize: 100 } })
        yield put({ type: 'hideAddBoxModal' })
      } else {
        // 发生异常，formChanged 状态回滚
        yield put({ type: 'isFormChanged', payload: { formChanged: true } })
        throw data.message
      }
    },

    *queryTransferBoxes({ payload }, { call, select, put }) {
      const match = pathToRegexp('/spem/transfer/:transId').exec(location.pathname)
      const data = yield call(queryTransferBoxes, { transId: match[1] })
      if (data.success) {
        yield put({
          type: 'queryBoxesByTransferIdSuccess',
          payload: data.array
        })
      } else {
        throw data.message
      }
    }
  },

  reducers: {

    querySuccess (state, action) {
      const { list } = action.payload
      return {
        ...state,
        list
      }
    },

    resetState (state, action) {
      return {
        ...state,
        item: {},
        formItem: {},
        itemSelected: false,
        itemSwitched: false,
        formChanged: false,
      }
    },

    isFormChanged(state, action) {
      const { formChanged } = action.payload
      return {
        ...state,
        formChanged: formChanged,
      }
    },

    resetForm(state, action) {
      const { item } = state
      const formItem = lodash.cloneDeep(item)
      return {
        ...state,
        formChanged: false,
        formItem
      }
    },

    changeState (state, action) {
      const { record } = action.payload
      const { item, itemSelected, itemSwitched } = state
      let selected = itemSelected
      let switched = itemSwitched
      let currItem = item
      let currFormItem = {}

      // 第一次选择
      if (!item.id) {
        switched = false
        selected = true
        currFormItem = record
        currItem = record
      }
      // 选择了新的行
      if (record.id !== item.id) {
        switched = true
        selected = true
        currFormItem = record
        currItem = record
      } else if (itemSelected) {  // 反选
        switched = false
        selected = false
        currFormItem = {}
        currItem = {}
      }
      currFormItem = lodash.cloneDeep(currFormItem)
      return {
        ...state,
        item: currItem,
        formItem: currFormItem,
        itemSwitched: switched,
        itemSelected: selected,
      }
    },

    queryLinkMenSuccess(state, action) {
      const { linkType, list } = action.payload
      let link1Men, link2Men
      if (linkType === 1 || linkType === 2) {
        link1Men = list.filter(x => x.linkType === 1)
        link2Men = list.filter(x => x.linkType === 2)
        return {
          ...state,
          link1Men,
          link2Men
        }
      }
      if (linkType === 3) {
        // 根据姓名去重
        let uniqueMen = lodash.uniqWith(list, (s, d) => s.linkName === d.linkName)
        return { ...state, planGetMen: uniqueMen }
      }
    },

    /**
     * 关闭 Modal，并动态更新 state
     * @param state
     * @param action
     * @returns {{link1Men: *, link2Men: *, planGetMen: *, item: *, formItem: *, formChanged: *, modalVisible: boolean, modalItem: {}}}
     */
    hideModal(state, action) {
      const { modalItem, link1Men, link2Men, planGetMen, item, formItem, formChanged } = state
      let changed = formChanged
      // 添加/修改数据
      if (action.payload) {
        // 后台返回的更新后的数据
        const { result } = action.payload
        const { linkType, linkName, phone } = action.payload
        const srcLinkName = modalItem.linkName
        if (linkType === 1) {
          link1Men.map(x => {
            if (x.linkName === srcLinkName) {
              x.linkName = linkName
              x.link1Tel = phone
            }
          })
          // 新增，添加到 link1Men
          if (!modalItem.id) {
            link1Men.push(result)
          }
          // 更新 item 名字
          if (item.link1Man === srcLinkName) {
            item.link1Man = linkName
            item.link1Tel = phone
          }
          // 更新 formItem 名字
          if (formItem.link1Man === srcLinkName) {
            formItem.link1Man = linkName
            formItem.link1Tel = phone
          }
        } else if (linkType === 2) {
          link2Men.map(x => {
            if (x.linkName === srcLinkName) {
              x.linkName = linkName
              x.link2Tel = phone
            }
          })
          // 新增，添加到 link1Men
          if (!modalItem.id) {
            link2Men.push(result)
          }
          if (item.link2Man === srcLinkName) { // 修改
            item.link2Man = linkName
            item.link2Tel = phone
          }
          if (formItem.link2Man === srcLinkName) {
            formItem.link2Man = linkName
            formItem.link2Tel = phone
          }
        } else if (linkType === 3) {
          planGetMen.map(x => {
            if (x.linkName === srcLinkName) {
              x.linkName = linkName
            }
          })
          if (!modalItem.id) {
            planGetMen.push(result)
          }
          if (item.planGetManName === srcLinkName) {
            item.planGetManName = linkName
          }
          if (formItem.planGetManName === srcLinkName) {
            formItem.planGetManName = linkName
          }
        }
        changed = false
        // 再次验证 formChanged 数据， filter.setFieldsValue 会在当前操作之前将 changed 置为 true
        for (let x in formItem) {
          if (!isEqual(formItem[x], item[x])) {
            changed = true
            break
          }
        }
      }
      return {
        ...state,
        link1Men,
        link2Men,
        planGetMen,
        item,
        formItem,
        formChanged: changed,
        modalVisible: false,
        modalItem: {}
      }
    },
    showModal(state, action) {
      const modalItem = action.payload
      const { link1Men, link2Men, planGetMen, item } = state
      const { linkName, linkType } = modalItem
      let id;
      if (linkType === 1 && linkName) {
        id = link1Men.filter(x => x.linkName === linkName)[0].id
      } else if (linkType === 2 && linkName) {
        id = link2Men.filter(x => x.linkName === linkName)[0].id
      } else if (linkType === 3 && linkName) {
        id = planGetMen.filter(x => x.linkName === linkName)[0].id
      }
      if (id) {
        modalItem.id = id
      }
      modalItem.lccCode = item.lccCode
      return {
        ...state,
        modalItem,
        modalVisible: true,
      }
    },

    showUploadModal(state, action) {
      const { operatorItem } = action.payload
      return {
        ...state,
        operatorItem,
        uploadModalVisible: true,
      }
    },

    hideUploadModal(state, action) {
      return {
        ...state,
        uploadModalVisible: false
      }
    },

    hideAddBoxModal(state, action) {
      return {
        ...state,
        addBoxModalVisible: false
      }
    },

    queryUnselectedBoxesSuccess(state, action) {
      const { boxes, operatorItem } = action.payload
      const { unselectedBoxes } = state
      // dataSource
      const { dataSource } = unselectedBoxes
      boxes.forEach(x => {
        dataSource.push({
          key: x.boxCode,
          title: x.tubeNum === 100 ? (x.boxCode + ('(已满)')) : (x.boxCode + ('(未满)')),
          isFull: x.tubeNum === 100
        })
      })
      return {
        ...state,
        unselectedBoxes,
        operatorItem,
        addBoxModalVisible: true
      }
    },

    queryBoxesByTransferIdSuccess(state, action) {
      const boxes = action.payload
      const boxesByDetailId = {}
      boxes.forEach(x => {
        let detailId = x.transDetailId
        if (!boxesByDetailId[detailId]) {
          boxesByDetailId[detailId] = []
        }
        boxesByDetailId[detailId].push(x.boxCode)
      })
      return {
        ...state,
        boxesByDetailId
      }
    }

  },

}
