package com.jet.scm.core.mybatis.mapper.annotation;

import org.apache.ibatis.type.JdbcType;

import java.lang.annotation.*;

/**
 * 用于描述java对象字段对应的数据库表字段的注解（数据库字段名，字段对应的jdbc类型）
 *
 * @author david
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FieldMapperAnnotation {
    /**
     * 对应数据库表的字段名称
     */
    String dbFieldName();

    /**
     * 字段用JDBC接口存入数据库需要设置的数据类型,Integer,Long,Short,Float,Double,String,Date ,Timestamp,Time
     */
    JdbcType jdbcType();
}
