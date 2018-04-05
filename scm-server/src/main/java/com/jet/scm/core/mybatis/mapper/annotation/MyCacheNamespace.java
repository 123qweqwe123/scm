package com.jet.scm.core.mybatis.mapper.annotation;

import org.apache.ibatis.annotations.CacheNamespace;

import java.lang.annotation.*;

/**
 * Description:
 * User: Huang rp
 * Date: 16/11/15
 * Version: 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@CacheNamespace
public @interface MyCacheNamespace {

}
