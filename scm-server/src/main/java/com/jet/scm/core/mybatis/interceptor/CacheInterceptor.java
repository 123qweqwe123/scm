//package com.bdcor.scm.core.mybatis.interceptor;
//
//import PageFilter;
//import TableResponseContext;
//import SqlBuilder;
//import org.apache.ibatis.builder.SqlSourceBuilder;
//import org.apache.ibatis.cache.Cache;
//import org.apache.ibatis.cache.CacheKey;
//import org.apache.ibatis.cache.TransactionalCacheManager;
//import org.apache.ibatis.executor.CachingExecutor;
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.logging.Log;
//import org.apache.ibatis.logging.LogFactory;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.mapping.ParameterMapping;
//import org.apache.ibatis.mapping.SqlSource;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.reflection.DefaultReflectorFactory;
//import org.apache.ibatis.reflection.MetaObject;
//import org.apache.ibatis.reflection.ReflectorFactory;
//import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
//import org.apache.ibatis.reflection.factory.ObjectFactory;
//import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
//import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
//import org.apache.ibatis.session.Configuration;
//import org.apache.ibatis.session.ResultHandler;
//import org.apache.ibatis.session.RowBounds;
//import org.apache.ibatis.type.TypeHandlerRegistry;
//
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Properties;
//
//
///**
// * 采用分页拦截器执行物理分页查询时，原生的Executor创建cacheKey时未能包含分页参数page，为了解决这个问题，创建了本拦截器，
// * 本拦截器会拦截CachingExecutor的query方法，在创建cacheKey时将分页参数page包含其中。 老规矩，签名里要拦截的类型只能是接口。
// *
// * @author 湖畔微风、huangrupeng
// */
//@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
//    RowBounds.class, ResultHandler.class})})
//public class CacheInterceptor implements Interceptor {
//
//    private static final Log logger = LogFactory.getLog(CacheInterceptor.class);
//    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
//    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
//    private static final ReflectorFactory DEFAULT_REFLECTOR_FACTORY = new DefaultReflectorFactory();
//
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//        Executor executorProxy = (Executor) invocation.getTarget();
//        MetaObject metaExecutor = MetaObject.forObject(executorProxy, DEFAULT_OBJECT_FACTORY,
//            DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//        // 分离代理对象链
//        while (metaExecutor.hasGetter("h")) {
//            Object object = metaExecutor.getValue("h");
//            metaExecutor = MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//        }
//        // 分离最后一个代理对象的目标类
//        while (metaExecutor.hasGetter("target")) {
//            Object object = metaExecutor.getValue("target");
//            metaExecutor = MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//        }
//        Object[] args = invocation.getArgs();
//        return this.query(metaExecutor, args);
//    }
//
//    public <E> List<E> query(MetaObject metaExecutor, Object[] args) throws SQLException {
//        MappedStatement ms = (MappedStatement) args[0];
//        Object parameterObject = args[1];
//        RowBounds rowBounds = (RowBounds) args[2];
//        ResultHandler resultHandler = (ResultHandler) args[3];
//        BoundSql boundSql = ms.getBoundSql(parameterObject);
//        // 改写key的生成
//        CacheKey cacheKey = createCacheKey(ms, parameterObject, rowBounds, boundSql);
//        return this.query(metaExecutor, ms, cacheKey, parameterObject, rowBounds, resultHandler, boundSql);
//    }
//
//    @SuppressWarnings("unchecked")
//    private <E> List<E> query(MetaObject metaExecutor, MappedStatement ms, CacheKey cacheKey, Object parameterObject,
//                              RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
//        MetaObject metaParameter = MetaObject.forObject(parameterObject, DEFAULT_OBJECT_FACTORY,
//            DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//        // 当需要分页查询时，缓存里加入page信息
//        if (parameterObject instanceof PageFilter) {
//            Cache cache = ms.getCache();
//            if (cache != null) {
//                // 如果缓存里面没有当前对象
//                if (ms.isUseCache() && resultHandler == null) {
//                    Object value = cache.getObject(cacheKey);
//                    if (value != null) {
//                        HashMap<String, Object> cachedMap = (HashMap<String, Object>) value;
//                        int total = (int) cachedMap.get("total");
//                        PageFilter originalPage = (PageFilter) (parameterObject);
//                        originalPage.setLocal(total);
//                        return (List<E>) cachedMap.get("list");
//                    }
//                }
//                Executor delegate = (Executor) metaExecutor.getValue("delegate");
//                List<E> list = delegate.query(ms, parameterObject, rowBounds, resultHandler, cacheKey, boundSql);
//                TransactionalCacheManager tcm = (TransactionalCacheManager) metaExecutor.getValue("tcm");
//                HashMap<String, Object> cachedMap = new HashMap<String, Object>();
//                cachedMap.put("total", TableResponseContext.getTableResponse().getList());
//                cachedMap.put("list", list);
//                tcm.putObject(cache, cacheKey, cachedMap);
//                return list;
//            }
//        }
//        Executor executor = (Executor) metaExecutor.getOriginalObject();
//        return executor.query(ms, parameterObject, rowBounds, resultHandler, cacheKey, boundSql);
//    }
//
//    private CacheKey createCacheKey(MappedStatement ms, Object parameterObject, RowBounds rowBounds, BoundSql boundSql) {
//        Configuration configuration = ms.getConfiguration();
//        CacheKey cacheKey = new CacheKey();
//        cacheKey.update(ms.getId());
//        cacheKey.update(rowBounds.getOffset());
//        cacheKey.update(rowBounds.getLimit());
//        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
//        // 解决自动生成SQL，SQL语句为空导致key生成错误的bug
//        if (null == boundSql.getSql() || "".equals(boundSql.getSql())) {
//            String id = ms.getId(); // 如 org.xyz.DeptMapper.listDept
//            id = id.substring(id.lastIndexOf(".") + 1);
//            String newSql = null;
//            try {
//                if ("select".equals(id)) {
//                    newSql = SqlBuilder.buildSelectSql(parameterObject);
//                }
//                SqlSource sqlSource = buildSqlSource(configuration, newSql, parameterObject.getClass());
//                parameterMappings = sqlSource.getBoundSql(parameterObject).getParameterMappings();
//                cacheKey.update(newSql);
//            } catch (Exception e) {
//                logger.error("Update cacheKey error.", e);
//            }
//        } else {
//            cacheKey.update(boundSql.getSql());
//        }
//
//        MetaObject metaObject = MetaObject.forObject(parameterObject, DEFAULT_OBJECT_FACTORY,
//            DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
//
//        if (parameterMappings.size() > 0 && parameterObject != null) {
//            TypeHandlerRegistry typeHandlerRegistry = ms.getConfiguration().getTypeHandlerRegistry();
//            if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
//                cacheKey.update(parameterObject);
//            } else {
//                for (ParameterMapping parameterMapping : parameterMappings) {
//                    String propertyName = parameterMapping.getProperty();
//                    if (metaObject.hasGetter(propertyName)) {
//                        cacheKey.update(metaObject.getValue(propertyName));
//                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
//                        cacheKey.update(boundSql.getAdditionalParameter(propertyName));
//                    }
//                }
//            }
//        }
//        // 当需要分页查询时，将page参数里的当前页和每页数加到cachekey里
//        if (parameterObject instanceof PageFilter) {
//            PageFilter page = (PageFilter) parameterObject;
//            cacheKey.update(page.getPage());
//            cacheKey.update(page.getPageSize());
//        }
//        return cacheKey;
//    }
//
//    /**
//     * 只拦截CachingExecutor，其他的直接返回目标本身
//     */
//    @Override
//    public Object plugin(Object target) {
//        if (target instanceof CachingExecutor) {
//            return Plugin.wrap(target, this);
//        } else {
//            return target;
//        }
//    }
//
//    @Override
//    public void setProperties(Properties properties) {
//
//    }
//
//    private SqlSource buildSqlSource(Configuration configuration, String originalSql, Class<?> parameterType) {
//        SqlSourceBuilder builder = new SqlSourceBuilder(configuration);
//        return builder.parse(originalSql, parameterType, null);
//    }
//
//}
