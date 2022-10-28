package com.course.testng;

import org.testng.annotations.Test;
//忽略测试：@Test(enabled = false)
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.print("ignore1 执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.print("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.print("ignore3 执行");
    }
}
