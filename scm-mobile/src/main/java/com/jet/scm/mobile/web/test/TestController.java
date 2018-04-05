package com.jet.scm.mobile.web.test;

import com.jet.scm.mobile.web.test.vo.TestVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 下午3:23
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public TestVO test(TestVO vo, int id) {
//        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
//        TestVO vo = new TestVO();
//        vo.setId(id);
        vo.setName("小明");
        vo.setId(id);
        return vo;
    }

}
