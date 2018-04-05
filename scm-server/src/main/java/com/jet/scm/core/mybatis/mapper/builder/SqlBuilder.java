/**
 * Copyright (c)2015-2016 https://github.com/javahuang/rp
 * <p>
 * Licensed under Apache License,Version 1.0
 */
package com.jet.scm.core.mybatis.mapper.builder;

import com.jet.scm.core.mybatis.mapper.annotation.*;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * User: Huang rp
 * Date: 16/11/14
 * Version: 1.0
 */
public class SqlBuilder {

    /**
     * 缓存TableMapper
     */
    private static HashMap<Class<?>, TableMapper> tableMapperCache = new HashMap<Class<?>, TableMapper>(128);


    private static TableMapper buildTableMapper(Class<?> dtoClass) {

        HashMap<String, FieldMapper> fieldMapperCache = null;
        ArrayList<FieldMapper> fieldMapperList = null;
        Field[] fields = null;

        FieldMapperAnnotation fieldMapperAnnotation = null;
        FieldMapper fieldMapper = null;
        TableMapper tableMapper = null;
        synchronized (tableMapperCache) {
            tableMapper = tableMapperCache.get(dtoClass);
            if (tableMapper != null) {
                return tableMapper;
            }
            tableMapper = new TableMapper();
            Annotation[] classAnnotations = dtoClass.getDeclaredAnnotations();
            if (classAnnotations.length == 0) {
                throw new RuntimeException("Class " + dtoClass.getName()
                        + " has no annotation, I can't build 'TableMapper' for it.");
            }
            for (Annotation an : classAnnotations) {
                if (an instanceof TableMapperAnnotation) {
                    tableMapper.setTableMapperAnnotation(an);
                }
            }
            if (tableMapper.getTableMapperAnnotation() == null) {
                throw new RuntimeException("Class " + dtoClass.getName() + " has no 'TableMapperAnnotation', "
                        + "which has the database table information," + " I can't build 'TableMapper' for it.");
            }
            fields = dtoClass.getDeclaredFields();
            fieldMapperCache = new HashMap<String, FieldMapper>();
            fieldMapperList = new ArrayList<FieldMapper>();
            Annotation[] fieldAnnotations = null;
            for (Field field : fields) {
                fieldAnnotations = field.getDeclaredAnnotations();
                if (fieldAnnotations.length == 0) {
                    continue;
                }
                for (Annotation an : fieldAnnotations) {
                    if (an instanceof FieldMapperAnnotation) {
                        fieldMapperAnnotation = (FieldMapperAnnotation) an;
                        fieldMapper = new FieldMapper();
                        fieldMapper.setFieldName(field.getName());
                        fieldMapper.setDbFieldName(fieldMapperAnnotation.dbFieldName());
                        fieldMapper.setJdbcType(fieldMapperAnnotation.jdbcType());
                        fieldMapperCache.put(fieldMapperAnnotation.dbFieldName(), fieldMapper);
                        fieldMapperList.add(fieldMapper);
                    }
                }
            }
            tableMapper.setFieldMapperCache(fieldMapperCache);
            tableMapper.setFieldMapperList(fieldMapperList);
            tableMapperCache.put(dtoClass, tableMapper);
            return tableMapper;
        }
    }

    /**
     * 从注解里获取唯一键信息
     *
     * @param tableMapper
     * @return
     */
    private static String[] buildUniqueKey(TableMapper tableMapper) {
        TableMapperAnnotation tma = (TableMapperAnnotation) tableMapper.getTableMapperAnnotation();
        String[] uniqueKeyNames = null;
        if (tma.uniqueKeyType().equals(UniqueKeyType.Single)) {
            uniqueKeyNames = new String[1];
            uniqueKeyNames[0] = tma.uniqueKey();
        } else {
            uniqueKeyNames = tma.uniqueKey().split(",");
        }
        return uniqueKeyNames;
    }

    /**
     * 由传入的对象生成query sql语句
     *
     * @param object
     * @return sql
     * @throws Exception
     */
    public static String buildSelectSql(Object object) throws Exception {
        if (null == object) {
            throw new RuntimeException("Sorry,I refuse to build sql for a null object!");
        }
        Map dtoFieldMap = PropertyUtils.describe(object);
        TableMapper tableMapper = buildTableMapper(object.getClass());
        TableMapperAnnotation tma = (TableMapperAnnotation) tableMapper.getTableMapperAnnotation();
        String tableName = tma.tableName();
        String[] uniqueKeyNames = buildUniqueKey(tableMapper);

        StringBuffer selectSql = new StringBuffer();
        selectSql.append("select ");
        for (String dbFieldName : tableMapper.getFieldMapperCache().keySet()) {
            selectSql.append(dbFieldName).append(",");
        }
        selectSql.delete(selectSql.lastIndexOf(","), selectSql.lastIndexOf(",") + 3);
        selectSql.append(" from ").append(tableName);

        StringBuffer whereSql = new StringBuffer(" where ");
        for (int i = 0; i < uniqueKeyNames.length; i++) {
            whereSql.append(uniqueKeyNames[i]);
            FieldMapper fieldMapper = tableMapper.getFieldMapperCache().get(uniqueKeyNames[i]);
            String fieldName = fieldMapper.getFieldName();
            Object value = dtoFieldMap.get(fieldName);
            if (value == null) {
                throw new RuntimeException("Unique key '" + uniqueKeyNames[i]
                        + "' can't be null, build query sql failed!");
            }
            whereSql.append("=#{").append(fieldName).append(",").append("jdbcType=")
                    .append(fieldMapper.getJdbcType().toString()).append("} and ");
        }
        whereSql.delete(whereSql.lastIndexOf("and"), whereSql.lastIndexOf("and") + 3);
        return selectSql.append(whereSql).toString();
    }

}
