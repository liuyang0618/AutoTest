package com.course.testng;

import org.testng.annotations.Test;

public class IngonreTest {
    @Test
    public void ingonre1(){
        System.out.println("ingonre1");
    }
    @Test(enabled = false)
    public void ingonre2(){
        System.out.println("ingonre2");
    }
    @Test(enabled = true)
    public void ingonre3(){
        System.out.println("ingonre3");
    }
}
