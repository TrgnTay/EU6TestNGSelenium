package com.cybertek.tests.day7_homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkbox1 {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkBoxtext= driver.findElement(By.xpath("//div[@id='txtAge']"));//input#isAgeSelected   is also good

        Assert.assertFalse(checkBoxtext.isDisplayed(),"Success – Check box is checked” message is NOT displayed");


        driver.findElement(By.xpath("//input[@type='checkbox'][@id='isAgeSelected']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(checkBoxtext.isDisplayed(),"Success – Check box is checked” message is displayed");


driver.quit();

    }
}