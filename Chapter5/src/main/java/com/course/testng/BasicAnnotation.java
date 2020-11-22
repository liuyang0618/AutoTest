package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("beforeSuite");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @Test
    public void testCase1() {
        System.out.println("第一个测试用例!");
    }

    @Test
    public void testCase2() {
        System.out.println("第二个测试用例！");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("这是beforeMethod方法");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("这是afterMethod方法");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("afterSuite");
    }
}
