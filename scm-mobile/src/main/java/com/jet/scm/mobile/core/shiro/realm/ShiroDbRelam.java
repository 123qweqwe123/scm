package com.jet.scm.mobile.core.shiro.realm;

import com.jet.scm.mobile.core.shiro.domain.ShiroUser;
import com.jet.scm.mobile.web.sys.domain.SysAccount;
import com.jet.scm.mobile.web.sys.qo.UserQO;
import com.jet.scm.mobile.web.sys.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 * <pre>
 *
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/16 下午12:59
 */
public class ShiroDbRelam extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 认证，
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());
        UserQO userQO = new UserQO(username, password);
        SysAccount account = userService.login(userQO);

        ShiroUser shiroUser = new ShiroUser();
        shiroUser.setName(account.getName());
        shiroUser.setTel(account.getTelNumber());
        shiroUser.setAccountId(account.getId());
        return new SimpleAuthenticationInfo(shiroUser,
                usernamePasswordToken.getPassword(), getName());
    }

    /**
     * 授权，只有代码中第一次鉴权的时候才会触发当前方法的执行
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return info;
    }

}
