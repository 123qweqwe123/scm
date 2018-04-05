package com.jet.scm.mobile.core.shiro.filter;

import org.apache.shiro.web.filter.authc.UserFilter;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 * <pre>
 *     重写 userFilter ，所有的访问请求如果没有认证则返回状态码 401
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/31 下午2:31
 */
public class MyUserFilter extends UserFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
        return false;
    }

}
