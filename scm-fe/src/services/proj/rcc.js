import { request, config } from '../../utils'
const { api } = config
const { proj } = api
const { rcc } = proj

export async function query(params) {
  return request({
    url: rcc,
    method: 'get',
    data: params,
  })
}

export async function create(params) {
  return request({
    url: rcc.replace('/:id', ''),
    method: 'post',
    data: params,
  })
}

export async function remove(params) {
  return request({
    url: rcc,
    method: 'delete',
    data: params,
  })
}

export async function update(params) {
  return request({
    url: rcc,
    method: 'patch',
    data: params,
  })
}
