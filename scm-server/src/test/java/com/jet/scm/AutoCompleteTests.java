package com.jet.scm;

import com.jet.scm.web.common.vo.AutoCompleteVO;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/24 下午5:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AutoCompleteTests {

    private TestRestTemplate restTemplate = new TestRestTemplate();


    @Test
    public void autoCompleteTest() {
        String url = "sys/account";
        Map<String, String> params = Maps.newHashMap();
        params.put("q", "ad");
        params.put("s", "ac1");
        ResponseEntity<AutoCompleteVO> resp = restTemplate.postForEntity(url, params, AutoCompleteVO.class);
    }
}
