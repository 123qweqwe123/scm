import React from 'react'
import PropTypes from 'prop-types'
import { Form, Input, Modal, Select, TreeSelect } from 'antd'
import arrToTree from "array-to-tree"
import axios from 'axios'

const FormItem = Form.Item;
const Option = Select.Option;

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 14,
  },
}

const modal = ({
  treeData,
  modalItem,
  parentCode,
  onOk,
  changeParentCode,
  onCancel,
  status,
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
      if (fields.vcode === modalItem.vcode
        && fields.vname === modalItem.vname
        && fields.remark === modalItem.remark
        && fields.parentId === modalItem.parentId
      ) {
        onCancel();
      } else {
        const data = {
          ...modalItem,
          ...getFieldsValue(),
          updateDate: null,
          createDate: null,
        };
        onOk(data)
      }
    })
  };

  const modalOpts = {
    ...modalProps,
    title: modalItem.vcode?'修改错误编码':'新增错误编码',
    closable: false,
    maskClosable: false,
    onOk: handleOk,
    onCancel: onCancel,
    confirmLoading: status,
  }

  const validateVcode = (rule, value, callback) => {
    if (modalItem.id && modalItem.vcode === value) {
      callback()
      return
    }
    axios.get('/dict/bioErCode/validationVcode',
      { params: { vcode: value } }).then(function (data) {
      changeParentCode(value);
      callback();
    }, function (error) {
      rule.message = error.response.data
      callback(new Error(error.response.data))
    })
  }

  return (
    <Modal layout="horizontal" {...modalOpts}>
      <FormItem label="错误编码" hasFeedback {...formItemLayout}>
        {getFieldDecorator('vcode', {
          initialValue: modalItem.vcode || '',
          rules: [
            {
              required: true,
              message: '错误编码不能为空!',
              whitespace: true
            },
            {
              validator: validateVcode
            }
          ],
        })(<Input />)}
      </FormItem>

      <FormItem label="错误名称" {...formItemLayout}>
        {getFieldDecorator('vname', {
          initialValue: modalItem.vname || '',
          rules: [
            {
              required: true,
              message: '错误名称不能为空!',
              whitespace: true
            },
          ],
        })(<Input />)}
      </FormItem>

      <FormItem label="校验级别" {...formItemLayout}>
        {getFieldDecorator( 'checkLevel', { initialValue: modalItem.checkLevel ? modalItem.checkLevel.toString() : '2',
          rules: [
            {
              required: true,
              message: '请选择校验级别!',
              whitespace: true
            },
          ],
        } )(
          <Select style={{ width: '100%' }} disabled={true}>
            <Option key='1'>系统级</Option>
            <Option key='2'>人工级</Option>
            <Option key='3'>混合级</Option>
          </Select>)}
      </FormItem>

      <FormItem label="父名称" {...formItemLayout}>
        {getFieldDecorator('parentId', {
          initialValue: parentCode,
        })(
          <TreeSelect
            style={{ width: '100%' }}
            allowClear
            disabled={true}
            dropdownStyle={{ maxHeight: 400, overflow: 'auto' }}
            treeData={arrToTree(treeData, { parentProperty: 'parentId', customID: 'value', rootId: 1 })}
            dropdownMatchSelectWidth
          />
        )}
      </FormItem>

      <FormItem label="备注" {...formItemLayout}>
        {getFieldDecorator('remark', {
          initialValue: modalItem.remark || ''
        })(<Input type="textarea" rows={3} />)}
      </FormItem>
    </Modal>
  )
}

modal.propTypes = {
  form: PropTypes.object.isRequired,
  modalItem: PropTypes.object,
  onOk: PropTypes.func,
  onCancel: PropTypes.func,
}

export default Form.create()(modal)
