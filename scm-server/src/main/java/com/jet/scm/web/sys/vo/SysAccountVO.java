package com.jet.scm.web.sys.vo;

import com.jet.scm.web.sys.domain.SysAccount;

/**
 * Description:
 * <pre>
 *     用于账户管理页面展示
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/8 下午4:23
 */
public class SysAccountVO extends SysAccount {

    private String roleNames;

    private String roleIds;


    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

}
