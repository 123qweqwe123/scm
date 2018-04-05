package com.jet.scm.web.sys.vo;

import com.jet.scm.web.sys.domain.SysRole;

/**
 * Description:
 * <pre>
 *     添加角色对应的权限列表
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/8 下午1:45
 */
public class SysRoleVO extends SysRole {

    private String permissionNames;

    private String permissionIds;

    public String getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(String permissionNames) {
        this.permissionNames = permissionNames;
    }

    public String getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(String permissionIds) {
        this.permissionIds = permissionIds;
    }
}
