package com.jet.scm.web.dict.service.impl;


import com.jet.scm.core.utils.Utils;
import com.jet.scm.web.dict.domain.JetCommDictVersionLog;
import com.jet.scm.web.dict.domain.PipCommDictVersion;
import com.jet.scm.web.dict.domain.PipCommDictVersionExample;
import com.jet.scm.web.dict.filter.DictVersionFilter;
import com.jet.scm.web.dict.mapper.JetCommDictVersionLogMapper;
import com.jet.scm.web.dict.mapper.PipCommDictVersionMapper;
import com.jet.scm.web.dict.service.DictVersionService;
import com.jet.scm.web.dict.utils.DictVersionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/3
 */

@Service
public class DictVersionServiceImpl implements DictVersionService {

    @Value("${Props.dictVersion-dictTypes}")
    String dictTypes;

    @Autowired
    PipCommDictVersionMapper dictVersionMapper;
    @Autowired
    JetCommDictVersionLogMapper logMapper;

    @Override
    public List<?> dictVersions(DictVersionFilter filter) {
        PipCommDictVersionExample example = new PipCommDictVersionExample();
        PipCommDictVersionExample.Criteria criteria = example.createCriteria();

        // 设置dict_type=isUpload时，查询需要上传补丁包的数据
        if("isUpload".equals(filter.getDictType())) {
            String[] dictTypeArr = StringUtils.split(dictTypes, ",");
            List<String> dictTypeList = Arrays.asList(dictTypeArr);
            criteria.andDictTypeIn(dictTypeList);
        }

        return dictVersionMapper.selectLogByExample(example);
    }

    @Override
    public PipCommDictVersion selectByPrimaryKey(String id) {
        return dictVersionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PipCommDictVersion dictVersion) {
        return dictVersionMapper.updateByPrimaryKeySelective(dictVersion);
    }

    @Override
    public int updateVersionByType(DictVersionFilter filter) {
        int sum = 0;
        List<?> list = dictVersionByDictType(filter.getDictType());
        if (list != null && list.size() > 0) {
            PipCommDictVersion version = (PipCommDictVersion) list.get(0);
            String dictVersion = DictVersionUtils.getDictVersion(version.getDictVersion());
            version.setDictVersion(dictVersion);
            sum = updateByPrimaryKeySelective(version);
        }
        return sum;
    }

    @Override
    public int updateVersionByPrimaryKey(JetCommDictVersionLog log) {
        // 这里log.getId()实际存储的是DictVersion的Id
        PipCommDictVersion pipCommDictVersion = dictVersionMapper.selectByPrimaryKey(log.getId());
        // 获取版本号
        String versionCode = DictVersionUtils.getDictVersion(pipCommDictVersion.getDictVersion());
        // 更新版本信息
        PipCommDictVersion dictVersion = new PipCommDictVersion();
        dictVersion.setId(log.getId());
        dictVersion.setFileId(log.getFileId());
        dictVersion.setDictVersion(versionCode);
        int sum = updateByPrimaryKeySelective(dictVersion);

        // 存储补丁包日志信息
        log.setId(Utils.generateUUID());
        log.setDictVersion(versionCode);
        log.setDictType(pipCommDictVersion.getDictType());
        log.setLccCode(pipCommDictVersion.getLccCode());
        log.setProjectId(pipCommDictVersion.getProjectId());
        logMapper.insertSelective(log);
        return sum;
    }

    @Override
    public List<?> dictVersionByDictType(String dictType) {
        PipCommDictVersionExample example = new PipCommDictVersionExample();
        example.createCriteria().andDictTypeEqualTo(dictType);
        return dictVersionMapper.selectByExample(example);
    }

}
