import request from './request'
/**
 * 针对页面发出请求
 */

export async function query(url, params) {
  return request({
    url: url,
    method: 'get',
    data: params,
  })
}

export async function create(url, params) {
  return request({
    url: url,
    method: 'post',
    data: params,
  })
}

export async function remove(url, params) {
  return request({
    url: url,
    method: 'delete',
    data: params,
  })
}

export async function update(url, params) {
  return request({
    url: url,
    method: 'patch',
    data: params,
  })
}
