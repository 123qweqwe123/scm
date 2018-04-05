import React from 'react'
import PropTypes from 'prop-types'
import { Link } from 'dva/router'
import { Table, Badge, Modal, Row, Col, } from 'antd'
import AnimTableBody from '../../../components/DataTable/AnimTableBody'

const confirm = Modal.confirm;
const List = ({ isMotion, location, updateDataSync, ...tableProps }) => {
  // 是否有效
  const validName = {
    1: '有效',
    2: '无效',
  };
  const badgeType = {
    1: 'success',
    2: 'error',
  };

  const columns = [
    {
      title: '任务名称',
      dataIndex: 'taskName',
      render: (text, record) => <Link to={`/sys/datasync/${record.id}`}>{text}</Link>,
    },
    {
      title: 'cron表达式',
      dataIndex: 'cronExp',
    },
    {
      title: '更新时间',
      dataIndex: 'updateTime',
      render: (text) => text ? new Date(text).format('yyyy-MM-dd') : '',
    },
    {
      title: '操作人',
      dataIndex: 'updateBy',
    },
    {
      title: '是否有效',
      dataIndex: 'isValid',
      render: (text) => <Badge status={badgeType[text]} text={validName[text]} />
    },
    {
      title: '操作',
      width: 100,
      dataIndex: 'operator',
      render: (text, record) => (
        <span>
          <a href="javascript:void(0)" onClick={e => updateDataSync(record)}>修改</a>
        </span>
      ),
    }
  ];

  const getBodyWrapperProps = {
    page: location.query.page,
    current: tableProps.pagination.current,
  };

  const getBodyWrapper = body => {
    return isMotion ? <AnimTableBody {...getBodyWrapperProps} body={body} /> : body
  };

  return (
    <div>
      <Row gutter={24}>
        <Col span={24}>
          <Table
            {...tableProps}
            bordered
            columns={columns}
            rowKey={record => record.id}
            getBodyWrapper={getBodyWrapper}
          />
        </Col>
      </Row>
    </div>
  )
};

List.propTypes = {
  isMotion: PropTypes.bool,
  location: PropTypes.object,
};

export default List
