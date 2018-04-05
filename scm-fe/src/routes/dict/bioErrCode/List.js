import React from 'react'
import PropTypes from 'prop-types'
import { Table, Row, Col, Modal } from 'antd'
import styles from './List.less'
const confirm = Modal.confirm
import AnimTableBody from '../../../components/DataTable/AnimTableBody'

const List = ({ isMotion, location, updateErrCode, deleteErrCode, ...tableProps }) => {

  const handleMenuClick = (record) => {
    confirm({
      title: '确定删除当前数据?',
      onOk () {
        deleteErrCode(record.id)
      },
    })
  }

  const columns = [
    {
      title: '错误编码',
      dataIndex: 'vcode',
    },
    {
      title: '错误名称',
      dataIndex: 'vname',
    },
    {
      title: '更新时间',
      dataIndex: 'updateDate',
      render: (text) => text ? new Date(text).format('yyyy-MM-dd') : '',
    },
    {
      title: '操作人',
      dataIndex: 'updateBy',
    },
    {
      title: '操作',
      width: 100,
      dataIndex: 'operator',
      render: (text, record) => {
        if (record.isOperate !== 1) {
          return <ul>
            <li><a href="javascript:void(0)" style={{ marginRight: 24 }} onClick={e => updateErrCode(e, record)}>修改</a><a href="javascript:void(0)" onClick={e => handleMenuClick(record)}>删除</a></li>
          </ul>
        } else {
          return ''
        }
      }
    }
  ]

  const getBodyWrapperProps = {
    page: location.query.page,
    current: tableProps.pagination.current,
  }

  const getBodyWrapper = body => {
    return isMotion ? <AnimTableBody {...getBodyWrapperProps} body={body} /> : body
  }

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
}

export default List
