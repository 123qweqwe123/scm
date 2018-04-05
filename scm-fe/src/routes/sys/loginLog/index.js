import React from 'react'
import PropTypes from 'prop-types'
import { connect } from 'dva'
import { routerRedux, browserHistory } from 'dva/router'
import { Tabs, Icon } from 'antd'
import List from './List'
import Filter from './Filter'

const TabPane = Tabs.TabPane;

const LoginLog = ({ location, dispatch, loginLog, loading }) => {
  const { list, pagination, isMotion, nameDataSource } = loginLog;
  const { pageSize } = pagination;

  const onTabChange = (key) => {
    if (key === '1'){
      browserHistory.push('/sys/datasync');
    }
  };

  const listProps = {
    dataSource: list,
    loading: loading.effects['loginLog/queryLoginLog'],
    pagination: pagination,
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
    nameDataSource,
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
    changeNameDataSource (val) {
      dispatch({
        type: 'loginLog/change',
        payload: {
          q: val, // 查询字符串
          s: 'ac1'  // 查询标识
        },
      })
    },
  };

  return (

    <div className="content-inner">
      <Tabs defaultActiveKey="2" onTabClick={e => onTabChange(e)}>
        <TabPane tab={<span><Icon type="sync" />数据同步</span>} key="1">
        </TabPane>
        <TabPane tab={<span><Icon type="lock" />登录日志</span>} key="2">
          <Filter {...filterProps} />
          <List {...listProps} />
        </TabPane>
      </Tabs>
    </div>
  )
};

LoginLog.propTypes = {
  dataSync: PropTypes.object,
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
};

export default connect(({ loginLog, loading }) => ({ loginLog, loading }))(LoginLog)
