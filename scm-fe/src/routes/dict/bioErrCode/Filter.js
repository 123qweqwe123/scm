import React from 'react'
import PropTypes from 'prop-types'
import { FilterItem } from '../../../components'
import { Form, Button, Row, Col, Input } from 'antd'


const ColProps = {
  xs: 24,
  sm: 12,
  style: {
    marginBottom: 16,
  },
}

const Filter = ({
  filter,
  onAdd,
  onFilterChange,
  form: {
    getFieldDecorator,
    getFieldsValue,
  },
}) => {
  const handleSubmit = () => {
    let fields = getFieldsValue()
    onFilterChange(fields)
  }

  const { vcode } = filter

  return (
    <Row gutter={24}>
      <Col {...ColProps} xl={{ span: 6 }} md={{ span: 8 }}>
        <FilterItem label="错误编码：">
          {getFieldDecorator('vcode', { initialValue: vcode })(<Input placeholder="请输入错误编码" />)}
        </FilterItem>
      </Col>

      <Col {...ColProps} xl={{ span: 6 }} md={{ span: 8 }}>
        <Button type="primary" onClick={handleSubmit}>查询</Button>
      </Col>

      <Col {...ColProps} xl={{ span: 12 }} md={{ span: 8 }} sm={{ span: 8 }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', float: 'right' }}>
          <Button onClick={onAdd}>新增</Button>
        </div>
      </Col>
    </Row>
  )
}

Filter.propTypes = {
  form: PropTypes.object,
  filter: PropTypes.object,
}

export default Form.create()(Filter)
