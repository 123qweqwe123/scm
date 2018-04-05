//package com.bdcor.scm.core.mybatis.interceptor;
//
//import org.apache.ibatis.cache.CacheKey;
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.session.ResultHandler;
//import org.apache.ibatis.session.RowBounds;
//import org.springframework.stereotype.Component;
//
//import java.util.Properties;
//
///**
// * Description:
// * <pre>
// * </pre>
// * Author: huangrupeng
// * Create: 17/6/30 下午1:44
// */
//@SuppressWarnings({"rawtypes", "unchecked"})
//@Intercepts(
//        {
//                @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
//                @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
//        }
//)
//@Component
//public class PermissionInterceptor1 implements Interceptor {
//
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//        System.out.println(111);
//        return invocation.proceed();
//    }
//
//    @Override
//    public Object plugin(Object target) {
//        System.out.println(222);
//        return Plugin.wrap(target, this);
//    }
//
//    @Override
//    public void setProperties(Properties properties) {
//
//    }
//}
