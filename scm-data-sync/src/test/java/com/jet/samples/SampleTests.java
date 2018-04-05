package com.jet.samples;

import com.google.common.collect.Lists;
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
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.io.IOException;
import java.util.List;

/**
 * Description:
 * <pre>
 *     测试 http 的调用，使用 CookieStore 来保存当前的 session
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/11 下午2:06
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleTests {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void testDataTransport() throws IOException, InterruptedException {
//        Request.Post("http://localhost:8080/login")
//                .bodyForm(Form.form().add("username", "aaa")
//                        .add("password", "111").build())
//                .execute().returnResponse();

        CookieStore cookieStore = new BasicCookieStore();
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpPost post = new HttpPost("http://localhost:8080/login");
        List<NameValuePair> nvps = Lists.newArrayList();
        nvps.add(new BasicNameValuePair("username", "aaa"));
        nvps.add(new BasicNameValuePair("password", "111"));
        post.setEntity(new UrlEncodedFormEntity(nvps));
        HttpResponse response = httpClient.execute(post);
        System.out.println(response.getStatusLine().getStatusCode());
        Thread.sleep(120 * 1000);
        HttpGet get = new HttpGet("http://localhost:8080/hello");
        HttpResponse getResponse = httpClient.execute(get);
        System.out.println(getResponse.getStatusLine().getStatusCode());
    }

}
