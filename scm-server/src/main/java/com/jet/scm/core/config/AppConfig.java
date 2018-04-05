package com.jet.scm.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description:
 * <pre>
 *     加载 message.properties ，通过 env 使用
 *     @Autowired
 *     Environment env;
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/16 下午12:59
 */
@Configuration
@PropertySource(value = "classpath:/message.properties", encoding = "UTF-8")
public class AppConfig{

}
