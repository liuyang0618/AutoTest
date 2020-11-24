package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    //老师类
    public void teacher1(){
        System.out.println("老师类：GroupsOnClass3--teacher1");
    }
    public void teacher2(){
        System.out.println("老师类：GroupsOnClass3--teacher2");
    }
}
