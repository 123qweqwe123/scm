import { queryDictVersions, update } from '../../services/dict/version'

export default {

  namespace: 'versionMaintain',

  state: {
    list: [],
    isMotion: false,
    pagination: {
      showSizeChanger: true,
      showQuickJumper: true,
      showTotal: total => `共 ${total} 条`,
      current: 1,
      size: 'small',
      total: null,
    },
  },

  subscriptions: {
    setup ({ dispatch, history }) {
      history.listen(location => {
        if (location.pathname === '/dict/versionmaintain') {
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
      payload = {...payload};
      const data = yield call(queryDictVersions, payload);
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

    *updateVersion ({ payload }, { call, put }) {
      const data = yield call(update, payload);
      if (data.success) {
        yield put({
          type: 'query',
          payload: {
            page: Number(payload.page) || 1,
            pageSize: Number(payload.pageSize) || 10,
          }
        })
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
        },
      }
    },
  },


}
