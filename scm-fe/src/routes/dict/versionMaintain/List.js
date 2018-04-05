import React from 'react'
import PropTypes from 'prop-types'
import { Table, Row, Col, Modal } from 'antd'
import styles from './List.less'
import AnimTableBody from '../../../components/DataTable/AnimTableBody'

const confirm = Modal.confirm;

const List = ({ isMotion, location, updateDictVersion, ...tableProps }) => {
  const handleMenuClick = (record) => {
    confirm({
      title: '确定更新版本号?',
      onOk () {
        updateDictVersion(record.id)
      },
    })
  };

  const type = {
    1: '错误编码',
    5: 'master补丁包',
    8: 'work补丁包',
    2: '冻存盒数据'
  };

  const columns = [
    {
      title: '补丁包类别',
      dataIndex: 'dictType',
      render: (text) => type[text],
    }, {
      title: '补丁包版本号',
      dataIndex: 'dictVersion',
    },
    {
      title: '详情',
      dataIndex: 'operator',
      render: (text, record) => {
        return <a href="javascript:void(0)" onClick={e => handleMenuClick(record)}>更新版本号</a>
      }
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
            columns={columns}
            rowKey={record => record.id}
            getBodyWrapper={getBodyWrapper}
          />
        </Col>
      </Row>
    </div>
  )
}

List.propTypes = {
  isMotion: PropTypes.bool,
  location: PropTypes.object,
  updateDictVersion: PropTypes.func,
};

export default List
