package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        //http://practice.cybertekschool.com/multiple_buttons

        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.navigate().to("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);

        //click don't click button
        WebElement clickButton= driver.findElement(By.id("disappearing_button"));
        clickButton.click();
driver.navigate().refresh();




    }
    }

