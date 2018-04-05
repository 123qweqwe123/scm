package com.jet.scm.mobile.core.mvc.filter;

import com.jet.scm.mobile.core.mvc.filter.domain.UrlDecodeHttpRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 下午6:30
 */
@Component
@Order(1)
public class UrlDecodeFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        chain.doFilter(new UrlDecodeHttpRequest(httpServletRequest), response);
    }

    @Override
    public void destroy() {

    }
}
