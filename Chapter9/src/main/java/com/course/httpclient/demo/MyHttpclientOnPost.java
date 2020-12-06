package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.util.List;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ResourceBundle;

public class MyHttpclientOnPost {

    private String test_base;
    private  CookieStore cookieStore;
    private ResourceBundle bundle;

    @BeforeTest
    public void befeTest(){
        test_base = ResourceBundle.getBundle("application").getString("test_base");
        bundle = ResourceBundle.getBundle("application");

    }
    @Test
    public void test1() throws IOException {
        //getCookies
        String result;
        String test_cookies = bundle.getString("test_cookies");
        String testUrl = test_base+test_cookies;
        HttpGet url =  new HttpGet(testUrl);
        DefaultHttpClient client =  new DefaultHttpClient();
        HttpResponse response =  client.execute(url);
        this.cookieStore = client.getCookieStore();

        List<Cookie> cookieList= cookieStore.getCookies();
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

        for(Cookie cookie:cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println(name+":"+value+";");
        }
    }
    @Test(dependsOnMethods = {"test1"})
    public void httpclientOnPostDemo() throws IOException {
        //拼接请求的链接
        String uri = this.bundle.getString("test_post_cookies");
        String testUrl = test_base+uri;
        //创建一个Post
        HttpPost post =new HttpPost(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();

        //设置header
        post.setHeader("content-type","application/json");

        //创建json参数并绑定post
        JSONObject obj  = new JSONObject();
        obj.put("name","zhangsan");
        obj.put("age","18");
        StringEntity stringEntity = new StringEntity(obj.toString(),"utf-8");
        post.setEntity(stringEntity);

        //设置cookies
        client.setCookieStore(this.cookieStore);

        //执行post
        HttpResponse response = client.execute(post);
        //返回结果
        String result = EntityUtils.toString(response.getEntity());
        System.out.println("返回的结果: "+result);

        //对返回结果进行处理
        JSONObject resultJson = new JSONObject(result);
        //判断结果值
        String success = (String) resultJson.get("success");
        String ly = (String) resultJson.get("ly");
        Assert.assertEquals("1",success);
        Assert.assertEquals("33", ly);


    }
}
