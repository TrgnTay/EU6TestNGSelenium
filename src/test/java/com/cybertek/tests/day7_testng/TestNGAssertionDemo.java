package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {
@BeforeMethod
public void setUp(){
    System.out.println("Open browser");
}
    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("title","tiTle  ");

        System.out.println("second assertion");
        Assert.assertEquals("URL","URL");

    }

    @Test
    public void test2(){
    Assert.assertEquals("test1","test1");
    }
//@AfterMethod
    //public void tearDown(){
   // System.out.println("close browser");


    @Test
            public void test3() {
        String expectedTitle = "Cyt";
        String actualTitle = "Cybertek";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle), "Verify titile starts with Cyb");

    }
    @Test
    public void test4() {
        String eamil = "mikesmith.com";
        Assert.assertTrue(eamil.contains("2"), "verify email contains @");
    }
    @Test
    public void test5(){
    Assert.assertFalse(0>1,"verify that 0 is not greater than1");

    }
}

