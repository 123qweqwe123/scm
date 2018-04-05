package com.jet.datasync.bdcor3.controller;

import com.jet.datasync.bdcor3.filter.PipScmFrozenbox3Filter;
import com.jet.datasync.bdcor3.service.Bdcor3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/24 下午1:01
 */
@RestController
@RequestMapping("/bdcor3")
public class SyncDataToBdcor3Controller {

    @Autowired
    private Bdcor3Service bdcor3Service;


    @PostMapping(value = "/frozenboxes")
    public String syncBoxStatus(PipScmFrozenbox3Filter filter) {
        return bdcor3Service.syncBoxStatus(filter);
    }

}
