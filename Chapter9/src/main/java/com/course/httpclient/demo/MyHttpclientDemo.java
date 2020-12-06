package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class MyHttpclientDemo {
    @Test
    public void myHttpClicentTest() throws IOException {
        String result;
        HttpGet url1 =  new HttpGet("http://www.baidu.com/");
        HttpClient client1 =  new DefaultHttpClient();
        HttpResponse response =  client1.execute(url1);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}
