package com.course.testng.suite;

import org.testng.annotations.*;

public class LoginTest {

    @BeforeTest
    public  void beforeTest(){
        System.out.println("LoginTest的beforeTest");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("LoginTest的afterTest");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("LoginTest的beforeClass");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("LoginTest的afterClass");
    }


    @Test
    public void loginSuccess(){
        System.out.println("登录成功");
    }
}
