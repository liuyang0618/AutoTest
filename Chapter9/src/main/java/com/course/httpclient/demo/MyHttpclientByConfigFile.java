package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ResourceBundle;

public class MyHttpclientByConfigFile {

    String test_base;
    String test_get;
    String test_baidu;


    @BeforeTest
    public void befeTest(){
        test_base = ResourceBundle.getBundle("application").getString("test_base");
        test_get = ResourceBundle.getBundle("application").getString("test_get");
        test_baidu = ResourceBundle.getBundle("application").getString("test_baidu");
    }

    @Test
    public void testBaidu() throws IOException {
        String result;
        HttpGet bd =  new HttpGet(test_baidu);
        DefaultHttpClient client =  new DefaultHttpClient();
        HttpResponse response =  client.execute(bd);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
    @Test
    public void testMockGet() throws IOException {
        String result;
        String url= test_base + test_get;
        HttpGet httpGet =  new HttpGet(url);
        DefaultHttpClient client =  new DefaultHttpClient();
        HttpResponse response =  client.execute(httpGet);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}
