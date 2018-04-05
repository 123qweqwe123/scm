package com.jet.scm.thirdservice;

import com.jet.scm.thirdservice.sms.SMSService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午3:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SMSTests {

    @Autowired
    private SMSService smsService;

    @Test
    public void testSend() throws InterruptedException {
        smsService.send("13501218675", "这是一条测试的短信");
        Thread.sleep(10000);
    }
}
