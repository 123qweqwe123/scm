package com.jet.scm.mobile.web.sys.service;


import com.jet.scm.mobile.web.sys.domain.SysAccount;
import com.jet.scm.mobile.web.sys.qo.UserQO;

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

}
