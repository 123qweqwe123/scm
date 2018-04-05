import React from 'react'
import PropTypes from 'prop-types'
import { Form, Row, Col, Modal, Table, Input } from 'antd'
import lodash from 'lodash'

const FormItem = Form.Item

const formItemLayout = {
  labelCol: {
    span: 6,
  },
  wrapperCol: {
    span: 14,
  },
}

const modal = ({
  master,
  onOk,
  formItem,
  form: {
    getFieldDecorator,
    validateFields,
    getFieldsValue,
  },
  ...modalProps
}) => {
  const handleOk = () => {
    validateFields((errors) => {
      if (errors) {
        return
      }
      const data = {
        ...getFieldsValue(),
      }
      onOk(data)
    })
  }

  const modalOpts = {
    ...modalProps,
    onOk: handleOk,
  }

  const columns = [
    { title: '序号', dataIndex: 'index', width: '10%' },
    // { title: '省份', dataIndex: 'rccName' },
    { title: '项目点', dataIndex: 'rccName', width: '15%' },
    {
      title: '项目单位',
      dataIndex: 'lccName',
      width: '15%'
    },
    { title: '取样套数', dataIndex: 'boxCount', width: '10%' },
    {
      title: '列表',
      dataIndex: 'operator',
      width: '50%',
      render: (text, record) => (
        <span>
          {record.boxes.join(',')}
          </span>
      ),
    }
  ]

  return (
    <Modal {...modalOpts}>
      <Form layout="horizontal">
        <Row>
          <Col>
            <Table
              columns={columns}
              pagination={false}
              dataSource={master.boxes.tableDataSource}
              rowKey={record => record.index}
              scroll={{ y: 250 }}
            />
          </Col>
        </Row>
        <Row style={{ marginTop: 15 }}>
          <Col>
            <FormItem label="转运邮箱" {...formItemLayout}>
              {getFieldDecorator('transMails', {
                initialValue: master.transMails.filter(x => {
                  return lodash.includes(master.previewModalData.transMail, x.id + '')
                }).map(x => {
                  return x.email
                }).join(';  ')
              })(<Input disabled type="textarea" autosize={true} />)}
            </FormItem>
          </Col>
        </Row>
        <Row>
          <Col>
            <FormItem label="项目邮箱" {...formItemLayout}>
              {getFieldDecorator('projMails', {
                initialValue: master.projMails.filter(x => {
                  return lodash.includes(master.previewModalData.projMail, x.id)
                }).map(x => {
                  return x.email
                }).join(';  ')
              })(<Input disabled type="textarea" autosize={true} />)}
            </FormItem>
          </Col>
        </Row>
        <Row>
          <Col>
            <FormItem label="样本邮箱" {...formItemLayout}>
              {getFieldDecorator('spemMails', {
                initialValue: master.spemMails.filter(x => {
                  return lodash.includes(master.previewModalData.spemMail, x.id)
                }).map(x => {
                  return x.email
                }).join(';  ')
              })(<Input disabled type="textarea" autosize={true} />)}
            </FormItem>
          </Col>
        </Row>
      </Form>
    </Modal>
  )
}

modal.propTypes = {
  form: PropTypes.object.isRequired,
  item: PropTypes.object,
  onOk: PropTypes.func,
}

export default Form.create()(modal)
