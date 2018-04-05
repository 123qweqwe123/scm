import React from 'react'
import PropTypes from 'prop-types'
import { routerRedux } from 'dva/router'
import { connect } from 'dva'
import List from './List'
import Filter from './Filter'
import moment from 'moment'
import { Modal } from 'antd'
import lodash from 'lodash'
import  LinkManModal  from './Modal'
import UploadModal from './UploadModal'
import AddBoxModal from './AddBoxModal'
import { isEqual } from '../../../../utils'


const SpemTransferDetail = ({ location, dispatch, transferDetail, loading }) => {
  const {
    list, item, formItem, itemSelected,
    modalVisible, modalType, modalItem,
    itemSwitched, formChanged,
    planGetMen, link1Men, link2Men,
    uploadModalVisible, operatorItem,
    previewVisible,
    addBoxModalVisible, unselectedBoxes,
    boxesByDetailId

  } = transferDetail

  let filter; // 引用纯组件

  const listProps = {
    location,
    item,
    itemSelected,
    formChanged,
    boxesByDetailId,
    dataSource: list,
    onRowClick(record, index) {
      // TODO:实现点击行时根据 form 的变化提示是否保存或者丢弃 form 的变化的数据(主要问题是不能在 form 组件外部调用 form 的resetFields)
      // 检测到数据变化
      if (formChanged) {

        Modal.confirm({
          title: 'Confirm',
          content: '检测到行数据已经发生改变，请保存数据或者丢弃更改!',
          okText: '保存',
          cancelText: '丢弃',
          onOk() {
            dispatch({
              type: 'transferDetail/update',
            })
            filter.resetFields()
          },
          onCancel() {
            // 同步执行
            filter.resetFields()
            dispatch({
              type: 'transferDetail/resetForm',
            })
          }
        });
        return
      }
      filter.resetFields()
      dispatch({
        type: 'transferDetail/changeState',
        payload: {
          record
        }
      })
      // 初始化主联系人和备用联系人
      dispatch({
        type: 'transferDetail/queryLinkMen',
        payload: {
          linkType: 1,
        }
      })
    },

    showUploadModal(record) {
      dispatch({
        type: 'transferDetail/showUploadModal',
        payload: {
          operatorItem: record
        }
      })
    },
    showAddBoxModal(record) {
      dispatch({
        type: 'transferDetail/queryUnselectedBoxes',
        payload: {
          record
        }
      })
    },
    loading: loading.effects['transferDetail/query'],
  }

  const filterProps = {
    item,
    formItem,
    itemSwitched,
    formChanged,
    itemSelected,
    planGetMen,
    link1Men,
    link2Men,
    onSubmit(){
      dispatch({
        type: 'transferDetail/update',
      })

    },
    onFilterChange (value) {
      dispatch(routerRedux.push({
        pathname: location.pathname,
        query: {
          ...value,
        },
      }))
    },
    onResetForm () {
      dispatch({
        type: 'transferDetail/resetForm',
      })
    },
    showModal(props) {
      dispatch({
        type: 'transferDetail/showModal',
        payload: props
      })
    },
    // 校验表单的数据是否发生改变
    onFieldChange(props, fields){
      // 如果是重置，fields 是一个数组，但是只有 name 属性
      const fieldName = Object.keys(fields)[0];
      const fieldValue = fields[fieldName].value
      const { formItem, item } = props

      // 这个获取的是原始
      const cloneFormItem = lodash.cloneDeep(formItem)
      cloneFormItem[fieldName] = fieldValue
      let formChanged = false
      for (let x in cloneFormItem) {
        if (!isEqual(cloneFormItem[x], item[x])) {
          formChanged = true
          break
        }
      }

      // 如果是重置,fields={field1:{name:'name1'},field2:{name:'name2'}}
      // 非重置 fields={field1:{name:'name1',value:''}} 非重置有 value 属性
      if (!fields[fieldName].hasOwnProperty('value')) {
        formChanged = false
      }
      formItem[fieldName] = fieldValue
      dispatch({
        type: 'transferDetail/isFormChanged',
        payload: {
          formChanged
        }
      })
    },
  }

  const modalProps = {
    modalItem,
    formItem,
    visible: modalVisible,
    maskClosable: false,
    confirmLoading: loading.effects['transferDetail/updateLinkMan'],
    title: modalItem.title,
    wrapClassName: 'vertical-center-modal',
    onOk (data) {
      data.linkType = modalItem.linkType
      dispatch({
        type: `transferDetail/createOrUpdateLinkMan`,
        payload: data,
      })
      // 将表单的值设置为添加/修改之后的值
      filter.setFieldsValue({ [modalItem.field]: data.linkName })
      if (data.linkType === 1) {
        filter.setFieldsValue({ link1Tel: data.phone })
      } else if (data.linkType === 2) {
        filter.setFieldsValue({ link2Tel: data.phone })
      }
    },
    onCancel () {
      dispatch({
        type: 'transferDetail/hideModal',
      })
    },
  }

  const uploadModalProps = {
    operatorItem,
    title: '上传运单',
    visible: uploadModalVisible,
    maskClosable: false,
    wrapClassName: 'vertical-center-modal',
    onOk (data) {
      dispatch({
        type: `transferDetail/uploadTransferDetail`,
        payload: data,
      })
    },
    onCancel() {
      dispatch({
        type: 'transferDetail/hideUploadModal',
      })
    }
  }

  const addBoxModalProps = {
    operatorItem,
    unselectedBoxes,
    title: '补录',
    visible: addBoxModalVisible,
    maskClosable: false,
    wrapClassName: 'vertical-center-modal',
    onOk (data) {
      dispatch({
        type: `transferDetail/addTransferDetail`,
        payload: data,
      })
    },
    onCancel() {
      dispatch({
        type: 'transferDetail/hideAddBoxModal',
      })
    }
  }

  return (
    <div className="content-inner">
      <Filter {...filterProps} ref={el => filter = el} />
      <List {...listProps} />
      {modalVisible && <LinkManModal {...modalProps} />}
      {uploadModalVisible && <UploadModal {...uploadModalProps} />}
      {addBoxModalVisible && <AddBoxModal {...addBoxModalProps} />}
    </div>
  )
}

SpemTransferDetail.propTypes = {
  location: PropTypes.object,
  dispatch: PropTypes.func,
  loading: PropTypes.object,
}

export default connect(({ transferDetail, loading }) => ({ transferDetail, loading }))(SpemTransferDetail)
