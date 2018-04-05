import React from 'react'
import PropTypes from 'prop-types'
import { Table, Row, Col, Badge, Modal } from 'antd'
import styles from './List.less'
import AnimTableBody from '../../../components/DataTable/AnimTableBody'
import { Link } from 'dva/router'


const List = ({ isMotion, location, ...tableProps }) => {
  const { siblingPagination, siblingDataSource, subList, onChangeSibling, preview,onDeliver } = tableProps

  const expandedRowRender = (record) => {

    const columns = [
      { title: '子转运编号', dataIndex: 'transDetailNo' },
      { title: '项目单位', dataIndex: 'rccName' },
      { title: '取样人', dataIndex: 'planGetManName' },
      {
        title: '计划取样日期',
        dataIndex: 'planGetDate',
        render: (text) => {
          if (text) {
            return new Date(text).format('yyyy-MM-dd')
          }
        }
      },
      { title: '取样套数', dataIndex: 'boxCount' },
      {
        title: '操作',
        dataIndex: 'operator',
        render: (text, record) => (
          <span>
          <a href="javascript:void(0)" onClick={e => preview(e, record)}>查看附件</a>
          </span>
        ),
      }
    ]

    return (
      <Table
        rowKey={record => record.transDetailNo}
        columns={columns}
        dataSource={subList[record.id]}
        pagination={false}
      />
    );
  }

  // 转运进度
  const status = {
    1: '新任务',
    2: '转运中',
    3: '部分交付',
    4: '全部交付',
    5: '全部交付'
  }
  const badgeType = {
    1: 'default',
    2: 'processing',
    3: 'warning',
    4: 'success',
    5: 'success',
  }

  const deliver = (transId) => {
    Modal.confirm({
      title: '',
      content: '请确认是否已完成交付?',
      onOk() {
        onDeliver(transId)
      },
      onCancel() {

      }
    })
  }

  const columns1 = [
    {
      title: '转运编号',
      dataIndex: 'transNo',
      width: '30%'
    }, {
      title: '转运进度',
      dataIndex: 'status',
      render: (text) => <Badge status={badgeType[text]} text={status[text]} />
    }, {
      title: '创建人',
      dataIndex: 'createByName',
    }, {
      title: '创建日期',
      dataIndex: 'createTime',
      render: (text) => new Date(text).format('yyyy-MM-dd'),
    }, {
      title: '冻存盒数量(套)',
      dataIndex: 'boxCount',
    }, {
      title: '详情',
      dataIndex: 'operator',
      width: 80,
      render: (text, record) => (
        <span>
          <Link to={`/spem/transfer/${record.id}`}>详情</Link>
          {record.status === 4 &&
          <span>
            <span className="ant-divider" />
            <a onClick={x => deliver(record.id)}>交付</a>
          </span>}
        </span>
      ),
    },
    {
      title: 'id',
      dataIndex: 'id',
      key: 'id',
      className: styles.hidden
    },
  ]

  const columns2 = [
    {
      title: '建议转运项目点',
      dataIndex: 'RCC_CODE',
    },
    {
      title: '任务量(套)',
      dataIndex: 'INITIAL_TASK',
    }, {
      title: '未转运数量(套)',
      dataIndex: 'NOTRANSCOUNT',
    }, {
      title: '最近取样日期',
      dataIndex: 'planGetDate',
    }
  ]

  const getBodyWrapperProps = {
    page: location.query.page,
    current: tableProps.pagination.current,
  }

  const getBodyWrapper = body => {
    return isMotion ? <AnimTableBody {...getBodyWrapperProps} body={body} /> : body
  }

  const setBgColor = (record) => {

    let initialTask = record.INITIAL_TASK, notranscount = record.NOTRANSCOUNT / record.INITIAL_TASK
    if (initialTask <= 10 && notranscount > 0.9) {
      return styles.bgRed
    } else if (initialTask <= 10 && notranscount > 0.8) {
      return styles.bgYellow
    } else if (initialTask <= 20 && notranscount > 0.8) {
      return styles.bgRed
    } else if (initialTask <= 20 && notranscount > 0.6) {
      return styles.bgYellow
    } else if (initialTask <= 30 && notranscount > 0.8) {
      return styles.bgRed
    } else if (initialTask <= 30 && notranscount > 0.6) {
      return styles.bgYellow
    } else if (initialTask <= 60 && notranscount > 0.6) {
      return styles.bgRed
    } else if (initialTask <= 60 && notranscount > 0.4) {
      return styles.bgYellow
    } else if (initialTask <= 120 && notranscount > 0.3) {
      return styles.bgRed
    } else if (initialTask <= 120 && notranscount > 0.2) {
      return styles.bgYellow
    }

  }

  return (
    <div>
      <Row gutter={20}>
        <Col span={16}>
          <Table
            {...tableProps}
            bordered
            expandedRowRender={expandedRowRender}
            columns={columns1}
            rowKey={record => record.id}
            getBodyWrapper={getBodyWrapper}
          />
        </Col>

        <Col span={8}>
          <Table
            pagination={siblingPagination}
            dataSource={siblingDataSource}
            bordered
            onChange={onChangeSibling}
            columns={columns2}
            rowKey={record => record.ROW_ID}
            getBodyWrapper={getBodyWrapper}
            rowClassName={setBgColor}
          />
        </Col>

      </Row>
    </div>
  )
}

List.propTypes = {
  onDeleteItem: PropTypes.func,
  onEditItem: PropTypes.func,
  isMotion: PropTypes.bool,
  location: PropTypes.object,
}

export default List
