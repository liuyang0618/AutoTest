package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    //学生类1
    public void stu1(){
        System.out.println("学生类：GroupsOnClass1---stu1");
    }
    public void stur2(){
        System.out.println("学生类：GroupsOnClass1---stu2");
    }
}
