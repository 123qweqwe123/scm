module.exports = {
  name: '样本管理平台',
  prefix: 'antdAdmin',
  footerText: 'Copyright © 2014. 国家心血管病中心 . All rights reserved',
  logo: '/logo.png',
  qrCode: '/QR_code.jpg',
  iconFontCSS: '/iconfont.css',
  iconFontJS: '/iconfont.js',
  baseURL: 'http://localhost:8000/api/v1',
  YQL: ['http://www.zuimeitianqi.com'],
  CORS: ['http://localhost:7000'],
  openPages: ['/login'],
  apiPrefix: '/api/v1',
  api: {
    userLogin: '/user/login',
    userLogout: '/user/logout',
    userInfo: '/userInfo',
    users: '/users',
    user: '/user/:id',
    dashboard: '/dashboard',
    common: {
      autoComplete: '/common/combox/autoComplete',
      select: '/common/combox/select',
      upload: '/api/v1/common/file/upload', // TODO 打包时需要去掉/api/v1
      preview: '/api/v1/common/file/preview',
      download: '/api/v1/common/file/download',
    },
    sys: {
      accounts: '/sys/accounts',
      menus: '/sys/menus',
      permissions: '/sys/permissions',
      roles: '/sys/roles',
      dataSync: '/sys/dataSyncs',
      loginLog: '/sys/loginLogs'
    },
    spem: {
      transfers: '/spem/transfers',
      unTransfers: '/spem/unTransfers',
      unselectedBoxes: '/spem/unselectedBoxes',
      emails: '/spem/emails'
    },
    dict: {
      versions: '/dict/versions',
      updateVersion: '/dict/updateVersion',
      bioErrCodes: '/dict/errorCodes',
      createOrUpdateErrCode: '/dict/createOrUpdateDictBioErCode',
      errCodeTree: '/dict/treeErrCodes',
      versionLogs: '/dict/versionLogs'
    },
    proj: {
      rcc: '/proj/rccs'
    },
    sys1: {
      accounts: '/sys1/accounts'
    }
  },
}
