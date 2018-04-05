import React from 'react'
import PropTypes from 'prop-types'
import { Form, Input, Radio, Modal, Select } from 'antd'
import styles from './Modal.less'
import axios from 'axios'

const FormItem = Form.Item

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 14,
  },
}

const modal = ({
  modalItem,
  onOk,
  formItem,
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
      onOk(data)
    })
  }

  const modalOpts = {
    ...modalProps,
    onOk: handleOk,
  }

  const validateLinkName = (rule, value, callback) => {
    if (modalItem.linkName === value) {
      callback()
      return
    }
    axios.get('/spem/transfers/linkNameValidation',
      { params: { q: value, type: modalItem.linkType, lccCode: formItem.lccCode } }).then(function (data) {
      callback();
    }, function (error) {
      rule.message = error.response.data
      callback(new Error(error.response.data))
    })
  }

  return (
    <Modal {...modalOpts}>
      <Form layout="horizontal">
        <FormItem label="姓名" hasFeedback {...formItemLayout}>
          {getFieldDecorator('linkName', {
            initialValue: modalItem.linkName,
            rules: [
              {
                required: true,
                message: '姓名不能为空!',
                whitespace: true
              }, {
                validator: validateLinkName
              }
            ],
          })(<Input />)}
        </FormItem>

        {modalItem.linkType !== 3 &&
        <FormItem label="电话" {...formItemLayout}>
          {getFieldDecorator('phone', {
            initialValue: modalItem.phone,
          })(<Input />)}
        </FormItem>}
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
