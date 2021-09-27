package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("http://www.google.com");
// wait 3second here then move on
        driver.navigate().to("http://www.facebook.com");

        //noting related to selenium directly, it is from java
        Thread.sleep(3000);


        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

        driver.navigate().refresh();


       // WebDriverManager.firefoxdriver().setup();
       // WebDriver driver= new FirefoxDriver();
       // driver.get("http://www.facebook.com");
        System.out.println();



    }
}
