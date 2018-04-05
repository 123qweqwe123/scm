/**
 * Created by huangrupeng on 17/6/20.
 */
import { request, config } from '../../utils'
const { api } = config
const { spem } = api
const { transfers, unTransfers, unselectedBoxes, emails } = spem

// 转运单列表
export async function queryTransfers(params) {
  return request({
    url: transfers,
    method: 'get',
    data: params,
  })
}

// 转运单详情
export async function queryTransfer(params) {
  return request({
    url: transfers + '/:transId',
    method: 'get',
    data: params,
  })
}

export async function queryTransferBoxes(params) {
  return request({
    url: transfers + '/:transId/boxes',
    method: 'get',
    data: params,
  })
}

// 转运单明细列表
export async function queryDetails(params) {
  return request({
    url: transfers + '/:transId/details',
    method: 'get',
    data: params,
  })
}

// 转运单明细详情
export async function queryDetail(params) {
  return request({
    url: transfers + '/:transId/details/:transDetailId',
    method: 'get',
    data: params,
  })
}

export async function addTransferDetail(params) {
  return request({
    url: transfers + '/:transId/details/:detailId',
    method: 'post',
    data: params,
  })
}

export async function queryUnTransfer(params) {
  return request({
    url: unTransfers,
    method: 'get',
    data: params,
  })
}

export async function queryLinkMen(params) {
  return request({
    url: transfers + '/:transId/details/linkMans',
    method: 'get',
    data: params,
  })
}

export async function createOrUpdateLinkMen(params) {
  return request({
    url: transfers + '/:transId/details/:detailId/linkMans',
    method: 'post',
    data: params,
  })
}

export async function uploadTransferDetail(params) {
  return request({
    url: transfers + '/:transId/details/:detailId/upload',
    method: 'post',
    data: params,
  })
}

export async function updateDetail(params) {
  return request({
    url: transfers + '/:transId/details',
    method: 'put',
    data: params,
  })
}


export async function queryImages(params) {
  return request({
    url: transfers + '/:transId/details/:detailId/images',
    method: 'get',
    data: params,
  })
}

/**
 *
 * @param params
 * @returns {Promise.<*>} 未转运冻存盒
 */
export async function queryUnselectedBoxes(params) {
  return request({
    url: unselectedBoxes,
    method: 'get',
    data: params,
  })
}

/**
 * 获取转运邮箱列表
 * @param params
 * @returns {Promise.<*>}
 */
export async function queryEmails(params) {
  return request({
    url: emails,
    method: 'get',
    data: params,
  })
}

export async function createEmails(params) {
  return request({
    url: emails,
    method: 'post',
    data: params,
  })
}

export async function updateEmails(params) {
  return request({
    url: emails,
    method: 'patch',
    data: params,
  })
}

export async function queryTransNo(params) {
  return request({
    url: transfers + '/queryTransNo',
    method: 'get',
    data: params,
  })
}

export async function queryBoxes(params) {
  return request({
    url: transfers + '/boxes',
    method: 'get',
    data: params,
  })
}

/**
 * 新增样本转运指令
 * @param params
 * @returns {Promise.<*>}
 */
export async function createTransfer(params) {
  return request({
    url: transfers,
    method: 'post',
    data: params,
  })
}

/**
 * 运单交付
 * @param params
 * @returns {Promise.<*>}
 */
export async function deliverTransfer(params) {
  return request({
    url: transfers + "/deliver",
    method: 'patch',
    data: params,
  })
}
