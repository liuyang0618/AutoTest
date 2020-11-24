package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {
    //学生类2
    public void stu3(){
        System.out.println("学生类：GroupsOnClass2---stu3");
    }
    public void stur4(){
        System.out.println("学生类：GroupsOnClass2---stu4");
    }
}
