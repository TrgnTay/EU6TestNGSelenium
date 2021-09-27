package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Attribute {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioBtn= driver.findElement(By.id("blue"));
        System.out.println(blueRadioBtn.getAttribute("type"));  //type is radio
        System.out.println(blueRadioBtn.getAttribute("name"));  //color
        //get the value of checked
        //since checked attribute does not keep any value, it will return true or false based on the condition
        System.out.println(blueRadioBtn.getAttribute("checked"));  //true or false

        //trying to get attribute that does not exist
        System.out.println(blueRadioBtn.getAttribute("href"));  //return null
        System.out.println(blueRadioBtn.getAttribute("outerHTML"));  // return full html of webelements as a string
        System.out.println(blueRadioBtn.getAttribute("innerHTML"));
        driver.quit();
    }
}
