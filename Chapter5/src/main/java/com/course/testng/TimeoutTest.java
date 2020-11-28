package com.course.testng;

import org.testng.annotations.Test;

public class TimeoutTest {
    @Test(timeOut = 2000) //单位ms
    public void testSuccess() throws InterruptedException {
        Thread.sleep(30);
    }

    @Test(timeOut = 2000) //单位ms
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
