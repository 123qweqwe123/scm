import { query, createOrUpdate, queryLoginLog } from '../../services/sys/dataSync'

export default {

  namespace: 'dataSync',

  state: {
    list: [],
    currentItem: {},
    modalVisible: false,
    isMotion: true,
    confirmLoading: false,
    pagination: {
      showSizeChanger: true,
      showQuickJumper: true,
      showTotal: total => `共 ${total} 条`,
      current: 1,
      total: null,
    },
  },

  subscriptions: {
    setup ({ dispatch, history }) {
      history.listen(location => {
        if (location.pathname === '/sys/datasync') {
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
      const data = yield call(query, payload);
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

    *createOrUpdate ({ payload }, { call, put }) {
      yield put({
        type: 'changeBtnStatus',
        payload: {
          status: true,
        }
      });
      const data = yield call(createOrUpdate, payload);
      if (data.success) {
        yield put({
          type: 'hideModal',
        });
        yield put({
          type: 'changeBtnStatus',
          payload: {
            status: false,
          }
        });
        yield put({
          type: 'query',
          payload: {
            page: Number(payload.page) || 1,
            pageSize: Number(payload.pageSize) || 10,
          }
        });
      }
    },

  },

  reducers: {

    querySuccess (state, action) {
      const { list, pagination } = action.payload;
      return {
        ...state,
        list,
        pagination: {
          ...state.pagination,
          ...pagination,
        }
      }
    },

    showModal (state, action) {
      const { record } = action.payload;
      return {
        ...state,
        modalVisible: true,
        currentItem: record,
      }
    },

    hideModal (state) {
      return { ...state, modalVisible: false }
    },

    changeBtnStatus (state, action) {
      const { status } = action.payload;
      return { ...state, confirmLoading: status }
    },

  },

}
