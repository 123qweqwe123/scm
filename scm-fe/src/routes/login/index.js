import React from 'react'
import PropTypes from 'prop-types'
import { connect } from 'dva'
import { Icon, Button, Checkbox, Row, Form, Input, Tabs } from 'antd'
import { config } from '../../utils'
import styles from './index.less'

const FormItem = Form.Item
const TabPane = Tabs.TabPane;

const Login = ({
  login,
  dispatch,
  form: {
    getFieldDecorator,
    validateFieldsAndScroll,
  },
}) => {
  const { loginLoading } = login

  function handleOk() {
    validateFieldsAndScroll((errors, values) => {
      if (errors) {
        return
      }
      dispatch({ type: 'login/login', payload: values })
    })
  }

  //    color: #d8c8c8;
  return (
    <div style={{ width: document.body.clientWidth, height: document.body.clientHeight }} className={styles.bgImage}>
      <div className={styles.form}>
        <div className={styles.logo}>
          <Tabs defaultActiveKey="1" size="small">
            <TabPane tab="用户名登录" key="1">
              <form>
                <FormItem hasFeedback>
                  {getFieldDecorator('username', {
                    rules: [{ required: true, message: '用户名不能为空' }],
                  })(
                    <Input size="large" prefix={<Icon type="user" style={{ fontSize: 13 }} />} onPressEnter={handleOk}
                           placeholder="用户名" />
                  )}
                </FormItem>
                <FormItem hasFeedback>
                  {getFieldDecorator('password', {
                    rules: [{ required: true, message: '密码不能为空' }],
                  })(<Input prefix={<Icon type="lock" style={{ fontSize: 13 }} />} size="large" type="password"
                            onPressEnter={handleOk} placeholder="密码" />)}
                </FormItem>
                <FormItem>
                  {getFieldDecorator('remerberme', {
                    valuePropName: 'checked',
                    initialValue: true,
                  })(
                    <Checkbox className={styles.color}>记住我</Checkbox>
                  )}
                  <a href="#" style={{ float: 'right' }}>忘记密码</a>
                </FormItem>
                <Row>
                  <Button type="primary" size="large" onClick={handleOk} loading={loginLoading}>
                    登录
                  </Button>
                </Row>

              </form>
            </TabPane>
            <TabPane tab="二维码登录" key="2" className={styles.tab}>
              <img alt={'qrcode'} src={config.qrCode} style={{ width: 200, height: 200 }} />
            </TabPane>
          </Tabs>
        </div>
      </div>
    </div>
  )
}

Login.propTypes = {
  form: PropTypes.object,
  login: PropTypes.object,
  dispatch: PropTypes.func,
}

export default connect(({ login }) => ({ login }))(Form.create()(Login))
