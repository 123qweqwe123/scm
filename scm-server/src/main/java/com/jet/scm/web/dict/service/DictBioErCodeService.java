package com.jet.scm.web.dict.service;

import com.jet.scm.web.dict.domain.JetCommDictBioErCode;

import java.util.List;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/4
 */
public interface DictBioErCodeService {
    /**
     * 获取错误编码列表
     *
     * @param errorCode
     * @return
     */
    List<JetCommDictBioErCode> getBioErrorCodeList(JetCommDictBioErCode errorCode);

    /**
     * 根据id查询错误编码
     *
     * @param id
     * @return
     */
    JetCommDictBioErCode selectByPrimaryKey(String id);

    /**
     * 添加/修改错误编码校验是否已存在
     *
     * @param errorCode
     */
    void validateVcode(JetCommDictBioErCode errorCode);

    /**
     * 新增/更新错误编码
     *
     * @param record
     * @return
     */
    int createOrUpdate(JetCommDictBioErCode record);

    /**
     * 查询错误编码
     * @return
     */
    List<?> queryErrCodes();
}
