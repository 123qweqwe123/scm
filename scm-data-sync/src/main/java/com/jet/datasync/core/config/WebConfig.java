package com.jet.datasync.core.config;

import com.jet.datasync.core.interceptor.WebInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/11 下午3:33
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


    /**
     * 拦截器，对所有请求进行过滤，通过账号密码对系统数据访问权限鉴定
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebInterceptor()).addPathPatterns("/**").excludePathPatterns("/login*");
    }
}
