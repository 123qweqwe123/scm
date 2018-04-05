import React from 'react'
import PropTypes from 'prop-types'
import { routerRedux } from 'dva/router'
import { connect } from 'dva'
import Filter from './Filter'
import List from './List'
import Modal from './Modal'

const DictBioErCode = ({ location, dispatch, dictBioErCode, loading }) => {

  const { list, treeData, parentCode, pagination, modalVisible, isMotion, currentItem, confirmLoading } = dictBioErCode
  const { pageSize } = pagination

  const filterProps = {
    filter: {
      ...location.query,
    },
    onAdd () {
      dispatch({
        type: 'dictBioErCode/queryTreeData',
      });
      dispatch({
        type: 'dictBioErCode/showModal',
        payload: {
          record: {}
        }
      })
    },
    onFilterChange (value) {
      dispatch(routerRedux.push({
        pathname: location.pathname,
        query: {
          ...value,
          page: 1,
          pageSize: pageSize,
        },
      }))
    },
  }

  const listProps = {
    isMotion,
    pagination,
    dataSource: list,
    location,
    loading: loading.effects['dictBioErCode/query'],
    onChange (page) {
      const { query, pathname } = location
      dispatch(routerRedux.push({
        pathname,
        query: {
          ...query,
          page: page.current,
          pageSize: page.pageSize,
        },
      }))
    },
    updateErrCode (e, record) {
      dispatch({
        type: 'dictBioErCode/queryTreeData',
      });
      dispatch({
        type: 'dictBioErCode/showModal',
        payload: {
          record,
        }
      })
    },
    deleteErrCode (id) {
      dispatch({
        type: 'dictBioErCode/createOrUpdate',
        payload: {
          isRemoved: 1,
          id,
        }
      })
    }
  }

  const modalProps = {
    treeData,
    parentCode,
    modalItem: currentItem,
    visible: modalVisible,
    status: confirmLoading,
    onCancel () {
      dispatch({
        type: 'dictBioErCode/hideModal',
      })
    },
    changeParentCode (value) {
      const tmpCode = value.slice(0,1);
      if(tmpCode !== parentCode) {
        dispatch({
          type: 'dictBioErCode/changeParentCode',
          payload: {
            parentCode: tmpCode,
          }
        })
      }
    },
    onOk (data) {
      dispatch({
        type: 'dictBioErCode/changeLoadingStatus',
        payload: {
          status: true,
        }
      })
      dispatch({
        type: 'dictBioErCode/createOrUpdate',
        payload: {
          ...data,
        }
      })
    }
  }

  return (
    <div className="content-inner">
      <Filter {...filterProps} />
      <List {...listProps} />
      {modalVisible && <Modal {...modalProps} />}
    </div>
  )

}

DictBioErCode.propTypes = {
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
  dictBioErCode: PropTypes.object,
}

export default connect(({ dictBioErCode, loading }) => ({ dictBioErCode, loading }))(DictBioErCode)
