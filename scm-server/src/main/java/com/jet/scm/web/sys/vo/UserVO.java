package com.jet.scm.web.sys.vo;

import com.jet.scm.core.utils.Securitys;

import java.util.List;

/**
 * Description:
 * <pre>
 *     输出到前台界面使用，只输出部分 ShiroUser 信息
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/4 下午10:23
 */
public class UserVO {

    private UserVO() {
    }

    private String name;
    private String accountId;
    private boolean isAdmin;
    private List<String>  roles;
    private List<String> permissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public static UserVO buildUser() {
        if (!Securitys.getSubject().isAuthenticated()) {
            return null;
        }
        UserVO user = new UserVO();
        user.setName(Securitys.getName());
        user.setAccountId(Securitys.getAccountId());
        user.setAdmin(Securitys.isAdmin());
        // TODO: 前端通过 roles 和 permissions 来进行权限控制
        return user;
    }
}
