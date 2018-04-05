import React from 'react'
import PropTypes from 'prop-types'
import { Form, Input, Transfer, Modal, message } from 'antd'
import lodash from 'lodash'

const FormItem = Form.Item

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 14,
  },
}

const formItemLayout1 = {
  wrapperCol: {
    offset: 1,
    span: 23,
  },
}
//
const modal = ({
  operatorItem,
  unselectedBoxes,
  onOk,
  form: {
    getFieldDecorator,
    validateFields,
    getFieldsValue,
  },
  ...modalProps
}) => {
  const handleOk = () => {
    validateFields((errors) => {
      if (errors) {
        return
      }
      const data = {
        ...getFieldsValue(),
      }
      data.detailId = operatorItem.id
      data.transId = operatorItem.masterId
      onOk(data)
    })
  }

  const modalOpts = {
    ...modalProps,
    onOk: handleOk,
  }

  const handlerChange = (targetKeys, direction, moveKeys) => {
    if (direction === 'right') {
      unselectedBoxes.dataSource.filter(x => {
        if (lodash.includes(moveKeys, x.key) && !x.isFull) {

        }
      })
    }
    unselectedBoxes.targetKeys = targetKeys
  }

  const clickItem = (e, item) => {
    if (!item.isFull) {
      message.error("您选择了未满冻存盒" + item.key, 3)
    }
  }

  return (
    <Modal {...modalOpts}>
      <Form layout="horizontal">
        <FormItem label="转运编号" {...formItemLayout}>
          {getFieldDecorator('receiveOperator', {
            initialValue: operatorItem.transNo
          })(<Input disabled />)}
        </FormItem>
        <FormItem label="任务创建人" {...formItemLayout}>
          {getFieldDecorator('receiveDate', {
            initialValue: operatorItem.createUserName
          })(<Input disabled />)}
        </FormItem>
        <FormItem label="取样项目单位" {...formItemLayout}>
          {getFieldDecorator('checkinlistId', {
            initialValue: operatorItem.lccName
          })(<Input disabled />)}
        </FormItem>
        <FormItem {...formItemLayout1}>
          {getFieldDecorator('boxes', {})(
            <Transfer
              showSearch
              dataSource={unselectedBoxes.dataSource}
              notFoundContent="列表为空"
              searchPlaceholder="请输入搜索内容"
              titles={['未选中列表', '已选中列表']}
              render={item => (
                <span onClick={(e) => {
                  clickItem(e, item)
                }}>
                  {item.title}
              </span>)}
              targetKeys={unselectedBoxes.targetKeys}
              onChange={handlerChange}
            />
          )}
        </FormItem>
      </Form>
    </Modal>
  )
}

modal.propTypes = {
  form: PropTypes.object.isRequired,
  item: PropTypes.object,
  onOk: PropTypes.func,
}

export default Form.create()(modal)
