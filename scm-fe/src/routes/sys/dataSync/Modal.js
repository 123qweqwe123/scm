import React from 'react'
import PropTypes from 'prop-types'
import { Form, Input, Modal, Select } from 'antd'

const FormItem = Form.Item;
const Option = Select.Option;

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 14,
  },
};

const modal = ({
  modalItem,
  onOk,
  onCancel,
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
      /*判断是否修改过内容，没有修改则不提交*/
      const fields = getFieldsValue();
      if (fields.taskName === modalItem.taskName
        && fields.cronExp === modalItem.cronExp
        && fields.isValid === modalItem.isValid.toString()) {
        onCancel();
      } else {
        const data = {
          ...modalItem,
          ...getFieldsValue(),
        };
        onOk(data)
      }
    })
  };

  const modalOpts = {
    ...modalProps,
    title: modalItem.taskName ? '修改同步数据同步信息':'新增数据同步',
    closable: false,
    maskClosable: false,
    onOk: handleOk,
    onCancel: onCancel,
  };

  return (
    <Modal layout="horizontal" {...modalOpts}>
      <FormItem label="任务名称" {...formItemLayout}>
        {getFieldDecorator('taskName', {
          initialValue: modalItem.taskName || '',
          rules: [
            {
              required: true,
              message: '任务名称不能为空!',
              whitespace: true
            },
          ],
        })(<Input />)}
      </FormItem>

      <FormItem label="cron表达式" {...formItemLayout}>
        {getFieldDecorator('cronExp', {
          initialValue: modalItem.cronExp || '',
          rules: [
            {
              required: true,
              message: 'cron表达式不能为空!',
              whitespace: true
            },
          ],
        })(<Input />)}
      </FormItem>

      <FormItem label="是否有效" {...formItemLayout}>
        {getFieldDecorator( 'isValid', { initialValue: modalItem.isValid ? modalItem.isValid.toString() : '1' } )(
          <Select style={{ width: '100%' }}>
            <Option key="1">有效</Option>
            <Option key="2">无效</Option>
          </Select>)}
      </FormItem>
    </Modal>
  )
};

modal.propTypes = {
  form: PropTypes.object.isRequired,
  modalItem: PropTypes.object,
  onOk: PropTypes.func,
  onCancel: PropTypes.func,
};

export default Form.create()(modal)
