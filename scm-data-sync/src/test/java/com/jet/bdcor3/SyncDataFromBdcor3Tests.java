package com.jet.bdcor3;

import com.jet.datasync.bdcor3.proto.PipCommLccProtos;
import com.jet.datasync.bdcor3.proto.PipCommLccUserProtos;
import com.jet.datasync.bdcor3.proto.PipCommRccProtos;
import com.jet.datasync.bdcor3.proto.PipScmFrozentubeProtos;
import com.jet.datasync.core.util.CryptoUtil;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 下午12:00
 */
public class SyncDataFromBdcor3Tests {

    @Test
    public void testGetFrozentubes() throws Exception {
        // 执行登录操作
        CookieStore cookieStore = new BasicCookieStore();
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpPost post = new HttpPost("http://localhost:8080/login");
        List<NameValuePair> nvps = Lists.newArrayList();
        nvps.add(new BasicNameValuePair("username", "jjddh"));
        nvps.add(new BasicNameValuePair("password", "1jcsxdl@mqDlf"));
        post.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());

        String urlStr = "http://localhost:8080/bdcor3/frozentubes?transDate=2017-07-17 00:00:00";
        String urlEncoding = URLEncoder.encode(urlStr, StandardCharsets.UTF_8.toString());
        System.out.println(urlEncoding);
        HttpGet get = new HttpGet("http://localhost:8080/bdcor3/frozentubes?transDate=2017-07-17%2000:00:00");
        HttpResponse getResponse = httpClient.execute(get);
        System.out.println(getResponse.getStatusLine().getStatusCode());
        InputStream input = getResponse.getEntity().getContent();
        byte[] bytes = IOUtils.toByteArray(input);
        byte[] decryptBytes = CryptoUtil.decrypt("1024", bytes);
        PipScmFrozentubeProtos.TransPipScmFrozentubes tubes = PipScmFrozentubeProtos.TransPipScmFrozentubes.parseFrom(decryptBytes);
        java.util.List<PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube> frozentubeList = tubes.getPipScmFrozentubesList();
        frozentubeList.forEach(x -> {
            System.out.println(x.getTubeCode());
        });
    }

    @Test
    public void testGetRcc() throws Exception {

        // 执行登录操作
        CookieStore cookieStore = new BasicCookieStore();
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpPost post = new HttpPost("http://localhost:8080/login");
        List<NameValuePair> nvps = Lists.newArrayList();
        nvps.add(new BasicNameValuePair("username", "jjddh"));
        nvps.add(new BasicNameValuePair("password", "1jcsxdl@mqDlf"));
        post.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());

        String urlStr = "http://localhost:8080/bdcor3/rccs";
        String urlEncoding = URLEncoder.encode(urlStr, StandardCharsets.UTF_8.toString());
        System.out.println(urlEncoding);
        HttpGet get = new HttpGet("http://localhost:8080/bdcor3/rccs");
        HttpResponse getResponse = httpClient.execute(get);
        System.out.println(getResponse.getStatusLine().getStatusCode());
        InputStream input = getResponse.getEntity().getContent();
        byte[] bytes = IOUtils.toByteArray(input);
        byte[] decryptBytes = CryptoUtil.decrypt("1024", bytes);
        PipCommRccProtos.TransPipCommRcc rccs = PipCommRccProtos.TransPipCommRcc.parseFrom(decryptBytes);
        java.util.List<PipCommRccProtos.TransPipCommRcc.PipCommRcc> rccList = rccs.getPipCommRccsList();
        rccList.forEach(x -> {
            System.out.println(x.getRccName());
        });
    }

    @Test
    public void testGetLcc() throws Exception {
        // 执行登录操作
        CookieStore cookieStore = new BasicCookieStore();
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpPost post = new HttpPost("http://localhost:8080/login");
        List<NameValuePair> nvps = Lists.newArrayList();
        nvps.add(new BasicNameValuePair("username", "jjddh"));
        nvps.add(new BasicNameValuePair("password", "1jcsxdl@mqDlf"));
        post.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());

        String urlStr = "http://localhost:8080/bdcor3/lccs";
        String urlEncoding = URLEncoder.encode(urlStr, StandardCharsets.UTF_8.toString());
        System.out.println(urlEncoding);
        HttpGet get = new HttpGet("http://localhost:8080/bdcor3/lccs");
        HttpResponse getResponse = httpClient.execute(get);
        System.out.println(getResponse.getStatusLine().getStatusCode());
        InputStream input = getResponse.getEntity().getContent();
        byte[] bytes = IOUtils.toByteArray(input);
        byte[] decryptBytes = CryptoUtil.decrypt("1024", bytes);
        PipCommLccProtos.TransPipCommLcc lccs = PipCommLccProtos.TransPipCommLcc.parseFrom(decryptBytes);
        java.util.List<PipCommLccProtos.TransPipCommLcc.PipCommLcc> lccList = lccs.getPipCommLccsList();
        System.out.println(lccList.size());
        lccList.forEach(x -> {
            System.out.println(x.getLccName());
        });
    }

    @Test
    public void testGetLccUser() throws Exception {
        // 执行登录操作
        CookieStore cookieStore = new BasicCookieStore();
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpPost post = new HttpPost("http://localhost:8080/login");
        List<NameValuePair> nvps = Lists.newArrayList();
        nvps.add(new BasicNameValuePair("username", "jjddh"));
        nvps.add(new BasicNameValuePair("password", "1jcsxdl@mqDlf"));
        post.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());

        String urlStr = "http://localhost:8080/bdcor3/lccusers";
        String urlEncoding = URLEncoder.encode(urlStr, StandardCharsets.UTF_8.toString());
        System.out.println(urlEncoding);
        HttpGet get = new HttpGet("http://localhost:8080/bdcor3/lccusers");
        HttpResponse getResponse = httpClient.execute(get);
        System.out.println(getResponse.getStatusLine().getStatusCode());
        InputStream input = getResponse.getEntity().getContent();
        byte[] bytes = IOUtils.toByteArray(input);
        byte[] decryptBytes = CryptoUtil.decrypt("1024", bytes);
        PipCommLccUserProtos.TransPipCommLccUser lccUsers = PipCommLccUserProtos.TransPipCommLccUser.parseFrom(decryptBytes);
        java.util.List<PipCommLccUserProtos.TransPipCommLccUser.PipCommLccUser> lccUserList = lccUsers.getPipCommLccUsersList();
        System.out.println(lccUserList.size());
        lccUserList.forEach(x -> {
            System.out.println(x.getUserCode());
        });
    }
}
