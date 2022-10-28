package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
//方法分组测试：先在Test注解上添加组名属性，再在Before和After的Groups注解上加入这个组名属性，即可进行方法分组测试
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.print("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.print("这是服务端组的测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.print("这是客户端组的测试方法3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.print("这是客户端组的测试方法4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.print("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.print("这是服务端组运行之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.print("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.print("这是客户端组运行之后运行的方法");
    }
}
