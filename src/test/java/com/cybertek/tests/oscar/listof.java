package com.cybertek.tests.oscar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class listof {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
@AfterMethod
public void tearDown(){
driver.close();


}

    @Test
    public void task2(){
        driver.get("https://practice-cybertekschool.herokuapp.xn--com");
driver.findElement(By.xpath("//a[@href='/registration_form']")).click();

        List<WebElement> elements = driver.findElements(By.cssSelector(".form-check-label"));

       // Assert.assertEquals(elements.get(0).getText(),"C++");
        //Assert.assertEquals(elements.get(1).getText(),"Java");
        //Assert.assertEquals(elements.get(2).getText(),"JavaScripts");


    }







    }

