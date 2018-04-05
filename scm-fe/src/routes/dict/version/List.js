import React from 'react'
import PropTypes from 'prop-types'
import { Table, Pagination, Row, Col } from 'antd'
import styles from './List.less'
import AnimTableBody from '../../../components/DataTable/AnimTableBody'

const List = ({ isMotion, location, updateDict, ...tableProps }) => {
  const { logList, download } = tableProps;
  const type = {
    5: 'master补丁包',
    8: 'work补丁包',
  };

  const expandedRowRender = (record) => {

    const columns = [
      {
        title: '补丁包历史版本号',
        dataIndex: 'dictVersion',
        width: 200,
      },
      {
        title: '补丁包历史说明',
        dataIndex: 'remark',
        render:(text) => (<pre>{text}</pre>)
      },
      {
        title: '操作',
        dataIndex: 'operator',
        width: 100,
        render: (text, record) => (
          <span>
            <a href="javascript:void(0)" onClick={e => download(record.fileId)}>下载</a>
          </span>
        )
      },
    ];

    return (
      <Table
        rowKey={record => record.id}
        columns={columns}
        dataSource={logList[record. dictType]}
      />
    );
  };

  const columns = [
    {
      title: '补丁包类别',
      dataIndex: 'dictType',
      render: (text) => type[text],
    }, {
      title: '补丁包版本号',
      dataIndex: 'dictVersion',
    }, {
      title: '版本说明',
      dataIndex: 'remark',
      render:(text) => (<pre>{text}</pre>)
    },
    {
      title: '操作',
      dataIndex: 'operator',
      width: 150,
      render: (text, record) => (
        <span>
          <a href="javascript:void(0)" onClick={e => updateDict(record)}>更新版本</a>
          <span className="ant-divider" />
          <a href="javascript:void(0)" onClick={e => download(record.fileId)}>下载</a>
        </span>
      )
    },
    {
      title: 'id',
      dataIndex: 'id',
      key: 'id',
      className: styles.hidden,
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
            expandedRowRender={expandedRowRender}
            columns={columns}
            rowKey={record => record.id}
            getBodyWrapper={getBodyWrapper}
            pagination={false}
          />
        </Col>
      </Row>
    </div>
  )
}

List.propTypes = {
  isMotion: PropTypes.bool,
  location: PropTypes.object,
  updateDict: PropTypes.func,
}

export default List
