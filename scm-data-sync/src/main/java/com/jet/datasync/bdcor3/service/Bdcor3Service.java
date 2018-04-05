package com.jet.datasync.bdcor3.service;

import com.jet.datasync.bdcor3.domain.PipCommLcc3;
import com.jet.datasync.bdcor3.domain.PipCommLccUser3;
import com.jet.datasync.bdcor3.domain.PipCommRcc3;
import com.jet.datasync.bdcor3.filter.PipScmFrozenbox3Filter;
import com.jet.datasync.bdcor3.filter.PipScmFrozentube3Filter;
import com.jet.datasync.bdcor3.proto.*;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 上午9:25
 */
public interface Bdcor3Service {


    PipScmFrozenboxProtos.TransPipScmFrozenboxes queryScmFrozenboxes(PipScmFrozenbox3Filter filter);

    PipScmFrozentubeProtos.TransPipScmFrozentubes queryScmFrozentubes(PipScmFrozentube3Filter filter);

    PipCommRccProtos.TransPipCommRcc queryCommRcc(PipCommRcc3 pipCommRcc);

    PipCommLccProtos.TransPipCommLcc queryCommLcc(PipCommLcc3 pipCommLcc);

    PipCommLccUserProtos.TransPipCommLccUser queryCommLccUser(PipCommLccUser3 pipCommLccUser);

    String syncBoxStatus(PipScmFrozenbox3Filter filter);
}
