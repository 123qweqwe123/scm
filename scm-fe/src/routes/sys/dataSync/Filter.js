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
};

const Filter = ({
  filter,
  onAdd,
  onSearch,
  form: {
    getFieldDecorator,
    getFieldsValue,
  },
}) => {
  const handleSubmit = () => {
    const fields = getFieldsValue();
    onSearch(fields)
  };

  const { taskName } = filter;

  return (
    <Row gutter={24}>
      <Col {...ColProps} xl={{ span: 6 }} md={{ span: 8 }}>
        <FilterItem label="任务名称：">
          {getFieldDecorator('taskName', { initialValue: taskName })(<Input placeholder="请输入任务名称" />)}
        </FilterItem>
      </Col>

      <Col {...ColProps} xl={{ span: 18 }} md={{ span: 8 }}>
        <Button type="primary" onClick={handleSubmit}>查询</Button>
        <div style={{ display: 'flex', justifyContent: 'space-between', float: 'right' }}>
          <Button onClick={onAdd}>新增</Button>
        </div>
      </Col>
    </Row>
  )
};

Filter.propTypes = {
  form: PropTypes.object,
  filter: PropTypes.object,
};

export default Form.create()(Filter)
