package com.jet.scm.web.dict.service;

import com.jet.scm.web.dict.domain.JetCommDictVersionLog;
import com.jet.scm.web.dict.domain.PipCommDictVersion;
import com.jet.scm.web.dict.filter.DictVersionFilter;

import java.util.List;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/3
 */
public interface DictVersionService {

    /**
     * 补丁包列表
     *
     * @param filter
     * @return
     */
    List<?> dictVersions(DictVersionFilter filter);

    /**
     * 根据id查询PipCommDictVersion
     *
     * @param id
     * @return
     */
    PipCommDictVersion selectByPrimaryKey(String id);

    /**
     * 根据id更新PipCommDictVersion
     *
     * @param dictVersion
     * @return
     */
    int updateByPrimaryKeySelective(PipCommDictVersion dictVersion);

    /**
     * 根据dictTyp更新版本号
     *
     * @param filter
     * @return
     */
    int updateVersionByType(DictVersionFilter filter);

    /**
     * 根据id更新版本号并添加日志信息
     * @param log
     * @return
     */
    int updateVersionByPrimaryKey(JetCommDictVersionLog log);

    /**
     * 根据类型查询PipCommDictVersion
     * @param dictType
     * @return
     */
    List<?> dictVersionByDictType(String dictType);
}
