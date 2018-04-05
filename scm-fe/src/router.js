import React from 'react'
import PropTypes from 'prop-types'
import { Router } from 'dva/router'
import App from './routes/app'

const registerModel = (app, model) => {
  if (!(app._models.filter(m => m.namespace === model.namespace).length === 1)) {
    app.model(model)
  }
}

const Routers = function ({ history, app }) {
  const routes = [
    {
      path: '/',
      component: App,
      getIndexRoute (nextState, cb) {
        require.ensure([], require => {
          registerModel(app, require('./models/dashboard'))
          cb(null, { component: require('./routes/dashboard/') })
        }, 'dashboard')
      },
      childRoutes: [
        {
          path: 'dashboard',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/dashboard'))
              cb(null, require('./routes/dashboard/'))
            }, 'dashboard')
          },
        },
        {
          path: 'sys/account',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/account'))
              cb(null, require('./routes/sys/account/'))
            }, '')
          },
        },
        {
          path: 'sys/menu',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/menu'))
              cb(null, require('./routes/sys/menu/'))
            }, '')
          },
        },
        {
          path: 'sys/permission',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/permission'))
              cb(null, require('./routes/sys/permission/'))
            }, '')
          },
        },
        {
          path: 'sys/role',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/role'))
              cb(null, require('./routes/sys/role/'))
            }, '')
          },
        },
        {
          path: 'sys/loginlog',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/loginLog'))
              cb(null, require('./routes/sys/loginLog/'))
            }, '')
          },
        },
        {
          path: 'sys/datasync',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/dataSync'))
              cb(null, require('./routes/sys/dataSync/'))
            }, '')
          },
        },
        {
          path: 'sys/datasync/:syncId',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/sys/dataSync/syncLog'))
              cb(null, require('./routes/sys/dataSync/log/'))
            }, '')
          },
        },
        {
          path: 'spem/transfer',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/spem/transfer'))
              cb(null, require('./routes/spem/transfer/'))
            }, '')
          },
        },
        {
          path: 'spem/transfer/:transId',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/spem/transfer/detail'))
              cb(null, require('./routes/spem/transfer/detail/'))
            }, '')
          },
        },
        {
          path: 'dict/version',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/dict/version'))
              cb(null, require('./routes/dict/version/'))
            }, '')
          },
        },
        {
          path: 'dict/bioerrcode',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/dict/bioErrCode'))
              cb(null, require('./routes/dict/bioErrCode/'))
            }, '')
          },
        },
        {
          path: 'dict/versionmaintain',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/dict/versionMaintain'))
              cb(null, require('./routes/dict/versionMaintain/'))
            }, '')
          },
        },
        {
          path: 'login',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              registerModel(app, require('./models/login'))
              cb(null, require('./routes/login/'))
            }, 'login')
          },
        }, {
          path: '*',
          getComponent (nextState, cb) {
            require.ensure([], require => {
              cb(null, require('./routes/error/'))
            }, 'error')
          },
        },
      ],
    },
  ]

  return <Router history={history} routes={routes} />
}

Routers.propTypes = {
  history: PropTypes.object,
  app: PropTypes.object,
}

export default Routers
