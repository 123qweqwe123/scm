import React from 'react'
import PropTypes from 'prop-types'
import { FilterItem } from '../../../../components'
import { Form, Button, Select, Row, Col, DatePicker } from 'antd'

const { RangePicker } = DatePicker;
const Option = Select.Option;

const ColProps = {
  xs: 24,
  sm: 12,
  style: {
    marginBottom: 16,
  },
};
const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 16,
  }
};

const Filter = ({
  filter,
  onSearch,
  form: {
    getFieldDecorator,
    getFieldsValue,
  },
}) => {

  const handleSubmit = () => {
    let fields = getFieldsValue();
    if (fields.syncDate && fields.syncDate.length > 0) {
      fields = {
        ...fields,
        startTime: fields.syncDate[0].format('YYYY-MM-DD'),
        endTime: (fields.syncDate[1]).format('YYYY-MM-DD'),
      };
      delete fields.syncDate
    }
    onSearch(fields)
  };

  const { syncDate, isSuccess } = filter;

  return (
    <Row gutter={24}>
      <Col {...ColProps} xl={{ span: 6 }} md={{ span: 8 }}>
        <FilterItem {...formItemLayout} label="同步时间">
          {getFieldDecorator( 'syncDate', { initialValue: syncDate } )(<RangePicker />)}
        </FilterItem>
      </Col>
      <Col {...ColProps} xl={{ span: 6 }} md={{ span: 8 }}>
        <FilterItem {...formItemLayout} label="同步状态">
          {getFieldDecorator( 'isSuccess', { initialValue: isSuccess } )(
            <Select style={{ width: '100%' }} allowClear>
              <Option key="1">成功</Option>
              <Option key="0">失败</Option>
            </Select>)}
        </FilterItem>
      </Col>

      <Col {...ColProps} xl={{ span: 6 }} md={{ span: 8 }}>
        <Button type="primary" onClick={handleSubmit}>查询</Button>
      </Col>
    </Row>
  )
};

Filter.propTypes = {
  form: PropTypes.object,
  filter: PropTypes.object,
};

export default Form.create()(Filter)
