package com.jet.scm.thirdservice.datasync.bdcor3;

/**
 * Description:
 * <pre>
 *     同步数据到高危三期
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/24 下午1:29
 */
public interface SyncDataToBdcor3Service {

    /**
     * 回传中心是否已接收冻存盒状态
     */
    void syncPipScmFrozenboxesOfIsCheckin(String boxesStr);
}
