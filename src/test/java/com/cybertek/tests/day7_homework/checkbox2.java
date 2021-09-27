package com.cybertek.tests.day7_homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkbox2 {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllText= driver.findElement(By.cssSelector("#check1"));
        System.out.println("checkAllText.getAttribute(\"value\") = " + checkAllText.getAttribute("value"));

        Assert.assertTrue(checkAllText.isDisplayed(),"Verify “Check All” button text is “Check All”");

        checkAllText.click();
        Thread.sleep(1000);

        WebElement op1= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        WebElement op2= driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        WebElement op3= driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        WebElement op4= driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));

        Assert.assertTrue(op1.isSelected(),"option1 is selected");
        Assert.assertTrue(op2.isSelected(),"option2 is selected");
        Assert.assertTrue(op3.isSelected(),"option3 is selected");
        Assert.assertTrue(op4.isSelected(),"option4 is selected");

Assert.assertTrue(checkAllText.isDisplayed(),"Verify button text changed to Uncheck All");


        driver.quit();
    }
}
