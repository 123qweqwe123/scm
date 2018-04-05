package com.jet.scm.mobile.core.utils;

import com.jet.scm.mobile.core.shiro.domain.ShiroUser;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * <pre>
 *     shiro 工具类，操作当前的 Subject
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/4 下午9:48
 */
public class Securitys extends SecurityUtils {

    private static Logger logger = LoggerFactory.getLogger(Securitys.class);

    public static ShiroUser getUser() {
        if (getSubject().isAuthenticated()) {
            return (ShiroUser) getSubject().getPrincipal();
        }
        return new ShiroUser();
    }

    public static String getName() {
        return getUser().getName();
    }

    public static String getTel() {
        return getUser().getTel();
    }

    public static String getAccountId() {
        return getUser().getAccountId();
    }
}
