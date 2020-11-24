package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @BeforeGroups("server")
    public void BeforeGroupsOnServer(){
        System.out.println("BeforeGroupsOnServer");
    }
    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("AfterGroupsOnServer");
    }
    @BeforeGroups("client")
    public void BeforeGroupsOnClient(){
        System.out.println("BeforeGroupsOnClient");
    }
    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("AfterGroupsOnClient");
    }
    @Test(groups = "server")
    public void groupsMthodOnServer1(){
        System.out.println("groupsMthodOnServer1");
    }
    @Test(groups = "server")
    public void groupsMthodOnServer2(){
        System.out.println("groupsMthodOnServer2");
    }
    @Test(groups = "client")
    public void groupsMthodOnClient1(){
        System.out.println("groupsMthodOnClient1");
    }
    @Test(groups = "client")
    public void groupsMthodOnClient2(){
        System.out.println("groupsMthodOnClient2");
    }
}
