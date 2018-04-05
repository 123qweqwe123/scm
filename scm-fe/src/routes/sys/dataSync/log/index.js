import React from 'react'
import PropTypes from 'prop-types'
import { connect } from 'dva'
import { routerRedux } from 'dva/router'
import List from './List'
import Filter from './Filter'

const DataSyncLog = ({ location, dispatch, dataSyncLog, loading }) => {
  const { list, pagination, isMotion } = dataSyncLog;
  const { pageSize } = pagination;

  const listProps = {
    dataSource: list,
    loading: loading.effects['dataSyncLog/query'],
    pagination,
    location,
    isMotion,
    onChange (page) {
      const { query, pathname } = location;
      dispatch(routerRedux.push({
        pathname,
        query: {
          ...query,
          page: page.current,
          pageSize: page.pageSize,
        },
      }))
    },
  };

  const filterProps = {
    isMotion,
    filter: {
      ...location.query,
    },
    onSearch (value) {
      dispatch(routerRedux.push({
        pathname: location.pathname,
        query: {
          ...value,
          page: 1,
          pageSize: pageSize,
        },
      }))
    },
  };

  return (
    <div className="content-inner">
      <Filter {...filterProps} />
      <List {...listProps} />
    </div>
  )
};

DataSyncLog.propTypes = {
  dataSync: PropTypes.object,
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
};

export default connect(({ dataSyncLog, loading }) => ({ dataSyncLog, loading }))(DataSyncLog)
