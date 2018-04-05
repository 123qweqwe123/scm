package com.jet.scm.core.config;

import com.jet.scm.core.mvc.interceptor.WebInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/25 下午6:26
 */
@Configuration
@RestController
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("classpath:/static/index.html")
    private Resource indexHtml;

    /**
     * 拦截器，对分页进行拦截
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebInterceptor()).addPathPatterns("/**");//.excludePathPatterns("/**");
    }


    /**
     * TODO 除了index.html之外的静态文件，如图片/css/js等都要单独开启一个映射，是否有统一解决方案？
     *
     * @param request
     * @return
     */
    @GetMapping("/**")
    public Object index(HttpServletRequest request) {
        return ResponseEntity.ok().body(indexHtml);
    }

    @GetMapping("{name}.css")
    public Object css(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".css");
    }

    @GetMapping("{name}.js")
    public Object js(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".js");
    }

    @GetMapping("{name}.png")
    public Object png(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".png");
    }

    @GetMapping("{name}.jpg")
    public Object jpg(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".jpg");
    }

    @GetMapping("{name}.eot")
    public Object eot(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".eot");
    }

    @GetMapping("{name}.svg")
    public Object svg(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".svg");
    }

    @GetMapping("{name}.ttf")
    public Object ttf(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".ttf");
    }

    @GetMapping("{name}.woff")
    public Object woff(@PathVariable String name) {
        return new ClassPathResource("static/" + name + ".woff");
    }


    @GetMapping("/static/*")
    public Object jpg(HttpServletRequest request) {
        String name = request.getRequestURI();
        return new ClassPathResource("static/" + name);
    }

    @GetMapping("/antd/{name}.{suffix}")
    public Object antd(@PathVariable String name, @PathVariable String suffix) {
        return new ClassPathResource("static/antd/" + name + "." + suffix);
    }
}
