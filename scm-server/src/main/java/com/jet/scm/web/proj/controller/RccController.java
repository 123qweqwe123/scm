package com.jet.scm.web.proj.controller;

import com.jet.scm.web.proj.domain.PipCommRcc;
import com.jet.scm.web.proj.service.RccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 * <pre>
 *     rcc 管理
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/30 上午10:09
 */
@RestController
@RequestMapping("/proj/rccs")
public class RccController {

    @Autowired
    private RccService rccService;

    @GetMapping
    public List<PipCommRcc> rccs() {
        return rccService.queryRccs();
    }

}
