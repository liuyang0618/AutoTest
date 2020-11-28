package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class multiThreadOnXml {
    /**
     * 通过配置文件实现多线程
     */

    @Test
    public void test1(){
        System.out.println("multiThreadOnXml-test1-Thread id:"+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println("multiThreadOnXml-test2-Thread id:"+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println("multiThreadOnXml-test3-Thread id:"+Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.println("multiThreadOnXml-test4-Thread id:"+Thread.currentThread().getId());
    }
}
