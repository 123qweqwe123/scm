package com.jet.scm.core.shiro.domain;

import com.jet.scm.web.sys.domain.SysMenu;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/4 下午5:47
 */
public class ShiroUser implements Serializable {

    private String accountId;
    private String loginName;
    private String name;
    private boolean isAdmin;// 是否系统级管理员
    private List<String> roleIdList;
    private List<SysMenu> menus;

    public ShiroUser() {

    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<String> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<String> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public List<SysMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<SysMenu> menus) {
        this.menus = menus;
    }
}
