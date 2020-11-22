package com.course.testng.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    @BeforeTest
    public  void beforeTest(){
        System.out.println("LoginTest的beforeTest");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("LoginTest的afterTest");
    }

    @Test
    public void loginSuccess(){
        System.out.println("登录成功");
    }
}
