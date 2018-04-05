import {
  queryTransfers,
  queryTransfer,
  queryUnTransfer,
  queryDetails,
  queryImages,
  queryEmails,
  createEmails,
  updateEmails,
  queryTransNo,
  queryBoxes,
  createTransfer,
  deliverTransfer
} from '../../services/spem/transfer'
import { queryAutoComplete } from '../../services/common'
import { api } from '../../utils/config'
import { querySelect } from '../../services/common'
import { message } from 'antd'
import moment from 'moment'
import lodash from 'lodash'

const { common } = api
const { preview } = common

export default {

  namespace: 'transfer',

  state: {
    list: [],
    subList: {},  // 保存行 key 和  subTable 之间的对饮关系
    siblingList: [],  // 未转运列表
    currentItem: {},
    statusList: [], // 主任务进度
    roles: [],
    isMotion: false,
    previewVisible: false,
    images: [],
    currentImage: 0,
    pagination: {
      showSizeChanger: true,
      showQuickJumper: true,
      showTotal: total => `共 ${total} 条`,
      current: 1,
      size: 'small',
      total: null,
    },
    siblingPagination: {
      showSizeChanger: false,
      showQuickJumper: false,
      showTotal: total => `共 ${total} 条`,
      current: 1,
      size: 'small',
      total: null,
    },
    master: {
      transNo: {
        disabled: true,
        prefix: '',
        dateStr: moment().format('YYYYMMDD'),
        suffix: ''
      },
      createBy: {
        disabled: true
      },
      form: {
        transNo: '',
        rccCode: '',
        createBy: '',
        createByName: ''
      },
      rccs: [],  // 取样项目点列表
      users: [], // 任务创建人列表
      user: {}, // 当前登录用户
      boxes: {
        dataSource: [], // boxes 穿梭框数据源
        targetKeys: [], // 已被选中列表
        list: [],  // box 列表
        tableDataSource: [], // 冻存盒 table 数据源
        boxesGroupByLccCodeStr: '', // boxCode,boxCode;boxCode,boxCode;
        boxGroupByLccCode: {}, // lccCode 和冻存盒列表对应关系
        notFullBoxes: []  // 未满冻存盒列表
      },  // 冻存盒列表
      transMails: [],  // 转运邮箱
      spemMails: [], // 样本邮箱
      projMails: [],  //项目邮箱
      previewModalData: {}
    },
    modalVisible: false,
    modalItem: {}, // 当前 modal 对象
    previewModalVisible: false,
  },

  subscriptions: {
    setup ({ dispatch, history }) {
      history.listen(location => {
        if (location.pathname === '/spem/transfer') {
          dispatch({
            type: 'query',
            payload: location.query,
          })

          dispatch({
            type: 'queryUnTransfers',
            payload: location.query,
          })

          dispatch({
            type: 'queryStatus',
            payload: {
              q: 'T001'
            }
          })

          dispatch({
            type: 'queryRccs',
            payload: {
              s: 'ac3'  // 查询标识
            }
          })

          dispatch({
            type: 'queryUsers',
            payload: {
              s: 'ac1',  // 查询标识
              setDefault: true
            }
          })

          dispatch({
            type: 'queryEmails',
          })
        }
      })
    },
  },

  effects: {

    *query ({ payload }, { call, put }) {
      const data = yield call(queryTransfers, payload)
      if (data) {
        yield put({
          type: 'querySuccess',
          payload: {
            list: data.list,
            pagination: {
              current: Number(payload.page) || 1,
              pageSize: Number(payload.pageSize) || 10,
              total: data.total,
            },
          },
        })
      }
    },

    *queryUnTransfers({ payload }, { call, put }) {
      const data = yield call(queryUnTransfer, payload)
      if (data) {
        yield put({
          type: 'queryUnTransferSuccess',
          payload: {
            siblingList: data.list,
            siblingPagination: {
              current: Number(payload.page) || 1,
              pageSize: Number(payload.pageSize) || 10,
              total: data.total,
            },
          },
        })
      }
    },

    *queryDetail ({ payload }, { call, put }) {
      const data = yield call(queryDetails, payload)
      const { transId } = payload
      if (data) {
        yield put({
          type: 'queryDetailSuccess',
          payload: {
            transId,
            result: data.array

          },
        })
      }
    },

    *queryStatus({ payload }, { call, put }) {
      const data = yield call(querySelect, payload)
      if (data) {
        yield put({
          type: 'queryStatusSuccess',
          payload: {
            statusList: data.array,
          },
        })
      }
    },

    *queryImages({ payload }, { call, put }) {
      const data = yield call(queryImages, payload)
      if (data) {
        yield put({
          type: 'showPreview',
          payload: {
            images: data.array
          }
        })
      }
    },

    *queryRccs({ payload }, { call, put }) {
      const data = yield call(queryAutoComplete, payload)
      if (data.success) {
        yield put({
          type: 'queryRccsSuccess',
          payload: {
            rccs: data.list
          }
        })
      } else {
        throw data.message
      }
    },

    *queryUsers({ payload }, { call, put, select }) {
      const data = yield call(queryAutoComplete, payload)
      const { setDefault } = payload
      const user = yield select(({ app }) => app.user)
      if (data.success) {
        yield put({
          type: 'queryUsersSuccess',
          payload: {
            users: data.list,
            setDefault: !!setDefault,
            user: {
              value: user.accountId,
              text: user.name
            }
          }
        })
      }
    },

    *queryEmails({ payload }, { call, put }) {
      const data = yield call(queryEmails, payload)
      if (data.success) {
        yield put({
          type: 'queryEmailsSuccess',
          payload: {
            ...payload,
            emails: data.array
          }
        })
      }
    },

    *createTransNo({ payload }, { call, select, put }) {
      const master = yield select(({ transfer }) => transfer.master)
      const { rccCode, dateStr } = payload
      let rccCodeAndDateStr;
      if (rccCode) {
        const dateStr = master.transNo.dateStr
        if (!dateStr) {
          message.error('请选择转运编号日期')
          return
        } else {
          rccCodeAndDateStr = rccCode + '-' + dateStr
        }
      } else {
        const rccCode = master.form.rccCode
        if (!rccCode) {
          message.error('请选择项目点')
          yield put({
            type: 'changeDate',
            payload: dateStr
          })
          return
        } else {
          rccCodeAndDateStr = rccCode + '-' + dateStr
        }
      }
      const data = yield call(queryTransNo, { rccCodeAndDateStr })
      if (data.success) {
        yield put({
          type: 'queryTransNoSuccess',
          payload: data
        })

      }
    },

    *createOrUpdateTransEmail({ payload }, { call, select, put }) {
      let modalItem = yield select(({ transfer }) => transfer.modalItem)
      let data;
      modalItem = { ...modalItem, ...payload }
      if (modalItem.id) {  // 修改
        data = yield call(updateEmails, modalItem)
      } else {  // 新增
        data = yield call(createEmails, modalItem)
      }
      if (data.success) {
        yield put({
          type: 'hideEmailModal',
        })
        yield put({
          type: 'queryEmails',
          payload: {
            type: modalItem.type
          }
        })
      }
    },

    *queryBoxes({ payload }, { call, select, put }) {
      const data = yield call(queryBoxes, payload);
      if (data.success) {
        yield put({
          type: 'queryBoxesSuccess',
          payload: {
            boxes: data.array
          }
        })
      }
    },

    *createTransfer({ payload }, { call, select, put }) {
      let master = yield select(({ transfer }) => transfer.master)
      let boxesGroupByLccCodeStr = master.boxes.boxesGroupByLccCodeStr
      const postData = master.previewModalData
      postData.boxesStr = boxesGroupByLccCodeStr
      // 将盒子按照 lccCode 分组

      const data = yield call(createTransfer, postData);
      if (data.success) {
        yield put({
          type: 'hidePreviewModal',
          payload: {
            isSuccess: true
          }
        })
        // 刷新详情页面
        yield put({
          type: 'query',
          payload: {},
        })

        yield put({
          type: 'queryUnTransfers',
          payload: {},
        })
      } else {
        throw data.message
      }
    },

    *deliver({ payload }, { call, put }) {
      const data = yield call(deliverTransfer, payload);
      if (data.success) {
        yield put({
          type: 'query',
          payload: {},
        })
      }
    }
  },

  reducers: {

    querySuccess (state, action) {
      const { list, pagination } = action.payload
      return {
        ...state,
        list,
        pagination: {
          ...state.pagination,
          ...pagination,
        }
      }
    },

    switchIsMotion (state) {
      localStorage.setItem('antdAdminUserIsMotion', !state.isMotion)
      return { ...state, isMotion: !state.isMotion }
    },

    queryUnTransferSuccess(state, action) {
      const { siblingList, siblingPagination } = action.payload
      return {
        ...state,
        siblingList,
        siblingPagination: {
          ...state.siblingPagination,
          ...siblingPagination,
        }
      }
    },

    queryDetailSuccess(state, action) {
      const { result, transId } = action.payload
      const { subList } = state
      subList[transId] = result
      return {
        ...state,
        subList
      }
    },

    queryStatusSuccess(state, action) {
      const { statusList } = action.payload
      return {
        ...state,
        statusList
      }
    },

    showPreview(state, action) {
      const { images } = action.payload
      const destImages = images.map(x => {
        return {
          src: preview + '?fileId=' + encodeURIComponent(x.filePath),
          fileId: x.filePath
        }
      })
      return {
        ...state,
        images: destImages,
        previewVisible: true
      }
    },

    hidePreview(state, action) {
      return {
        ...state,
        currentImage: 0,
        previewVisible: false,
        images: []
      }
    },

    showPreviewWithIndex(state, action) {
      const { index } = action.payload
      return {
        ...state,
        currentImage: index
      }
    },

    queryUsersSuccess(state, action) {
      const { users, user, setDefault } = action.payload
      const { master } = state
      if (setDefault) {
        users.push(user)
        master.form.createBy = user.value
        master.form.createByName = user.text
        master.user = user
      }
      master.users = users
      return {
        ...state,
        master
      }
    },

    queryRccsSuccess(state, action) {
      const { rccs } = action.payload
      const { master } = state
      rccs.forEach(x => {
        x.text = x.text + '(' + x.value + ')'
      })
      master.rccs = rccs
      return {
        ...state,
        master
      }
    },

    queryEmailsSuccess(state, action) {
      const { emails, type } = action.payload
      const { master } = state
      if (type === 1) { // 新增/修改邮箱
        master.transMails = []
      } else if (type === 2) {
        master.projMails = []
      } else if (type === 3) {
        master.spemMails = []
      } else {
        // 初始化
        master.transMails = []
        master.projMails = []
        master.spemMails = []
      }
      emails.forEach(email => {
        if (email.type === 1) {
          master.transMails.push(email)
        } else if (email.type === 2) {
          master.projMails.push(email)
        } else if (email.type === 3) {
          master.spemMails.push(email)
        }
      })
      return {
        ...state,
        master
      }
    },

    changeTransNo(state, action) {
      const { master } = state
      let isDisabled = master.transNo.disabled
      master.transNo.disabled = !isDisabled
      return {
        ...state,
        master
      }
    },

    changeCreateBy(state, action) {
      const { master } = state
      let isDisabled = master.createBy.disabled
      master.createBy.disabled = !isDisabled
      return {
        ...state,
        master
      }
    },

    changeDate(state, action) {
      const dateStr = action.payload
      const { master } = state
      master.transNo.dateStr = dateStr
      return {
        ...state,
        master
      }
    },

    queryTransNoSuccess(state, action) {
      const { master } = state
      const data = action.payload
      master.transNo = {
        prefix: data.prefix,
        dateStr: data.dateStr,
        suffix: data.suffix,
      }
      master.form.transNo = data.transNo
      master.form.rccCode = data.rccCode
      return {
        ...state,
        master
      }
    },

    hideEmailModal(state, action) {
      return {
        ...state,
        modalVisible: false,
        modalItem: {}
      }
    },

    showEmailModal(state, action) {
      const { item } = action.payload
      const { master } = state
      if (item.id) {
        if (item.type === 1) {
          item.email = master.transMails.filter(x => {
            return x.id === item.id
          })[0].email
        } else if (item.type === 2) {
          item.email = master.projMails.filter(x => {
            return x.id === item.id
          })[0].email
        } else if (item.type === 3) {
          item.email = master.spemMails.filter(x => {
            return x.id === item.id
          })[0].email
        }
      }
      return {
        ...state,
        modalItem: item,
        modalVisible: true
      }
    },

    queryBoxesSuccess(state, action) {
      const { boxes } = action.payload
      const { master } = state
      master.boxes.dataSource = []
      master.boxes.list = []
      master.boxes.tableDataSource = []
      boxes.forEach(box => {
        master.boxes.dataSource.push({
          key: box.boxCode,
          title: box.total === '100' ? (box.boxCode + ('(已满)')) : (box.boxCode + ('(未满)')),
          isFull: box.total === '100'
        })
      })
      master.boxes.list = boxes
      return {
        ...state,
        master
      }
    },

    showPreviewModal(state, action) {
      const data = action.payload
      const { master } = state
      master.previewModalData = data
      return {
        ...state,
        master,
        previewModalVisible: true,
      }
    },

    hidePreviewModal(state, action) {
      const { master } = state
      const { isSuccess } = action.payload
      if (isSuccess) {  // 保存数据成功,重置页面状态
        master.boxes = {
          dataSource: [],
          targetKeys: [],
          list: [],
          tableDataSource: [],
          boxesGroupByLccCodeStr: '',
          boxGroupByLccCode: {}
        }
        master.form.transNo = ''
        master.form.rccCode = ''
        master.transNo = {
          disabled: true,
          prefix: '',
          dateStr: moment().format('YYYYMMDD'),
          suffix: ''
        }
      }
      master.previewModalData = {}
      return {
        ...state,
        master,
        previewModalVisible: false,
      }
    },

    resetForm(state, action) {
      const { master } = state
      master.boxes = {
        dataSource: [],
        targetKeys: [],
        list: [],
        tableDataSource: [],
        boxesGroupByLccCodeStr: '',
        boxGroupByLccCode: {}
      }
      master.form.transNo = ''
      master.form.rccCode = ''
      master.transNo = {
        disabled: true,
        prefix: '',
        dateStr: moment().format('YYYYMMDD'),
        suffix: ''
      }
      master.users.push(master.user)
      return {
        ...state,
        master
      }
    },
    // 穿梭框改变列表
    changeBoxes(state, action) {
      const { targetKeys, direction, moveKeys } = action.payload
      const { master } = state
      master.boxes.notFullBoxes = []
      master.boxes.targetKeys = targetKeys
      // 将盒子按照 lccCode 分组
      let itemByLccCode = {}
      master.boxes.list.filter(x => {
        return lodash.includes(targetKeys, x.boxCode + '')  // 已选中的 box 对象
      }).forEach(x => {
        let lccCode = x.lccCode
        if (itemByLccCode[lccCode]) {
          itemByLccCode[lccCode].boxCount += 1
          itemByLccCode[lccCode].boxes.push(x.boxCode)
        } else {
          itemByLccCode[lccCode] = x
          itemByLccCode[lccCode].boxCount = 1
          itemByLccCode[lccCode].boxes = []
          itemByLccCode[lccCode].boxes.push(x.boxCode)
        }
      })
      let tableDatasource = []
      let boxesGroupByLccCode = '';
      let i = 1
      for (let lccCode in itemByLccCode) {
        let item = itemByLccCode[lccCode]
        item.index = i
        tableDatasource.push(item)
        boxesGroupByLccCode += itemByLccCode[lccCode].boxes.join(',')
        boxesGroupByLccCode += ';'
        i++
      }
      master.boxes.tableDataSource = tableDatasource
      master.boxes.boxesGroupByLccCodeStr = boxesGroupByLccCode
      master.boxes.boxGroupByLccCode = itemByLccCode
      return {
        ...state,
        master
      }
    },

    // TODO: 选择了未满冻存盒，反选插件有 bug
    unSelectNotFullBoxes(state, action) {
      const { unFullBoxes } = action.payload
      const { master } = state
      let  targetKeys = master.boxes.targetKeys
      lodash.remove(targetKeys, function (x) {
        console.log(lodash.includes(unFullBoxes, x))
        return lodash.includes(unFullBoxes, x)
      })
      master.boxes.targetKeys = targetKeys
      // 将盒子按照 lccCode 分组
      let itemByLccCode = {}
      master.boxes.list.filter(x => {
        return lodash.includes(targetKeys, x.boxCode + '')  // 已选中的 box 对象
      }).forEach(x => {
        let lccCode = x.lccCode
        if (itemByLccCode[lccCode]) {
          itemByLccCode[lccCode].boxCount += 1
          itemByLccCode[lccCode].boxes.push(x.boxCode)
        } else {
          itemByLccCode[lccCode] = x
          itemByLccCode[lccCode].boxCount = 1
          itemByLccCode[lccCode].boxes = []
          itemByLccCode[lccCode].boxes.push(x.boxCode)
        }
      })
      let tableDatasource = []
      let boxesGroupByLccCode = '';
      let i = 1
      for (let lccCode in itemByLccCode) {
        let item = itemByLccCode[lccCode]
        item.index = i
        tableDatasource.push(item)
        boxesGroupByLccCode += itemByLccCode[lccCode].boxes.join(',')
        boxesGroupByLccCode += ';'
        i++
      }
      master.boxes.tableDataSource = tableDatasource
      master.boxes.boxesGroupByLccCodeStr = boxesGroupByLccCode
      master.boxes.boxGroupByLccCode = itemByLccCode
      console.dir(master)
      return {
        ...state,
        master
      }
    }
  }
}
