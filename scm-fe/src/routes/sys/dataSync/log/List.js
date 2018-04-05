import React from 'react'
import PropTypes from 'prop-types'
import { Table, Badge, Modal, Row, Col, } from 'antd'
import AnimTableBody from '../../../../components/DataTable/AnimTableBody'

const List = ({ isMotion, location, ...tableProps }) => {
  // 是否同步成功
  const status = {
    1: '成功',
    0: '失败',
  };
  const badgeType = {
    1: 'success',
    0: 'error',
  };

  const columns = [
    {
      title: '任务ID',
      dataIndex: 'SYNCID',
    },
    {
      title: '任务名称',
      dataIndex: 'TASKNAME',
    },
    {
      title: '同步状态',
      dataIndex: 'ISSUCCESS',
      render: (text) => <Badge status={badgeType[text]} text={status[text]} />
    },
    {
      title: '插入数量',
      dataIndex: 'INSERTCOUNT',
    },
    {
      title: '更新数量',
      dataIndex: 'UPDATECOUNT',
    },
    {
      title: '删除数量',
      dataIndex: 'DELETECOUNT',
    },
    {
      title: '同步开始时间',
      dataIndex: 'STARTTIME',
      render: (text) => text ? new Date(text).format('yyyy-MM-dd HH:mm:ss') : '',
    },
    {
      title: '同步结束时间',
      dataIndex: 'ENDTIME',
      render: (text) => text ? new Date(text).format('yyyy-MM-dd HH:mm:ss') : '',
    },
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
