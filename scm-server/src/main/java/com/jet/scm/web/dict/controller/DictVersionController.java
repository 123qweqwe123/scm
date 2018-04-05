package com.jet.scm.web.dict.controller;

import com.jet.scm.web.dict.domain.JetCommDictBioErCode;
import com.jet.scm.web.dict.domain.JetCommDictVersionLog;
import com.jet.scm.web.dict.domain.PipCommDictVersion;
import com.jet.scm.web.dict.filter.DictVersionFilter;
import com.jet.scm.web.dict.service.DictBioErCodeService;
import com.jet.scm.web.dict.service.DictVersionLogService;
import com.jet.scm.web.dict.service.DictVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/3
 */

@RestController
@RequestMapping("/dict")
public class DictVersionController {

    public static final String DICT_TYPE = "1";

    @Autowired
    DictVersionService dictVersionService;

    @Autowired
    DictVersionLogService dictVersionLogService;

    @Autowired
    DictBioErCodeService dictBioErCodeService;

    @GetMapping("/versions")
    public List<?> versions(DictVersionFilter filter) {
        return dictVersionService.dictVersions(filter);
    }

    @PatchMapping("/updateVersion")
    public int updateVersion(JetCommDictVersionLog log) {
        return dictVersionService.updateVersionByPrimaryKey(log);
    }

    @GetMapping("/errorCodes")
    public List<?> errorCodes(JetCommDictBioErCode errorCode) {
        return dictBioErCodeService.getBioErrorCodeList(errorCode);
    }

    @GetMapping("/bioErCode/validationVcode")
    public void validationVcode(JetCommDictBioErCode errorCode) {
        dictBioErCodeService.validateVcode(errorCode);
    }

    @PostMapping("/createOrUpdateDictBioErCode")
    public int createOrUpdateDictBioErCode(JetCommDictBioErCode errorCode) {
        // 更新错误编码
        int i = dictBioErCodeService.createOrUpdate(errorCode);
        // 更新dict_type = 1的版本号
        DictVersionFilter filter = new DictVersionFilter();
        filter.setDictType(DICT_TYPE);
        dictVersionService.updateVersionByType(filter);
        return i;
    }

    @GetMapping("/treeErrCodes")
    public List<?> treeErrCodes() {
        return dictBioErCodeService.queryErrCodes();
    }

    /**
     * 查询补丁包的历史版本
     * @param log
     * @return
     */
    @GetMapping("/versionLogs")
    public List<?> versions(JetCommDictVersionLog log) {
        return dictVersionLogService.dictVersionLogs(log);
    }
}
