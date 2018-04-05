package com.jet.datasync.bdcor3.controller;

import com.jet.datasync.bdcor3.domain.PipCommLcc3;
import com.jet.datasync.bdcor3.domain.PipCommLccUser3;
import com.jet.datasync.bdcor3.domain.PipCommRcc3;
import com.jet.datasync.bdcor3.filter.PipScmFrozenbox3Filter;
import com.jet.datasync.bdcor3.filter.PipScmFrozentube3Filter;
import com.jet.datasync.bdcor3.proto.*;
import com.jet.datasync.bdcor3.service.Bdcor3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/10 下午7:43
 */
@RestController
@RequestMapping("/bdcor3")
public class SyncDataFromBdcor3Controller {

    @Autowired
    private Bdcor3Service bdcor3Service;

    @GetMapping(value = "/frozenboxes", produces = "application/x-protobuf")
    public PipScmFrozenboxProtos.TransPipScmFrozenboxes syncScmFrozenbox(PipScmFrozenbox3Filter filter) {
        return bdcor3Service.queryScmFrozenboxes(filter);
    }

    @GetMapping(value = "/frozentubes", produces = "application/x-protobuf")
    public PipScmFrozentubeProtos.TransPipScmFrozentubes syncScmFrozentube(PipScmFrozentube3Filter filter) {
        return bdcor3Service.queryScmFrozentubes(filter);
    }

    @GetMapping(value = "/rccs", produces = "application/x-protobuf")
    public PipCommRccProtos.TransPipCommRcc syncRcc(PipCommRcc3 pipCommRcc) {
        return bdcor3Service.queryCommRcc(pipCommRcc);
    }

    @GetMapping(value = "/lccs", produces = "application/x-protobuf")
    public PipCommLccProtos.TransPipCommLcc syncLcc(PipCommLcc3 pipCommLcc) {
        return bdcor3Service.queryCommLcc(pipCommLcc);
    }

    @GetMapping(value = "/lccusers", produces = "application/x-protobuf")
    public PipCommLccUserProtos.TransPipCommLccUser syncLccUser(PipCommLccUser3 pipCommLccUser) {
        return bdcor3Service.queryCommLccUser(pipCommLccUser);
    }
}
