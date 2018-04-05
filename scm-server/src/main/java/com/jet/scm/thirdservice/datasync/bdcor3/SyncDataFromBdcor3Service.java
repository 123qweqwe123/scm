package com.jet.scm.thirdservice.datasync.bdcor3;

/**
 * Description:
 * <pre>
 *     从高危3期同步数据
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 下午1:07
 */
public interface SyncDataFromBdcor3Service{

    void syncPipScmFrozenboxes();

    void syncPipScmFrozentubes();

    void syncPipCommRccs();

    void syncPipCommLccs();

    void syncPipCommLccUsers();

}
