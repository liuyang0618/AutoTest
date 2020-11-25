package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.security.Provider;

public class DataProviderTest {

    @Test(dataProvider = "dataProMethod")
    public void test1(String name, int age){
        System.out.println("test1:"+name+", age="+age);
    }
    @DataProvider(name = "dataPro")
    public Object[][] dataProvider(){
        Object[][] obj = new Object[][]{{"畅畅",7},{"顺顺",2}};
        return obj;
    }

    @Test(dataProvider = "dataProMethod")
    public void test2(String name, int age){
        System.out.println("test2:"+name+", age="+age);
    }

    @DataProvider(name = "dataProMethod")
    public Object[][] dataProvider(Method method){
        Object[][] obj = null;
        if(method.getName().equals("test1")){
            obj = new Object[][]{{"畅畅",7},{"顺顺",2}};
        }else if(method.getName().equals("test2")){
            obj = new Object[][]{{"刘洋",32},{"朱新月",30}};
        };

        return obj;
    }
}
