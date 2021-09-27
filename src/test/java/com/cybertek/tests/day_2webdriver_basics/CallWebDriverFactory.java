package com.cybertek.tests.day_2webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory
{
    public static void main(String[] args) {
        //hold ctrl click directly getDriver return getDriver

        WebDriver driver=WebDriverFactory.getDriver("Chrome");
        driver.get("http://www.google.com");
        
        String title= driver.getTitle();
       System.out.println("title = " + title);
    }
}
