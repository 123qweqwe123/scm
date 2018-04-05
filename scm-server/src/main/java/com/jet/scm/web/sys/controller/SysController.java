package com.jet.scm.web.sys.controller;

import com.jet.scm.web.spem.filter.SpemTransferFilter;
import com.jet.scm.web.sys.domain.*;
import com.jet.scm.web.sys.filter.*;
import com.jet.scm.web.sys.qo.TreeSortQO;
import com.jet.scm.web.sys.service.SysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 *
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午1:23
 */
@RestController
@RequestMapping("/sys")
public class SysController {

    Logger logger = LoggerFactory.getLogger(SysController.class);

    @Autowired
    private SysService sysService;

    /**
     * 显示账户列表
     *
     * @param filter
     */
    @GetMapping("/accounts")
    public List<?> accounts(AccountFilter filter) {
        return sysService.selectByFilter(filter);
    }

    /**
     * 添加账户
     *
     * @param account
     */
    @PostMapping("/accounts")
    public void createAccount(SysAccount account, String[] roleIds) {
        sysService.createAccount(account, roleIds);
    }

    /**
     * 修改账户
     *
     * @param account
     * @return
     */
    @PatchMapping("/accounts")
    public void updateAccount(SysAccount account, String[] roleIds) {
        sysService.updateAccount(account, roleIds);
    }

    /**
     * 删除账户
     *
     * @id account
     */
    @DeleteMapping("/accounts")
    public void deleteAccount(@RequestBody Map<String, String> params) {
        sysService.deleteAccount(params.get("id"));
    }

    /**
     * 验证登录账号是否重复
     *
     * @param q 输入的账号
     */
    @GetMapping("/accounts/loginNameValidation")
    public void loginNameValidation(String q) {
        sysService.selectAccountByLoginName(q);
    }


    /**
     * 显示菜单列表
     */
    @GetMapping("/menus")
    public Map<String, Object> menus() {
        return sysService.queryMenus();
    }

    /**
     * 添加菜单
     *
     * @param menu
     */
    @PostMapping("/menus")
    public void createMenu(SysMenu menu) {
        sysService.createMenu(menu);
    }

    /**
     * 修改菜单
     *
     * @param menu
     */
    @PatchMapping("/menus")
    public void updateMenu(SysMenu menu) {
        sysService.updateMenu(menu);
    }

    /**
     * 删除菜单
     *
     * @param params
     */
    @DeleteMapping("/menus")
    public void deleteMenu(@RequestBody Map<String, String> params) {
        sysService.deleteMenu(params.get("id"));
    }

    /**
     * 菜单树拖拽排序
     *
     * @param sortQO
     */
    @PatchMapping("/menus/sort")
    public void sortMenu(TreeSortQO sortQO) {
        sysService.sortMenu(sortQO);
    }

    /**
     * 校验菜单名称是否重复
     *
     * @param q 用户输入的角色名称
     */
    @GetMapping("/menus/menuNameValidation")
    public void menuNameValidation(String q) {
        sysService.menuNameValidation(q);
    }

    /**
     * 显示权限列表
     */
    @GetMapping("/permissions")
    public List<?> permissions() {
        return sysService.queryPermissions();
    }

    /**
     * 添加权限
     *
     * @param permission
     */
    @PostMapping("/permissions")
    public void createPermission(SysPermission permission) {
        sysService.createPermission(permission);
    }

    /**
     * 修改权限
     *
     * @param permission
     */
    @PatchMapping("/permissions")
    public void updatePermission(SysPermission permission) {
        sysService.updatePermission(permission);
    }

    /**
     * 删除权限
     *
     * @param params
     */
    @DeleteMapping("/permissions")
    public void deletePermission(@RequestBody Map<String, String> params) {
        sysService.deletePermission(params.get("id"));
    }

    /**
     * 权限树拖拽排序
     *
     * @param sortQO
     */
    @PatchMapping("/permissions/sort")
    public void sortPermission(TreeSortQO sortQO) {
        sysService.sortPermission(sortQO);
    }


    /**
     * 校验权限名称是否重复
     *
     * @param q 用户输入的角色名称
     */
    @GetMapping("/permissions/permissionNameValidation")
    public void permissionNameValidation(String q) {
        sysService.permissionNameValidation(q);
    }

    /**
     * 显示角色列表
     */
    @GetMapping("/roles")
    public List<?> roles(RoleFilter roleFilter) {
        return sysService.queryRoles(roleFilter);
    }

    /**
     * 添加角色
     *
     * @param role
     */
    @PostMapping("/roles")
    public void createRole(SysRole role, String[] permissions) {
        sysService.createRole(role, permissions);
    }

    /**
     * 修改角色
     *
     * @param role
     */
    @PatchMapping("/roles")
    public void updateRole(SysRole role, String[] permissions) {
        sysService.updateRole(role, permissions);
    }

    /**
     * 删除角色
     *
     * @param params
     */
    @DeleteMapping("/roles")
    public void deleteRole(@RequestBody Map<String, String> params) {
        sysService.deleteRole(params.get("id"));
    }

    /**
     * 角色名称校验
     *
     * @param q
     */
    @GetMapping("/roles/roleNameValidation")
    public void roleNameValidation(String q) {
        sysService.selectRoleByRoleName(q);
    }

    /**
     * 显示数据同步列表
     *
     * @param filter
     */
    @GetMapping("/dataSyncs")
    public List<?> dataSync(DataSyncFilter filter) {
        return sysService.selectDataSyncByFilter(filter);
    }

    /**
     * 更新数据同步信息
     * @param dataSync
     * @return
     */
    @PostMapping("/dataSyncs")
    public int createOrUpdateDataSync(SysDataSync dataSync) {
        return sysService.createOrUpdateDataSync(dataSync);
    }

    /**
     * 显示数据同步日志列表
     *
     * @param filter
     */
    @GetMapping("/dataSyncs/{syncId}/logs")
    public List<?> SyncLogs(DataSyncLogFilter filter) {
        return sysService.selectSyncLogsByFilter(filter);
    }

    /**
     * 登录日志列表
     *
     * @param filter
     */
    @GetMapping("/loginLogs")
    public List<?> loginLogs(LoginLogFilter filter) {
        return sysService.selectLoginLogByFilter(filter);
    }

}
