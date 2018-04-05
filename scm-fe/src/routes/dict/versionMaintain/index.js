import React from 'react'
import PropTypes from 'prop-types'
import { routerRedux } from 'dva/router'
import { connect } from 'dva'
import List from './List'

const VersionMaintain = ({ location, dispatch, versionMaintain, loading }) => {

  const { list, pagination, isMotion } = versionMaintain;

  const listProps = {
    isMotion,
    pagination,
    dataSource: list,
    location,
    loading: loading.effects['versionMaintain/query'],
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
    updateDictVersion (id) {
      dispatch({
        type: 'versionMaintain/updateVersion',
        payload: {
          id,
        },
      })
    }
  };

  return (
    <div className="content-inner">
      <List {...listProps} />
    </div>
  )

};

VersionMaintain.propTypes = {
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
  versionMaintain: PropTypes.object,
};

export default connect(({ versionMaintain, loading }) => ({ versionMaintain, loading }))(VersionMaintain)
