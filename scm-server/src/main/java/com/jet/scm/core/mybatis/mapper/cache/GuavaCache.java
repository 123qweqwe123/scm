/**
 * Copyright (c)2015-2016 https://github.com/javahuang/rp
 * <p>
 * Licensed under Apache License,Version 1.0
 */
package com.jet.scm.core.mybatis.mapper.cache;

import com.google.common.cache.CacheBuilder;
import org.apache.ibatis.cache.Cache;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * Description: 自定义cache 用作mybatis二级缓存实现
 * User: Huang rp
 * Date: 16/11/15
 * Version: 1.0
 */
public class GuavaCache implements Cache {

    private String id;

    public GuavaCache(String id) {
        this.id = id;
    }

    //Guava缓存
    private final com.google.common.cache.Cache<Object, Object> CACHE = CacheBuilder.newBuilder().
            maximumSize(1000).
            recordStats(). // 开启统计信息
            build();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        CACHE.put(key, value);
    }

    @Override
    public Object getObject(Object key) {
        return CACHE.getIfPresent(key);
    }

    @Override
    public Object removeObject(Object key) {
        CACHE.invalidate(key);
        return key;
    }

    @Override
    public void clear() {
        CACHE.invalidateAll();
    }

    @Override
    public int getSize() {
        return (int) CACHE.size();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
