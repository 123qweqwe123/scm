package com.jet.scm.web.sys.service;

import com.jet.scm.web.sys.domain.SysAccount;
import com.jet.scm.web.sys.qo.UserQO;

import javax.servlet.ServletRequest;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/16 上午11:56
 */
public interface UserService {

    Map<String, Object> getUser();

    /**
     * 登录校验
     *
     * @param userQO
     * @return
     */
    SysAccount login(UserQO userQO);

    /**
     * 添加退出日志
     *
     * @param loginLogId
     */
    void createLogoutLog(String loginLogId);

    /**
     * 添加登录日志
     *
     * @param request
     */
    void createLoginLog(ServletRequest request);
}
