package com.jet.scm.mobile.core.constant;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/1 下午3:25
 */
public class AppConsts {

    public static final String PROJECT_ID = "07";

    /**
     * 系统里面所有 true 对应 1，数据库表字段类型为 number(1)
     */
    public static final Short TRUE = 1;
    /**
     * 系统里面所有 false 对应 0，数据库表字段类型为 number(1)
     */
    public static final Short FALSE = 0;

    /**
     * 菜单
     */
    public static final Short IS_RESOURCE_MENU = 1;
    /**
     * 有路由配置，但不在导航栏显示的菜单
     */
    public static final String SUB_MENU = "submenu";
    /**
     * 面包屑菜单导航父节点 ID
     */
    public static final String MENU_ROOT_BPID = "4dcab7f2ad5f4166996de3ff910ac8c2";

    /**
     * 登录URI
     */
    public static final String QUERY_USER_URI = "/user";

    /**
     * 已交付
     */
    public static final Short SCM_PROC_DETAIL_STATUS_1 = 1;
    /**
     * 新建
     */
    public static final Short SCM_PROC_DETAIL_STATUS_2 = 2;


    /**
     * 新任务
     */
    public static final Short SCM_PROC_MASTER_STATUS_1 = 1;
    /**
     * 转运中
     */
    public static final Short SCM_PROC_MASTER_STATUS_2 = 2;
    /**
     * 部分交付
     */
    public static final Short SCM_PROC_MASTER_STATUS_3 = 3;
    /**
     * 全部交付(所有明细都已上传附件)
     */
    public static final Short SCM_PROC_MASTER_STATUS_4 = 4;
    /**
     * 全部交付(页面点击交付按钮)
     */
    public static final Short SCM_PROC_MASTER_STATUS_5 = 5;


    /**
     * 发送邮件
     */
    public static final Short SCM_PROC_LOG_TYPE_1 = 1;
    /**
     * 发送短信
     */
    public static final Short SCM_PROC_LOG_TYPE_2 = 2;
    /**
     * 其他
     */
    public static final Short SCM_PROC_LOG_TYPE_3 = 3;


}
