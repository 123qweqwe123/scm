package com.jet.datasync.bdcor2.service;

import com.jet.datasync.bdcor2.filter.PipScmFrozenbox2Filter;
import com.jet.datasync.bdcor2.filter.PipScmFrozentube2Filter;
import com.jet.datasync.bdcor2.proto.PipScmFrozenboxProtos;
import com.jet.datasync.bdcor2.proto.PipScmFrozentubeProtos;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/21 上午10:42
 */
public interface Bdcor2Service {

    /**
     * 同步全量数据
     * @param filter
     * @return
     */
    PipScmFrozenboxProtos.TransPipScmFrozenboxes queryScmFrozenboxes(PipScmFrozenbox2Filter filter);

    /**
     * 同步全量数据
     * @param filter
     * @return
     */
    PipScmFrozentubeProtos.TransPipScmFrozentubes queryScmFrozentubes(PipScmFrozentube2Filter filter);
}
