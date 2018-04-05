package com.jet.scm.web.sys.service.impl;

import com.jet.scm.core.constant.AppConsts;
import com.jet.scm.core.exception.ValidatorException;
import com.jet.scm.core.utils.*;
import com.jet.scm.web.sys.domain.*;
import com.jet.scm.web.sys.filter.*;
import com.jet.scm.web.sys.mapper.*;
import com.jet.scm.web.sys.qo.TreeSortQO;
import com.jet.scm.web.sys.service.SysService;
import com.jet.scm.web.sys.vo.MenuPermissionTreeVO;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午2:58
 */
@Service
public class SysServiceImpl implements SysService {

    Logger logger = LoggerFactory.getLogger(SysServiceImpl.class);

    @Autowired
    private SysAccountMapper sysAccountMapper;

    @Autowired
    private SysAccountRoleMapper sysAccountRoleMapper;

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Autowired
    private SysDataSyncMapper sysDataSyncMapper;

    @Autowired
    private SysDataSyncLogMapper sysDataSyncLogMapper;

    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

    @Override
    public List<SysAccount> selectByFilter(AccountFilter filter) {
        return sysAccountMapper.selectByFilter(filter);
    }

    @Override
    public void createAccount(SysAccount account, String[] roleIds) {
        account.setId(Utils.generateUUID());
        account.setCreateDatetime(new Date());
        account.setCreateUser(Securitys.getAccountId());
        account.setHelpCode(PinyingUtils.getJM(account.getName()));
        byte[] salt = Digests.generateSalt(8);
        account.setSalt(PasswordUtils.encodeHex(salt));
        account.setPassword(PasswordUtils.getEncodePassWord(account.getPassword(), salt));
        sysAccountMapper.insertSelective(account);

        createAccountRole(account.getId(), roleIds);
    }

    @Override
    public void updateAccount(SysAccount account, String[] roleIds) {
        account.setUpdateDatetime(new Date());
        account.setUpdateUser(Securitys.getAccountId());
        if(StringUtils.isNotBlank(account.getPassword())) {
            byte[] salt = Digests.generateSalt(8);
            account.setSalt(PasswordUtils.encodeHex(salt));
            account.setPassword(PasswordUtils.getEncodePassWord(account.getPassword(), salt));
        }
        sysAccountMapper.updateByPrimaryKeySelective(account);

        SysAccountRoleExample exp = new SysAccountRoleExample();
        exp.createCriteria().andAccountIdEqualTo(account.getId());
        sysAccountRoleMapper.deleteByExample(exp);
        if(roleIds != null) {
            createAccountRole(account.getId(), roleIds);
        }
    }

    // 创建角色账号关联关系
    private void createAccountRole(String accountId, String[] roleIds) {
        for (String roleId : roleIds) {
            SysAccountRoleKey roleKey = new SysAccountRoleKey();
            roleKey.setAccountId(accountId);
            roleKey.setRoleId(roleId);
            sysAccountRoleMapper.insert(roleKey);
        }
    }

    @Override
    public void deleteAccount(String id) {
        sysAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void selectAccountByLoginName(String q) {
        if (StringUtils.isBlank(q)) {
            throw new ValidatorException("账户名不能为空");
        }
        SysAccountExample exp = new SysAccountExample();
        exp.createCriteria().andLoginNameEqualTo(q);
        List<SysAccount> accounts = sysAccountMapper.selectByExample(exp);
        if (accounts.size() > 0) {
            throw new ValidatorException("账户名已存在");
        }
    }

    @Override
    public Map<String, Object> queryMenus() {
        Map<String, Object> trees = Maps.newHashMap();
        SysMenuExample menuExample = new SysMenuExample();
        menuExample.setOrderByClause("MENU_LEVEL, SEQUENCE asc");
        trees.put("menuTree", sysMenuMapper.selectByExample(menuExample));

        SysPermissionExample permissionExample = new SysPermissionExample();
        permissionExample.createCriteria().andIsResourceEqualTo(AppConsts.IS_RESOURCE_MENU);
        permissionExample.setOrderByClause("PERMISSION_LEVEL, SEQUENCE asc");
        List<MenuPermissionTreeVO> menuPermissionTree = Lists.newArrayList();
        sysPermissionMapper.selectByExample(permissionExample).forEach(el -> {
            MenuPermissionTreeVO treeVO = new MenuPermissionTreeVO();
            treeVO.setLabel(el.getName());
            treeVO.setValue(el.getId() + "");
            treeVO.setParentId(el.getParentId());
            menuPermissionTree.add(treeVO);
        });
        trees.put("menuPermissionTree", menuPermissionTree);
        return trees;
    }

    @Override
    public void createMenu(SysMenu menu) {
        menu.setId(Utils.generateUUID());
        menu.setCreateUser(Securitys.getAccountId());
        menu.setCreateDatetime(new Date());
        SysMenuExample exp = new SysMenuExample();
        if (StringUtils.isBlank(menu.getMpid())) {
            exp.createCriteria().andMpidIsNull();
        } else {
            exp.createCriteria().andMpidEqualTo(menu.getMpid());
        }
        List<SysMenu> menus = sysMenuMapper.selectByExample(exp);
        menu.setSequence(menus.size() + 1);
        int menuLevel = 1;  // 默认是1级菜单
        // mpid=-1,不在菜单导航栏显示的菜单
        if (StringUtils.isNotBlank(menu.getMpid()) && !AppConsts.SUB_MENU.equals(menu.getMpid())) {
            menuLevel = sysMenuMapper.selectByPrimaryKey(menu.getMpid()).getMenuLevel() + 1;
        } else if (AppConsts.SUB_MENU.equals(menu.getMpid())) {
            menuLevel = -1;
        }
        if (menuLevel == 1) {    // 1级菜单除了管理控制台，其它菜单的面包屑父节点都是管理控制台
            menu.setBpid(AppConsts.MENU_ROOT_BPID);
        }
        menu.setMenuLevel(menuLevel);
        sysMenuMapper.insertSelective(menu);
    }

    @Override
    public void updateMenu(SysMenu menu) {
        menu.setUpdateUser(Securitys.getAccountId());
        menu.setUpdateDatetime(new Date());
        sysMenuMapper.updateByPrimaryKeySelective(menu);
    }

    @Override
    public void deleteMenu(String id) {
        SysMenuExample exp = new SysMenuExample();
        exp.createCriteria().andMpidEqualTo(id);
        List<SysMenu> menus = sysMenuMapper.selectByExample(exp);
        if (menus.size() > 0) {
            throw new ValidatorException("有子节点不能删除");
        }
        sysMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void sortMenu(TreeSortQO sortQO) {
        String dragKey = sortQO.getDragKey();
        SysMenu dragMenu = sysMenuMapper.selectByPrimaryKey(dragKey);
        String parentId = dragMenu.getMpid();
        SysMenuExample exp = new SysMenuExample();
        if (StringUtils.isBlank(parentId)) {
            exp.createCriteria().andMpidIsNull();
        } else {
            exp.createCriteria().andMpidEqualTo(parentId);
        }
        exp.setOrderByClause("SEQUENCE asc");
        List menus = sysMenuMapper.selectByExample(exp);
        menus.remove(dragMenu.getSequence() - 1);
        sortAndUpdate(sortQO, menus, dragMenu);
    }

    @Override
    public void menuNameValidation(String q) {
        SysMenuExample exp = new SysMenuExample();
        exp.createCriteria().andNameEqualTo(q);
        List<SysMenu> menus = sysMenuMapper.selectByExample(exp);
        if (menus.size() > 0) {
            throw new ValidatorException("菜单名称不能重复");
        }
    }

    @Override
    public List<?> queryPermissions() {
        SysPermissionExample exp = new SysPermissionExample();
        exp.setOrderByClause("PERMISSION_LEVEL, SEQUENCE asc");
        return sysPermissionMapper.selectByExample(exp);
    }

    @Override
    public void createPermission(SysPermission permission) {
        SysPermissionExample exp = new SysPermissionExample();
        int permissionLevel = 1;//默认1级权限
        if (StringUtils.isBlank(permission.getParentId())) {
            exp.createCriteria().andParentIdIsNull();
        } else {
            exp.createCriteria().andParentIdEqualTo(permission.getParentId());
            permissionLevel = sysPermissionMapper.selectByPrimaryKey(permission.getParentId()).getPermissionLevel() + 1;
        }
        List<SysPermission> permissions = sysPermissionMapper.selectByExample(exp);
        permission.setPermissionLevel(permissionLevel);
        permission.setSequence(permissions.size() + 1);
        permission.setCreateUser(Securitys.getAccountId());
        permission.setCreateDatetime(new Date());
        permission.setId(Utils.generateUUID());
        sysPermissionMapper.insertSelective(permission);
    }

    @Override
    public void updatePermission(SysPermission permission) {
        permission.setUpdateUser(Securitys.getAccountId());
        permission.setUpdateDatetime(new Date());
        sysPermissionMapper.updateByPrimaryKeySelective(permission);
    }

    @Override
    public void deletePermission(String id) {
        // 如果当前节点有子节点，则不能删除
        SysPermissionExample exp = new SysPermissionExample();
        exp.createCriteria().andParentIdEqualTo(id);
        List<SysPermission> permissions = sysPermissionMapper.selectByExample(exp);
        if (permissions.size() > 0) {
            throw new ValidatorException("有子节点不能删除");
        }
        sysPermissionMapper.deleteByPrimaryKey(id);
    }

    /**
     * 重新排列菜单顺序
     *
     * @param sortQO
     */
    @Override
    public void sortPermission(TreeSortQO sortQO) {
        String dragKey = sortQO.getDragKey();
        SysPermission dragPermission = sysPermissionMapper.selectByPrimaryKey(dragKey);
        String parentId = dragPermission.getParentId();
        SysPermissionExample exp = new SysPermissionExample();
        if (parentId == null) {
            exp.createCriteria().andParentIdIsNull();
        } else {
            exp.createCriteria().andParentIdEqualTo(parentId);
        }
        exp.setOrderByClause("SEQUENCE asc");
        List permissions = sysPermissionMapper.selectByExample(exp);
        permissions.remove(dragPermission.getSequence() - 1);
        sortAndUpdate(sortQO, permissions, dragPermission);
    }

    @Override
    public void permissionNameValidation(String q) {
        SysPermissionExample exp = new SysPermissionExample();
        exp.createCriteria().andNameEqualTo(q);
        List<SysPermission> permissions = sysPermissionMapper.selectByExample(exp);
        if (permissions.size() > 0) {
            throw new ValidatorException("权限名称已经存在");
        }
    }

    @Override
    public List<?> queryRoles(RoleFilter roleFilter) {
        return sysRoleMapper.selectByFilter(roleFilter);
    }

    @Override
    public void createRole(SysRole role, String[] permissions) {
        role.setCreateUser(Securitys.getAccountId());
        role.setCreateDatetime(new Date());
        role.setHelpCode(PinyingUtils.getJM(role.getName()));
        role.setId(Utils.generateUUID());
        sysRoleMapper.insertSelective(role);

        createRolePermissions(role, permissions);
    }

    @Override
    public void updateRole(SysRole role, String[] permissions) {
        role.setUpdateUser(Securitys.getAccountId());
        role.setUpdateDatetime(new Date());
        role.setHelpCode(PinyingUtils.getJM(role.getName()));
        sysRoleMapper.updateByPrimaryKeySelective(role);

        // 删除关联关系之后创建
        deleteRolePermissionsByRoleId(role.getId());
        createRolePermissions(role, permissions);
    }

    // 添加角色权限关联关系
    private void createRolePermissions(SysRole role, String[] permissionIds) {
        for (String permissionId : permissionIds) {
            SysRolePermissionKey rolePermission = new SysRolePermissionKey();
            rolePermission.setRoleId(role.getId());
            rolePermission.setPermissionsId(permissionId);
            sysRolePermissionMapper.insert(rolePermission);
        }
    }

    // 删除角色权限关联关系
    private void deleteRolePermissionsByRoleId(String roleId) {
        SysRolePermissionExample exp = new SysRolePermissionExample();
        exp.createCriteria().andRoleIdEqualTo(roleId);
        sysRolePermissionMapper.deleteByExample(exp);
    }

    @Override
    public void deleteRole(String id) {
        sysRoleMapper.deleteByPrimaryKey(id);
        deleteRolePermissionsByRoleId(id);
    }

    @Override
    public void selectRoleByRoleName(String q) {
        SysRoleExample exp = new SysRoleExample();
        exp.createCriteria().andNameEqualTo(q);
        List<SysRole> roles = sysRoleMapper.selectByExample(exp);
        if (roles.size() > 0) {
            throw new ValidatorException("角色名称已存在");
        }
    }

    @Override
    public List<?> selectDataSyncByFilter(DataSyncFilter filter) {
        return sysDataSyncMapper.selectByFilter(filter);
    }

    @Override
    public List<?> selectSyncLogsByFilter(DataSyncLogFilter filter) {
        return sysDataSyncLogMapper.selectByFilter(filter);
    }

    @Override
    public int createOrUpdateDataSync(SysDataSync dataSync) {
        dataSync.setUpdateBy(Securitys.getUser().getName());
        dataSync.setUpdateTime(new Date());
        if (StringUtils.isEmpty(dataSync.getId())) {
            dataSync.setCreateBy(Securitys.getUser().getAccountId());
            dataSync.setCreateTime(new Date());
            dataSync.setId(Utils.generateUUID());
            return sysDataSyncMapper.insert(dataSync);
        } else {
            SysDataSyncExample example = new SysDataSyncExample();
            example.createCriteria().andIdEqualTo(dataSync.getId());
            return sysDataSyncMapper.updateByExampleSelective(dataSync, example);
        }
    }

    /**
     * //TODO
     * 对 permission 和 menu 排序，因为逻辑一致，就报代码重复，只好用下面的代码整合一下
     * 但是还是很难看，日后再想办法
     *
     * @param sortQO
     * @param sortObjs
     * @param dragObj
     */
    private void sortAndUpdate(TreeSortQO sortQO, List<Object> sortObjs, Object dragObj) {
        try {
            final boolean forceAccessField = true;
            String dropKey = sortQO.getDropKey();
            for (int i = 0; i < sortObjs.size(); i++) {
                Object sortObj = sortObjs.get(i);
                String fieldName = "id";
                String id = (String) FieldUtils.readField(sortObj, fieldName, forceAccessField);
                if (id.equals(dropKey)) {
                    if (sortQO.getDropPosition() == 1) {
                        sortObjs.add(i + 1, dragObj);
                        break;
                    } else {
                        sortObjs.add(i, dragObj);
                        break;
                    }
                }
            }
            for (int i = 1; i <= sortObjs.size(); i++) {
                Object sortObj = sortObjs.get(i - 1);
                int sequence = (int) FieldUtils.readField(sortObj, "sequence", forceAccessField);
                if (sequence != i) {
                    FieldUtils.writeField(sortObj, "sequence", i, forceAccessField);
                    FieldUtils.writeField(sortObj, "updateDatetime", new Date(), forceAccessField);
                    FieldUtils.writeField(sortObj, "updateUser", Securitys.getAccountId(), forceAccessField);
                    if (sortObj instanceof SysPermission) {
                        SysPermission realSortObj = (SysPermission) sortObj;
                        sysPermissionMapper.updateByPrimaryKeySelective(realSortObj);
                    }
                    if (sortObj instanceof SysMenu) {
                        SysMenu realSortObj = (SysMenu) sortObj;
                        sysMenuMapper.updateByPrimaryKeySelective(realSortObj);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw Exceptions.unchecked(e);
        }
    }

    @Override
    public List<?> selectLoginLogByFilter(LoginLogFilter filter) {
        return sysLoginLogMapper.selectByFilter(filter);
    }
}
