package com.jet.scm.thirdservice.datasync.bdcor3.impl;

import com.google.common.collect.Maps;
import com.jet.scm.thirdservice.datasync.bdcor3.SyncDataToBdcor3Service;
import com.jet.scm.thirdservice.datasync.config.ISyncDataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/24 下午1:31
 */
@Service
public class SyncDataToBdcor3ServiceImpl implements SyncDataToBdcor3Service {

    Logger logger = LoggerFactory.getLogger(SyncDataToBdcor3ServiceImpl.class);

    @Autowired
    private ISyncDataManager syncDataManager;

    @Async
    @Override
    public void syncPipScmFrozenboxesOfIsCheckin(String boxesStr) {
        Map<String, String> params = Maps.newHashMap();
        params.put("boxesStr", boxesStr);
        String result = new String(syncDataManager.doPost("/bdcor3/frozenboxes", params));
        if ("success".equals(result)) {
            logger.info("标记高危三期冻存盒状态为中心已入库成功，冻存盒列表为{}", boxesStr);
        } else {
            logger.error("标记高危三期冻存盒状态为中心失败,{}", result);
        }
    }
}
