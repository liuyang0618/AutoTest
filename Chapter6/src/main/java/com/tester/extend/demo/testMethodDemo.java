package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testMethodDemo {
    @Test
    public void test1(){
        System.out.println("这是test1（）");
        Assert.assertEquals(1,1);

    }
    @Test
    public void test2(){
        Assert.assertEquals("ly","ly");
        System.out.println("这是test2（）");
        Assert.assertEquals("1","2");
        Assert.assertEquals("ly","lyman");
    }

    @Test
    public void test3(){
        System.out.println("这是test3（）");
        Assert.assertEquals("fdf","fdf");

    }
    @Test
    public void logDemo() throws RuntimeException {
        Reporter.log("这是我自己写的日志");
        throw new RuntimeException("这是人为造的一个RuntimeException异常");
    }
}
