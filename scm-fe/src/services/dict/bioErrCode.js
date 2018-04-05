import { request, config } from '../../utils'
const { api } = config
const { dict } = api
const { bioErrCodes, createOrUpdateErrCode, errCodeTree } = dict

export async function queryErrorCodes(params) {
  return request({
    url: bioErrCodes,
    method: 'get',
    data: params,
  })
}

export async function createOrUpdate(params) {
  return request({
    url: createOrUpdateErrCode,
    method: 'post',
    data: params,
  })
}

export async function queryErrCodeTree(params) {
  return request({
    url: errCodeTree,
    method: 'get',
    data: params,
  })
}
