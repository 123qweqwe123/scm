import React from 'react'
import PropTypes from 'prop-types'
import { Form, Input, Button, Icon, Modal, Upload, DatePicker } from 'antd'
import styles from './Modal.less'
import axios from 'axios'
import { api } from '../../../../utils/config'

const FormItem = Form.Item
const { common } = api
const { upload } = common

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 14,
  },
}

const modal = ({
  operatorItem,
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
      //  文件已上传到服务器，直接返回文件的 fileId
      if (data.file) {
        data.file = data.file.map(x => x.name + ',' + x.response).join(';')
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

  const formatFile = (e) => {
    if (Array.isArray(e)) {
      return e;
    }
    return e && e.fileList;
  }

  return (
    <Modal {...modalOpts}>
      <Form layout="horizontal">
        <FormItem label="选择文件" hasFeedback {...formItemLayout}>
          {getFieldDecorator('file', {
            valuePropName: 'fileList',
            getValueFromEvent: formatFile,
            rules: [
              {
                required: true,
                message: '上传文件不能为空!'
              },
            ],
          })(
            <Upload name="file"
                    action={upload}
                    listType="picture"
                    accept="image/*"
                    multiple
            >
              <Button>
                <Icon type="upload" /> 点击上传
              </Button>
            </Upload>
          )}
        </FormItem>

        <FormItem label="中心样本接收人" {...formItemLayout}>
          {getFieldDecorator('receiveOperator', {
            rules: [
              {
                required: true,
                message: '样本接收人不能为空!',
                whitespace: true
              },
            ],
          })(<Input />)}
        </FormItem>
        <FormItem label="接收日期" {...formItemLayout}>
          {getFieldDecorator('receiveDate', {
            rules: [
              {
                required: true,
                message: '接收日期不能为空!'
              },
            ],
          })(<DatePicker style={{ width: '100%' }} />)}
        </FormItem>
        <FormItem label="运单编号" {...formItemLayout}>
          {getFieldDecorator('checkinlistId', {
            rules: [
              {
                required: true,
                message: '运单号不能为空!',
                whitespace: true
              },
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
