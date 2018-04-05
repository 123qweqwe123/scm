package com.jet.scm.mobile.core.config;

import com.jet.scm.mobile.core.mvc.filter.UrlDecodeFilter;
import com.jet.scm.mobile.core.mvc.interceptor.WebInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

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
public class AppConfig  extends WebMvcConfigurerAdapter {

    @Bean
    public FilterRegistrationBean myFilterBean() {
        final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        filterRegBean.setFilter(new UrlDecodeFilter());
        filterRegBean.addUrlPatterns("/*");
        filterRegBean.setEnabled(Boolean.TRUE);
        filterRegBean.setName("Meu Filter");
        filterRegBean.setAsyncSupported(Boolean.TRUE);
        return filterRegBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebInterceptor()).addPathPatterns("/**");
    }
//
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(new MyArgumentResolver());
//    }
}
