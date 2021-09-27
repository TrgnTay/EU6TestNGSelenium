package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //WebElement clickButton= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        WebElement clickButton= driver.findElement(By.xpath("//button[@name='button2']"));
        clickButton.click();
    }
}
