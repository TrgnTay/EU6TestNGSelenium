package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
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
    public void SwitchWindowsTest() {
        driver.get("http://practice.cybertekschool.com/windows");
        //get title
        System.out.println("title before new window " + driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("title after new window " + driver.getTitle());
        //out put: title before new window;practice
        //title after new window: practice,  why same? because we must
        // switch to the second window

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
            }

        }
        System.out.println("Title after switch new window: " + driver.getTitle());
    }

//switch more than 2 windows
    @Test
    public void moreThan2Window() {
        driver.get("http://practice.cybertekschool.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("before switch: " + driver.getTitle());
//selenium don't give the order
        Set<String> windowHandles = driver.getWindowHandles();
        //loop through each window
        for (String handle : windowHandles) {  //handle have unique identifier, for each of the windows have unique id...
            //one by one change it
            driver.switchTo().window(handle);

            //whenever your titile equals to your expected window title
            if (driver.getTitle().equals("New Window")) {
                //stop on that window
                break;

            }


        }

        System.out.println("After Switch: "+driver.getTitle());
    }
}