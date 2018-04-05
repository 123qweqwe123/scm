import React from 'react'
import PropTypes from 'prop-types'
import { Form, Input, Radio, Modal, Select } from 'antd'
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

  const validateEmail = (rule, value, callback) => {
    if (modalItem.email === value) {
      callback()
      return
    }
    axios.get('/spem/transfers/emailValidation',
      { params: { q: value, type: modalItem.type } }).then(function (data) {
      callback();
    }, function (error) {
      rule.message = error.response.data
      callback(new Error(error.response.data))
    })
  }

  return (
    <Modal {...modalOpts}>
      <Form layout="horizontal">
        <FormItem label="邮箱" hasFeedback {...formItemLayout}>
          {getFieldDecorator('email', {
            initialValue: modalItem.email,
            rules: [
              {
                type: 'email',
                message: '邮箱格式错误'
              },
              {
                required: true,
                message: '请输入邮箱',
                whitespace: true
              }, {
                validator: validateEmail
              }
            ],
          })(<Input />)}
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
