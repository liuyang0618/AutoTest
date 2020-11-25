package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 这是一个异常测试类
     */

    @Test(expectedExceptions =RuntimeException.class)
    public void expectedExceptionFailed(){
        System.out.println("这是一个失败的异常测试！");
    }

    @Test(expectedExceptions =RuntimeException.class)
    public void expectedExceptionSuccess(){
        System.out.println("这是一个成功的异常测试！");
        throw new RuntimeException();
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionSuccess2(){
        System.out.println("test！"+2/0);
//        throw new RuntimeException();
    }
}
