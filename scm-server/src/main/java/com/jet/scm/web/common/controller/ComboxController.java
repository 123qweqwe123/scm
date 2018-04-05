package com.jet.scm.web.common.controller;

import com.jet.scm.web.common.service.CommonService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 * <pre>
 *     前端 Select/AutoComplete
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/24 下午2:35
 */
@RestController
@RequestMapping("/common/combox")
public class ComboxController {

    private final CommonService commonService;

    @Autowired
    public ComboxController(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * @param q 搜索补全字符串
     * @param s 搜索框标识
     * @return 组装的缓存列表
     */
    @GetMapping("/autoComplete")
    public List<?> autoComplete(String q, String s, Integer limit) {
        return commonService.queryAutoComplete(q, s, limit);
    }

    @GetMapping("/select")
    public List<?> autoComplete(String q) {
        if (StringUtils.isBlank(q)) {
            return null;
        }
        return commonService.querySelect(q);
    }

}
