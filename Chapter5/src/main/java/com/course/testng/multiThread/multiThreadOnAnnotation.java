package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class multiThreadOnAnnotation {
    //通过注解实现多线程
//    @Test(invocationCount = 10,threadPoolSize = 3)
//    public void test(){
//        System.out.printf("当前运行的线程id：%s\n", Thread.currentThread().getId());
//    }
    @Test
    public void test1(){
        System.out.printf("multiThreadOnAnnotation-test1-当前运行的线程id：%s\n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("multiThreadOnAnnotation-test2-当前运行的线程id：%s\n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("multiThreadOnAnnotation-test3-当前运行的线程id：%s\n", Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("multiThreadOnAnnotation-test4-当前运行的线程id：%s\n", Thread.currentThread().getId());
    }
}
