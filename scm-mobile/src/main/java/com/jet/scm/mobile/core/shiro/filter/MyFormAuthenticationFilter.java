package com.jet.scm.mobile.core.shiro.filter;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Description:
 * <pre>
 *     自定义 authc 的 filter，1.添加登录日志 2.初始化授权行为
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/5 上午8:31
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        AuthenticationToken token = createToken(request, response);
        if (token == null) {
            String msg = "createToken method implementation returned null. A valid non-null AuthenticationToken " +
                    "must be created in order to execute a login attempt.";
            throw new IllegalStateException(msg);
        }
        try {
            Subject subject = getSubject(request, response);
            subject.login(token);
            // 执行授权操作
            return onLoginSuccess(token, subject, request, response);
        } catch (AuthenticationException e) {
            //throw e;
            return onLoginFailure(token, e, request, response);
        }
    }

    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject,
                                     ServletRequest request, ServletResponse response) throws Exception {
        // 返回 true，将继续调用 @PostMapping("/login")
        return true;
    }

}
