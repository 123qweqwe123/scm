import React from 'react'
import PropTypes from 'prop-types'
import { Form, DatePicker, Button, Row, Col, Input, Select, Icon } from 'antd'
import InputClose from '../../../components/InputClose'


const FormItem = Form.Item
const { RangePicker } = DatePicker
const Option = Select.Option

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 16,
  }
}

const Filter = ({
  onFilterChange,
  statusList,
  form: {
    getFieldDecorator,
    getFieldsValue,
  },
}) => {

  const handleSubmit = () => {
    let fields = getFieldsValue()
    if (fields.createDate && fields.createDate.length > 0) {
      fields = {
        ...fields,
        createStartDate: fields.createDate[0].format('YYYY-MM-DD'),
        createEndDate: fields.createDate[1].format('YYYY-MM-DD'),
      }
      delete fields.createDate
    }
    if (fields.planGetDate && fields.planGetDate.length > 0) {
      fields = {
        ...fields,
        planGetStartDate: fields.planGetDate[0].format('YYYY-MM-DD'),
        planGetEndDate: fields.planGetDate[1].format('YYYY-MM-DD'),
      }
      delete fields.planGetDate
    }
    onFilterChange(fields)
  }

  return (
    <Form layout="horizontal">
      <Row>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="转运编号">
            {getFieldDecorator('transNo', {})(<InputClose />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="主任务进度">
            {getFieldDecorator('status', {})(
              <Select allowClear>
                {statusList.map(item => <Option key={item.code}>{item.value}</Option>)}
              </Select>)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="创建人">
            {getFieldDecorator('createMan', {})(<InputClose />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="创建日期">
            {getFieldDecorator('createDate', {})(<RangePicker />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="取件人">
            {getFieldDecorator('getMan', {})(<InputClose />)}
          </FormItem>
        </Col>
        <Col xs={12} md={8}>
          <FormItem {...formItemLayout} label="计划取件日期">
            {getFieldDecorator('planGetDate', {})(<RangePicker />)}
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col xs={24} md={24} style={{ marginBottom: 16 }}>
          <Button type="primary" onClick={handleSubmit}>查询</Button>
        </Col>
      </Row>
    </Form>
  )
}

Filter.propTypes = {}

export default Form.create()(Filter)
