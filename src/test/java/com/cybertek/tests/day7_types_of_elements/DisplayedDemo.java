package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement usernameInput= driver.findElement(By.id("username"));
        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());
        //verify usename inputbox is not displayed on the screen
        //click start button
        //verify username displayed on the screen

        Assert.assertFalse(usernameInput.isDisplayed(),"Verify username inputbox is not displayed");

       driver.findElement(By.cssSelector("#start>button")).click();

       //Wait until elements displayed
        Thread.sleep(6000);  //not from selenium, it is from java

        Assert.assertTrue(usernameInput.isDisplayed(),"Verify username inputbox is displayed");

        driver.quit();

    }
}
