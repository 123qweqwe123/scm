//package com.bdcor.scm.core.mybatis.interceptor;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.reflection.DefaultReflectorFactory;
//import org.apache.ibatis.reflection.MetaObject;
//import org.apache.ibatis.reflection.ReflectorFactory;
//import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
//import org.apache.ibatis.reflection.factory.ObjectFactory;
//import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
//import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
//import org.springframework.stereotype.Component;
//
//import java.sql.Connection;
//import java.util.Properties;
//
///**
// * Description:
// * <pre>
// * </pre>
// * Author: huangrupeng
// * Create: 17/6/30 上午10:46
// */
//@Component
//@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
//public class PermissionInterceptor implements Interceptor {
//
//
//    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
//    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
//    private static final ReflectorFactory DEFAULT_REFLECTOR_FACTORY = new DefaultReflectorFactory();
//
//    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
//        MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//
//        // 分离代理对象链(由于目标类可能被多个拦截器拦截，从而形成多次代理，通过下面的两次循环可以分离出最原始的的目标类)
//        while (metaStatementHandler.hasGetter("h")) {
//            Object object = metaStatementHandler.getValue("h");
//            metaStatementHandler = MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//        }
//        // 分离最后一个代理对象的目标类
//        while (metaStatementHandler.hasGetter("target")) {
//            Object object = metaStatementHandler.getValue("target");
//            metaStatementHandler = MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//        }
//        BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
//        String sql = boundSql.getSql();
//        System.out.println("sql:" + sql);
//        MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
//        rebuildSqlWithPermission(sql);
//        // metaStatementHandler.setValue("delegate.boundSql.sql", pageSql);
//        return invocation.proceed();
//    }
//
//    @Override
//    public Object plugin(Object target) {
//        return Plugin.wrap(target, this);
//    }
//
//    @Override
//    public void setProperties(Properties properties) {
//
//    }
//
//    public void rebuildSqlWithPermission(String sql) {
//        String begin = "SELECT * FROM (  SELECT TMP_PAGE.*, ROWNUM ROW_ID FROM (";
//        String end = ") TMP_PAGE";
//        String pageSql = StringUtils.substringBetween(sql, begin, end); // 分页
//
//    }
//
//    public static void main(String[] args) {
////        StringUtils.substringBetween()
//    }
//}
//
////    SELECT count(0) FROM pip_comm_rcc rcc LEFT JOIN (SELECT substr(LCC_CODE, 0, 4) AS rcc_code, count(1) AS noTransCount FROM pip_scm_frozenbox WHERE IS_CHECKIN = '2' AND BOX_TYPE = 'A' GROUP BY substr(LCC_CODE, 0, 4)) box ON rcc.rcc_code = box.rcc_code WHERE box.noTransCount IS NOT NULL
//
////sql:SELECT count(0) FROM PIP_SCM_TRANS_PROC_MASTER WHERE 1 = 1
//
////SELECT * FROM (  SELECT TMP_PAGE.*, ROWNUM ROW_ID FROM ( SELECT
////        ID, TRANS_NO, STATUS, BOX_COUNT, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY,
////        RCC_CODE, CREATE_BY_NAME
////        FROM PIP_SCM_TRANS_PROC_MASTER
////        WHERE 1=1 ) TMP_PAGE WHERE ROWNUM <= 20 ) WHERE ROW_ID > 10
////        SELECT * FROM (SELECT TMP_PAGE.*, ROWNUM ROW_ID FROM (SELECT ID, TRANS_NO, STATUS, BOX_COUNT, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY, RCC_CODE, CREATE_BY_NAME FROM PIP_SCM_TRANS_PROC_MASTER WHERE 1 = 1) TMP_PAGE WHERE ROWNUM <= 20) WHERE ROW_ID > 10
////        [PIP_SCM_TRANS_PROC_MASTER]