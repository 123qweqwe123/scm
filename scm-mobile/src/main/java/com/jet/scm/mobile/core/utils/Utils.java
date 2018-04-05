package com.jet.scm.mobile.core.utils;

import java.util.UUID;

/**
 * Description:
 * <pre>
 *     系统常用的一些工具类
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/18 下午1:40
 */
public class Utils {

    /**
     * @return 返回UUID作为主键
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
