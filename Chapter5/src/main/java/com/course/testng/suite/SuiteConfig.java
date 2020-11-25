package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("afterSuite");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("SuiteConfig的beforeTest");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("SuiteConfig的afterTest");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("SuiteConfig的beforeClass");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("SuiteConfig的afterClass");
    }
}
