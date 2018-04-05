import React from 'react'
import PropTypes from 'prop-types'
import { connect } from 'dva'
import { routerRedux, browserHistory } from 'dva/router'
import { Tabs, Icon } from 'antd'
import List from './List'
import Filter from './Filter'
import Modal from './Modal'

const TabPane = Tabs.TabPane;

const DataSync = ({ location, dispatch, dataSync, loading }) => {
  const { list, pagination, currentItem, modalVisible, confirmLoading, isMotion } = dataSync;
  const { pageSize } = pagination;
  const onTabChange = (key) => {
    if (key === '2'){
      browserHistory.push('/sys/loginlog');
    }
  };

  const listProps = {
    dataSource: list,
    loading: loading.effects['dataSync/query'],
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
    updateDataSync (record) {
      dispatch({
        type: 'dataSync/showModal',
        payload: {
          record,
        }
      })
    },
  };

  const filterProps = {
    isMotion,
    filter: {
      ...location.query,
    },
    onAdd () {
      dispatch({
        type: 'dataSync/showModal',
        payload: {
          record: {}
        }
      })
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

  const modalProps = {
    modalItem: currentItem,
    visible: modalVisible,
    confirmLoading: confirmLoading,
    onCancel () {
      dispatch({
        type: 'dataSync/hideModal',
      })
    },
    onOk (data) {
      dispatch({
        type: 'dataSync/createOrUpdate',
        payload: {
          taskName: data.taskName,
          cronExp: data.cronExp,
          isValid: data.isValid,
          id: data.id
        }
      })
    }
  };

  return (
    <div className="content-inner">
      <Tabs defaultActiveKey="1" onTabClick={e => onTabChange(e)}>
        <TabPane tab={<span><Icon type="sync" />数据同步</span>} key="1">
          <Filter {...filterProps} />
          <List {...listProps} />
          {modalVisible && <Modal {...modalProps} />}
        </TabPane>
        <TabPane tab={<span><Icon type="lock" />登录日志</span>} key="2">
        </TabPane>
      </Tabs>
    </div>
  )
};

DataSync.propTypes = {
  dataSync: PropTypes.object,
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
};

export default connect(({ dataSync, loading }) => ({ dataSync, loading }))(DataSync)
