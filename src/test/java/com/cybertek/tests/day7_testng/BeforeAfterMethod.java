package com.cybertek.tests.day7_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @Test
    public void test1(){

        System.out.println("First Test Case");

    }


    @Test
    public void test2(){
        System.out.println("second test case");

    }

@BeforeMethod
    public void setUp(){
    System.out.println("Wendriverr,google chrome");


}
@AfterMethod
    public void tafter(){
    System.out.println("last test case");

    }

}
