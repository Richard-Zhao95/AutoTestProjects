package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.print("name="+name+", age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] objects = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return objects;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.print("test1方法的name="+name+", age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.print("test2方法的name="+name+", age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] results = null;
        if(method.getName().equals("test1")){
            results = new Object[][]{
                    {"xianghuaqiang",15},
                    {"liuqiangdong",16},
                    {"gaojin",17}
            };
        }else if(method.getName().equals("test2")){
            results = new Object[][]{
                    {"xianghuaqiang",20},
                    {"liuqiangdong",30},
                    {"gaojin",40}
            };
        }
        return results;
    }
}
