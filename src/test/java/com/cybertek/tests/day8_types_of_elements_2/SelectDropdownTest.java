package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {
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
    public void test1() {

        driver.get("http://practice.cybertekschool.com/dropdown");
        //1.locate your dropdown just like any other  webElement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));
        //2.create Select object by passing that element as a constructor
        //select is a class from selenium
        Select stateDropdown = new Select(dropdownElement);// ctrl ni besip turup selct ni cheksek select class code chiqidu


        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());
        //print option one by one
        for (WebElement option : options) {
            System.out.println(option.getText());

        }

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        //1.locate your dropdown just like any other  webElement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));
        //2.create Select object by passing that element as a constructor
        //select is a class from selenium selenium object y
        Select stateDropdown = new Select(dropdownElement);


        //verify that first selection is select a state

        String expectedOption = "Select a State";
        //we must use same data type , we can convert the webelement to string by using getTest().
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");


        //How to select options from dropdown?
        //1.select using visible TEXT
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");

        //how to verify
        //once it's selected it will be became the first selection option
        expectedOption = "Virginia";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");


        //2.select using index
        //index starts from 0
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);

        expectedOption = "Wyoming";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //3.select unsing value
        Thread.sleep(2000);
        stateDropdown.selectByValue("TX");

        expectedOption = "Texas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");


    }
}