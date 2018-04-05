package com.jet.datasync.bdcor2.controller;

import com.jet.datasync.bdcor2.filter.PipScmFrozenbox2Filter;
import com.jet.datasync.bdcor2.filter.PipScmFrozentube2Filter;
import com.jet.datasync.bdcor2.proto.PipScmFrozenboxProtos;
import com.jet.datasync.bdcor2.proto.PipScmFrozentubeProtos;
import com.jet.datasync.bdcor2.service.Bdcor2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/21 上午10:42
 */
@RestController
@RequestMapping("/bdcor2")
public class SyncDataFromBdcor2Controller {

    @Autowired
    private Bdcor2Service bdcor2Service;

    @GetMapping(value = "/frozenboxes", produces = "application/x-protobuf")
    public PipScmFrozenboxProtos.TransPipScmFrozenboxes syncScmFrozenbox(PipScmFrozenbox2Filter filter) {
        return bdcor2Service.queryScmFrozenboxes(filter);
    }

    @GetMapping(value = "/frozentubes", produces = "application/x-protobuf")
    public PipScmFrozentubeProtos.TransPipScmFrozentubes syncScmFrozentube(PipScmFrozentube2Filter filter) {
        return bdcor2Service.queryScmFrozentubes(filter);
    }

}
