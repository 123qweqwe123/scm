package com.jet.scm.thirdservice;

import com.jet.scm.thirdservice.mail.MailService;
import com.jet.scm.thirdservice.mail.domain.MailEntity;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午3:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MailTests {

    @Autowired
    private MailService mailService;

    @Test
    public void sendTests() throws InterruptedException {
        MailEntity entity = new MailEntity();
        entity.setContent("测试邮件");
        entity.setSubject("这是一个测试邮件");
        List<String> to = Lists.newArrayList();
        to.add("532093012@qq.com");
        entity.setTo(to);
        mailService.send(entity);
        Thread.sleep(10000);
    }
}
