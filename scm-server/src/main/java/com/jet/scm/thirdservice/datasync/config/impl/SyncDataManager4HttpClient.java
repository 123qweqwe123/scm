package com.jet.scm.thirdservice.datasync.config.impl;

import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.core.utils.CryptoUtil;
import com.jet.scm.thirdservice.datasync.config.ISyncDataManager;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.InputStream;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/13 上午8:42
 */
public class SyncDataManager4HttpClient implements ISyncDataManager {

    private Logger logger = LoggerFactory.getLogger(SyncDataManager4HttpClient.class);

    private Environment env;
    private HttpClient httpClient;
    private String hostAndPort;

    public SyncDataManager4HttpClient(Environment env) {
        this.env = env;
        this.hostAndPort = env.getProperty("third-service.data-sync.host-port");
    }

    @Override
    public boolean login() {
        try {
            CookieStore cookieStore = new BasicCookieStore();
            HttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
            URIBuilder builder = new URIBuilder();
            builder.setScheme("http").setHost(hostAndPort).setPath("login");
            builder.addParameter("username", env.getProperty("third-service.data-sync.login.username"));
            builder.addParameter("password", env.getProperty("third-service.data-sync.login.password"));
            HttpGet get = new HttpGet(builder.build());
            HttpResponse response = httpClient.execute(get);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                this.httpClient = httpClient;
                logger.info("数据同步服务器连接成功！");
                return true;
            } else {
                logger.error("连接数据同步服务器失败，{}", statusCode);
                return false;
            }
        } catch (Exception e) {
            logger.error("连接数据同步服务器失败", e);
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 每 12 小时检查一次当前的 client 的 session 是否超时
     */
    @Scheduled(fixedRate = 1000 * 60 * 60 * 12)
    @Override
    public boolean keepSessionAlive() {
        // 是否启动数据同步服务
        boolean startSync = Boolean.parseBoolean(env.getProperty("third-service.data-sync.active", "true"));
        if (!startSync) {
            return true;
        }
        if (httpClient == null) {
            return this.login();
        }
        if (!isSessionAlive()) {
            return this.login();
        }
        return true;
    }

    @Override
    public byte[] doGet(String path, Map<String, String> params) {
        if (!keepSessionAlive()) {
            throw new ServiceException("连接数据同步服务器失败");
        }
        URIBuilder builder = new URIBuilder();
        builder.setScheme("http").setHost(hostAndPort).setPath(path);
        params.forEach(builder::addParameter);
        try {
            HttpGet httpGet = new HttpGet(builder.build());
            HttpResponse getResponse = httpClient.execute(httpGet);
            InputStream input = getResponse.getEntity().getContent();
            byte[] bytes = IOUtils.toByteArray(input);
            return CryptoUtil.decrypt(env.getProperty("third-service.data-sync.key"), bytes);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取数据异常", e);
            return null;
        }
    }

    @Override
    public byte[] doPost(String path, Map<String, String> params){
        if (!keepSessionAlive()) {
            throw new ServiceException("连接数据同步服务器失败");
        }
        URIBuilder builder = new URIBuilder();
        builder.setScheme("http").setHost(hostAndPort).setPath(path);
        params.forEach(builder::addParameter);
        try {
            HttpPost httpPost = new HttpPost(builder.build());
            HttpResponse getResponse = httpClient.execute(httpPost);
            InputStream input = getResponse.getEntity().getContent();
            return IOUtils.toByteArray(input);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取数据异常", e);
            return null;
        }
    }

    public boolean isSessionAlive() {
        URIBuilder builder = new URIBuilder();
        builder.setScheme("http").setHost(hostAndPort);
        try {
            HttpResponse getResponse = httpClient.execute(new HttpGet(builder.build()));
            if (getResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



}
