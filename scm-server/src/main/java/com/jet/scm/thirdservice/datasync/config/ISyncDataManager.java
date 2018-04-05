package com.jet.scm.thirdservice.datasync.config;

import java.net.URISyntaxException;
import java.util.Map;

/**
 * Description:
 * <pre>
 *     用于保持与接口服务器的 session
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/13 上午8:33
 */
public interface ISyncDataManager {

    /**
     * 执行登录
     *
     * @return
     */
    boolean login();

    /**
     * @return
     */
    boolean keepSessionAlive();

    /**
     * 获取的原始数据经过 des 解密
     * @param path
     * @param params
     * @return
     * @throws URISyntaxException
     */
    byte[] doGet(String path, Map<String, String> params);

    byte[] doPost(String path, Map<String, String> params);


    boolean isSessionAlive();



}
