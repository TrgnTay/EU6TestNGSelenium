package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PopupsAndAlerts {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
    @Test
    public void test2() throws InterruptedException {
driver.get("http://practice.cybertekschool.com/javascript_alerts");

//click Click For JS Alert Buttun
        WebElement button = driver.findElement(By.xpath("//button[1]"));
        button.click();

        //switch to JS alert pop up
        Alert f=driver.switchTo().alert();  //f or alert , we can write any name
        Thread.sleep(2000);
        f.accept();
//click for JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
        f.dismiss();

        //click for JS Promt
        driver.findElement(By.xpath("//button[3]")).click();
        //send keys to JS Prompt
        f.sendKeys("MikeSmith");
        Thread.sleep(5000);
        //click ok
        //f.getText(); we can use getTest();  we can not use this for chrome notification
        f.accept();

    }
}
