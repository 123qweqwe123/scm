import React from 'react'
import PropTypes from 'prop-types'
import { routerRedux } from 'dva/router'
import { connect } from 'dva'
import { message } from 'antd'
import Modal from './Modal'
import List from './List'

const DictVersion = ({ location, dispatch, dictVersion, loading }) => {

  const { list, logList, pagination, modalVisible, isMotion, currentItem, updateId, isDisable, isUpload } = dictVersion

  const listProps = {
    isMotion,
    logList,
    pagination,
    dataSource: list,
    location,
    loading: loading.effects['dictVersion/query'],
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
    download (fileId) {
      dispatch({
        type: 'app/download',
        payload: { fileId }
      })
    },
    onExpand(isExpand, record) {
      if (isExpand) {
        dispatch({
          type: 'dictVersion/queryVersionLog',
          payload: { dictType: record.dictType }
        })
      }
    },
    updateDict (record) {
      dispatch({
        type: 'dictVersion/showModal',
        payload: {
          id: record.id,
          isUpload: false,
        },
      })
    }
  }

  const modalProps = {
    isDisable,
    currentItem,
    isUpload,
    visible: modalVisible,
    onOk (data) {
      if (!isUpload) {
        message.error('请选择需要上传的文件');
        return
      }
      const { file } = data.file;
      dispatch({
        type: 'dictVersion/updateVersion',
        payload: {
          id: updateId,
          fileId: file.response,
          remark: data.remark,
        },
      })
    },
    onCancel () {
      dispatch({
        type: 'dictVersion/hideModal',
      })
    },
    onAble () {
      dispatch({
        type: 'dictVersion/isAble',
      })
    },
    onDisable () {
      dispatch({
        type: 'dictVersion/isDisable',
      })
    },
    changeUpload (isUpload) {
      dispatch({
        type: 'dictVersion/changeUpload',
        payload: {
          isUpload: isUpload,
        }
      })
    }
  }

  return (
    <div className="content-inner">
      <List {...listProps} />
      {modalVisible && <Modal {...modalProps} />}
    </div>
  )

}

DictVersion.propTypes = {
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
  dictVersion: PropTypes.object,
}

export default connect(({ dictVersion, loading }) => ({ dictVersion, loading }))(DictVersion)
