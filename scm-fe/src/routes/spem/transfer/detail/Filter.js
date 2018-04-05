import React from 'react'
import PropTypes from 'prop-types'
import { Form, DatePicker, Button, Row, Col, Input, Select, Icon, Modal, message } from 'antd'
import styles from './Filter.less'
import moment from 'moment'
import { isEqual, isEmpty } from '../../../../utils'
import lodash from 'lodash'

const FormItem = Form.Item
const Option = Select.Option

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 16,
  }
}

const formRemarkLayout = {
  labelCol: {
    span: 3,
  },
  wrapperCol: {
    span: 20,
  }
}

const Filter = ({
  item,
  formItem,
  showModal,
  planGetMen,
  link1Men,
  link2Men,
  formChanged,
  itemSelected,
  onResetForm,
  onSubmit,
  form: {
    getFieldDecorator,
    getFieldValue,
    setFieldsValue,
    resetFields
  },
}) => {

  const handleSubmit = () => {
    // 判断当前值是否已经改变
    onSubmit()
    resetFields()
  }


  const reset = () => {
    resetFields()
    onResetForm()
  }

  // 修改取样人同步修改取样人的 ID
  const changePlanGetManName = (value) => {
    let planGetManId = planGetMen.filter(x => lodash.includes(value, x.linkName)).map(e => e.id).join(',')
    setFieldsValue({ planGetManId })
  }
  const changeLink1Man = (value) => {
    let currLinkMan = link1Men.filter(x => x.linkName === value)[0]
    setFieldsValue({ link1Tel: currLinkMan ? currLinkMan.phone : '' })
  }

  const changeLink2Man = (value) => {
    let currLinkMan = link2Men.filter(x => x.linkName === value)[0]
    setFieldsValue({ link2Tel: currLinkMan ? currLinkMan.phone : '' })
  }

  const modalItem = {
    1: { title: '添加取样人', linkType: 3, field: 'planGetManName' },
    2: {
      title: '修改取样人', linkType: 3,
      field: 'planGetManName',
      linkName: getFieldValue('planGetManName'),
    },
    3: { title: '添加主联系人', linkType: 1, field: 'link1Man' },
    4: {
      title: '修改主联系人', linkType: 1,
      field: 'link1Man',
      linkName: getFieldValue('link1Man'),
      phone: getFieldValue('link1Tel'),
    },
    5: { title: '添加备用联系人', linkType: 2, field: 'link2Man' },
    6: {
      title: '修改备用联系人', linkType: 2,
      field: 'link2Man',
      linkName: getFieldValue('link2Man'),
      phone: getFieldValue('link2Tel')
    },
  }


  const updateLinkMan = (type) => {
    let currItem = modalItem[type]
    let value = getFieldValue(currItem.field);
    if (value instanceof Array && value.length > 1) {
      message.error("只能选择单条记录修改")
      return
    }
    if (lodash.has(currItem, 'linkName') && isEmpty(value)) {
      message.error("请选择需要修改的数据")
      return
    }
    if (value instanceof Array) {
      currItem.linkName = value[0]
    }
    showModal(currItem)
  }

  const strToArray = x => {
    if (x instanceof Array) {
      return x
    } else {
      return x.split(',')
    }
  }

  return (
    <Form layout="horizontal" className={styles.form}>
      <Row>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="转运编号">
            {getFieldDecorator('transNo', {
              initialValue: formItem.transNo
            })(<Input disabled />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="任务创建人">
            {getFieldDecorator('createUserName', {
              initialValue: formItem.createUserName
            })(<Input disabled />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="取样单位">
            {getFieldDecorator('lccName', {
              initialValue: formItem.lccName
            })(<Input disabled />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="计划取样日期"
                    validateStatus={formChanged && !isEqual(formItem.planGetDate, item.planGetDate) ? "error" : ""}>
            {getFieldDecorator('planGetDate', {
              initialValue: formItem.planGetDate && moment(formItem.planGetDate)
            })(<DatePicker style={{ width: '100%' }} />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout}
                    label="取样人"
                    validateStatus={formChanged && !isEqual(formItem.planGetManName, item.planGetManName) ? "error" : ""}>
            {getFieldDecorator('planGetManName', {
              initialValue: formItem.planGetManName ? strToArray(formItem.planGetManName) : []
            })(
              <Select
                mode="multiple"
                allowClear
                onChange={changePlanGetManName}
                style={{ width: '100%' }}
              >
                {planGetMen.map(x => {
                  return <Option key={x.linkName}>{x.linkName}</Option>
                })}
              </Select>
            )}
          </FormItem>
        </Col>
        <Col className={styles.hidden}>
          <FormItem {...formItemLayout}
                    label="取样人ID"
                    validateStatus={formChanged && !isEqual(formItem.planGetManName, item.planGetManName) ? "error" : ""}>
            {getFieldDecorator('planGetManId', {
              initialValue: formItem.planGetManId
            })(
              <Input />
            )}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout}>
            <Button disabled={!itemSelected} className={styles.right} type="primary" size="small" onClick={() => updateLinkMan(1)}>添加</Button>
            <Button disabled={!itemSelected} type="primary" size="small" onClick={() => updateLinkMan(2)}>修改</Button>
          </FormItem>
        </Col>
        {/*TODO:如果行高不一致，float:left，会导致样式错乱*/}
        <Col>
          <div style={{ clear: 'both' }} />
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="主联系人"
                    validateStatus={formChanged && !isEqual(formItem.link1Man, item.link1Man) ? "error" : ""}>
            {getFieldDecorator('link1Man', {
              initialValue: formItem.link1Man
            })(
              <Select
                allowClear
                onChange={changeLink1Man}
                style={{ width: '100%' }}
              >
                {link1Men.map(x => {
                  return <Option key={x.linkName}>{x.linkName}</Option>
                })}
              </Select>
            )}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="电话"
                    validateStatus={formChanged && !isEqual(formItem.link1Tel, item.link1Tel) ? "error" : ""}>
            {getFieldDecorator('link1Tel', {
              initialValue: formItem.link1Tel,
            })(<Input disabled />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout}>
            <Button disabled={!itemSelected} className={styles.right} onClick={() => updateLinkMan(3)} type="primary" size="small">添加</Button>
            <Button disabled={!itemSelected} type="primary" size="small" onClick={() => updateLinkMan(4)}>修改</Button>
          </FormItem>
        </Col>
        <Col>
          <div style={{ clear: 'both' }} />
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="备用联系人"
                    validateStatus={formChanged && !isEqual(formItem.link2Man, item.link2Man) ? "error" : ""}>
            {getFieldDecorator('link2Man', {
              initialValue: item.link2Man
            })(
              <Select
                allowClear
                onChange={changeLink2Man}
                style={{ width: '100%' }}
              >
                {link2Men.map(x => {
                  return <Option key={x.linkName}>{x.linkName}</Option>
                })}
              </Select>
            )}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="电话"
                    validateStatus={formChanged && !isEqual(formItem.link2Tel, item.link2Tel) ? "error" : ""}>
            {getFieldDecorator('link2Tel', {
              initialValue: formItem.link2Tel
            })(<Input disabled />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout}>
            <Button disabled={!itemSelected} className={styles.right} type="primary" size="small" onClick={() => updateLinkMan(5)}>添加</Button>
            <Button disabled={!itemSelected} type="primary" size="small" onClick={() => updateLinkMan(6)}>修改</Button>
          </FormItem>
        </Col>
        <Col>
          <div style={{ clear: 'both' }} />
        </Col>
        <Col xs={12} md={16}>
          <FormItem {...formRemarkLayout} label="地址/备注"
                    validateStatus={formChanged && !isEqual(formItem.remarks, item.remarks) ? "error" : ""}>
            {getFieldDecorator('remarks', {
              initialValue: formItem.remarks
            })(<Input type="textarea" rows={2} />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout}>
            <Button type="primary" size="default" ghost onClick={handleSubmit} disabled={!formChanged}>保存</Button>
            <Button type="danger" size="default" ghost onClick={reset} style={{ marginLeft: 5 }} disabled={!formChanged}>重置</Button>
          </FormItem>
        </Col>
      </Row>

    </Form>
  )
}

Filter.propTypes = {}

const changeField = (props, field) => {
  if (!props.item.id) {
    return
  }
  props.onFieldChange(props, field)
}

export default Form.create(
  {
    onFieldsChange: changeField,
  }
)(Filter)
