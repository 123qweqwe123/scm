import { queryLogs } from '../../../services/sys/dataSync'
import pathToRegexp from 'path-to-regexp'

export default {

  namespace: 'dataSyncLog',

  state: {
    list: [],
    isMotion: true,
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
        const match = pathToRegexp('/sys/datasync/:syncId').exec(location.pathname)
        if (location.pathname === '/sys/datasync/' + match[1]) {
          dispatch({
            type: 'query',
            payload: {...location.query, syncId: match[1]}
          })
        }
      })
    },
  },

  effects: {

    *query ({ payload }, { call, put }) {
      const data = yield call(queryLogs, payload);
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

  },

}
