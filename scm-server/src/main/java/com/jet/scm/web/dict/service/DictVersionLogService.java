package com.jet.scm.web.dict.service;

import com.jet.scm.web.dict.domain.JetCommDictVersionLog;

import java.util.List;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/27
 */
public interface DictVersionLogService {

    List<?> dictVersionLogs(JetCommDictVersionLog log);
}
