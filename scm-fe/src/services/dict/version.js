import { request, config } from '../../utils'
const { api } = config;
const { dict } = api;
const { versions, updateVersion, versionLogs } = dict;

export async function queryDictVersions(params) {
  return request({
    url: versions,
    method: 'get',
    data: params,
  })
}

export async function update(params) {
  return request({
    url: updateVersion,
    method: 'patch',
    data: params,
  })
}

export async function queryLogs(params) {
  return request({
    url: versionLogs,
    method: 'get',
    data: params,
  })
}
