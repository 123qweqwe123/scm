package com.jet.scm.thirdservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.jet.scm.thirdservice.datasync.bdcor3.SyncDataFromBdcor3Service;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SyncDateFromBdcor3Test {

    SyncDataFromBdcor3Service service;

    @Test
    public void testSyncPipScmFrozentubes() {
        service.syncPipScmFrozentubes();
    }
}
