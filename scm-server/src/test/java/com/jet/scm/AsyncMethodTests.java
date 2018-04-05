package com.jet.scm;

import com.jet.scm.thirdservice.sms.SMSService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午2:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AsyncMethodTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    SMSService smsService;

    @Test
    public void asyncMethodTests() {
        smsService.send("11111", "22222");
        smsService.send("11111", "22222");
        smsService.send("11111", "22222");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
