package com.course.testng;

import org.testng.annotations.Test;
//被依赖的方法执行失败，依赖的方法就会被忽略不执行
//实际应用场景：前置方法比如登录失败，后续的下单方法就会忽略执行
public class DependTest {
    @Test
    public void test1(){
        System.out.print("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.print("test2 run");
    }
}
