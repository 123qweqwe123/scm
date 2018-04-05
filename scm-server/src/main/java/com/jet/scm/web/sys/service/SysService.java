package com.jet.scm.web.sys.service;

import com.jet.scm.web.sys.domain.*;
import com.jet.scm.web.sys.filter.*;
import com.jet.scm.web.sys.qo.TreeSortQO;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午2:38
 */
public interface SysService {

    /**
     * 账户管理
     */
    List<SysAccount> selectByFilter(AccountFilter filter);

    void createAccount(SysAccount account, String[] roleIds);

    void updateAccount(SysAccount account, String[] roleIds);

    void deleteAccount(String id);

    void selectAccountByLoginName(String q);

    /**
     * 菜单管理
     */
    Map<String, Object> queryMenus();

    void createMenu(SysMenu menu);

    void updateMenu(SysMenu menu);

    void deleteMenu(String id);

    void menuNameValidation(String q);

    List<?> queryPermissions();

    void deletePermission(String id);

    void updatePermission(SysPermission permission);

    void createPermission(SysPermission permission);

    void sortPermission(TreeSortQO sortQO);

    void permissionNameValidation(String q);

    void sortMenu(TreeSortQO sortQO);

    List<?> queryRoles(RoleFilter roleFilter);

    void createRole(SysRole role, String[] permissions);

    void updateRole(SysRole role, String[] permissions);

    void deleteRole(String id);

    void selectRoleByRoleName(String q);

    List<?> selectDataSyncByFilter(DataSyncFilter filter);

    List<?> selectSyncLogsByFilter(DataSyncLogFilter filter);

    int createOrUpdateDataSync(SysDataSync dataSync);

    List<?> selectLoginLogByFilter(LoginLogFilter filter);
}
