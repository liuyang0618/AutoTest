package com.course.testng.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PayTest {
    @BeforeTest
    public  void beforeTest(){
        System.out.println("PayTest的beforeTest");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("PayTest的afterTest");
    }

    @Test
    public void payTest(){
        System.out.println("支付宝支付成功");
    }
}
