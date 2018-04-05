import React from 'react'
import PropTypes from 'prop-types'
import { Table, Row, Col, Modal } from 'antd'
import styles from './List.less'
import AnimTableBody from '../../../../components/DataTable/AnimTableBody'
import { Link } from 'dva/router'

const List = ({ isMotion, location, itemSelected, item, showUploadModal, showAddBoxModal, boxesByDetailId, ...tableProps }) => {

  const showBox = (e, boxCount, record) => {
    e.stopPropagation()
    Modal.info({
      title: '冻存盒列表',
      content: (
        <Row>
          {
            boxesByDetailId[record.id].map(box => {
              return <Col key={box} span={8}>{box}</Col>
            })
          }
        </Row>
      ),
      onOk() {
      }
    })
  }
  const columns = [
    {
      title: '单号',
      dataIndex: 'transDetailNo',
      width: '15%'
    }, {
      title: '省份',
      dataIndex: 'areaName'
    }, {
      title: '项目点',
      dataIndex: 'rccName',
    }, {
      title: '取样单位',
      dataIndex: 'lccName',
    }, {
      title: '联系地址',
      dataIndex: 'remarks',
    }, {
      title: '主联系人',
      dataIndex: 'link1Man',
    }, {
      title: '备用联系人',
      dataIndex: 'link2Man',
    }, {
      title: '取样套数',
      dataIndex: 'boxCount',
      render: (text, record) => <a onClick={x => showBox(x, text, record)}>{text}</a>
    }, {
      title: '计划取样日期',
      dataIndex: 'planGetDate',
      render: (text) => {
        if (text) {
          return new Date(text).format('yyyy-MM-dd')
        }
      },
    }, {
      title: '取样人',
      dataIndex: 'planGetManName',
    }, {
      title: '操作',
      dataIndex: 'operator',
      width: 110,
      render: (text, record) => (
        <span>
          <a href="javascript:void(0)" onClick={e => addBox(e, record)}>补充</a>
          <span className="ant-divider" />
          <a href="javascript:void(0)" onClick={e => uploadTransferAttachment(e, record)}>上传运单</a>
        </span>),
    },
    {
      title: 'id',
      dataIndex: 'id',
      key: 'id',
      className: styles.hidden
    },
  ]

  const getBodyWrapper = body => {
    return isMotion ? <AnimTableBody body={body} /> : body
  }


  const addBox = (e, record) => {
    e.stopPropagation()
    showAddBoxModal(record)
  }

  const uploadTransferAttachment = (e, record) => {
    e.stopPropagation()
    showUploadModal(record)
  }

  return (
    <div>
      <Row>
        <Col span={24}>
          <Table
            {...tableProps}
            pagination={false}
            bordered
            className={styles.table}
            columns={columns}
            rowKey={record => record.id}
            getBodyWrapper={getBodyWrapper}
            rowClassName={(record) => {
              if (itemSelected && record.id === item.id) {
                return styles.bgRed
              }
            }}
          />
        </Col>
      </Row>
    </div>
  )
}

List.propTypes = {
  location: PropTypes.object,
}

export default List
