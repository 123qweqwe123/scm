package com.jet.scm.web.dict.service.impl;

import com.jet.scm.web.dict.domain.JetCommDictVersionLog;
import com.jet.scm.web.dict.domain.JetCommDictVersionLogExample;
import com.jet.scm.web.dict.mapper.JetCommDictVersionLogMapper;
import com.jet.scm.web.dict.service.DictVersionLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/27
 */

@Service
public class DictVersionLogServiceImpl implements DictVersionLogService {

    @Autowired
    JetCommDictVersionLogMapper dictVersionLogMapper;

    @Override
    public List<?> dictVersionLogs(JetCommDictVersionLog log) {
        JetCommDictVersionLogExample example = new JetCommDictVersionLogExample();
        JetCommDictVersionLogExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(log.getDictType())) {
            criteria.andDictTypeEqualTo(log.getDictType());
        }

        example.setOrderByClause("DICT_VERSION DESC");
        return dictVersionLogMapper.selectByExample(example);
    }
}
