import { queryErrorCodes, createOrUpdate, queryErrCodeTree } from '../../services/dict/bioErrCode'

export default {

  namespace: 'dictBioErCode',

  state: {
    list: [],
    treeData: [],
    parentCode: '',
    currentItem: {},
    updateId: null,
    confirmLoading: false,
    pagination: {
      showSizeChanger: true,
      showQuickJumper: true,
      showTotal: total => `共 ${total} 条`,
      current: 1,
      size: 'small',
      total: null,
    },
    modalVisible: false,
  },

  subscriptions: {
    setup ({ dispatch, history }) {
      history.listen(location => {
        if (location.pathname === '/dict/bioerrcode') {
          dispatch({
            type: 'query',
            payload: location.query,
          })
        }
      })
    },
  },

  effects: {

    *query ({ payload }, { call, put }) {
      const data = yield call(queryErrorCodes, payload);
      if (data) {
        yield put({
          type: 'querySuccess',
          payload: {
            list: data.array,
            pagination: {
              current: Number(payload.page) || 1,
              pageSize: Number(payload.pageSize) || 10,
              total: data.total,
            },
          },
        })
      }
    },

    *createOrUpdate ({ payload }, { call, put }) {
      const data = yield call(createOrUpdate, payload);
      if (data.success) {
        yield put({
          type: 'hideModal',
        })
        yield put({
          type: 'query',
          payload: {
            page: Number(payload.page) || 1,
            pageSize: Number(payload.pageSize) || 10,
          }
        })
        yield put({
          type: 'changeLoadingStatus',
          payload: {
            status: false,
          }
        })
      }
    },

    *queryTreeData ({ payload }, { call, put }) {
      const data = yield call(queryErrCodeTree, payload)
      if (data) {
        yield put({
          type: 'queryTreeDataSuccess',
          payload: {
            treeData: data.array
          },
        })
      }
    },

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
        },
      }
    },

    queryTreeDataSuccess (state, action) {
      const { treeData } = action.payload
      return {
        ...state,
        treeData
      }
    },

    showModal (state, action) {
      const { record } = action.payload;
      const parentCode = record.vcode ? record.vcode.slice(0,1) : '';
      return {
        ...state,
        modalVisible: true,
        currentItem: record,
        parentCode,
      }
    },

    hideModal (state) {
      return { ...state, modalVisible: false }
    },

    changeLoadingStatus (state, action) {
      const { status } = action.payload
      return { ...state, confirmLoading: status }
    },

    changeParentCode (state, action) {
      const { parentCode } = action.payload
      return { ...state, parentCode }
    },

  },


}
