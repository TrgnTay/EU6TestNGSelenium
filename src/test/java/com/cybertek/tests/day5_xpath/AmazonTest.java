package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement inputBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
     inputBox.sendKeys("selenium");
     //WebElement clickButton= driver.findElement(By.xpath("//input[@value='Go']"));
     //clickButton.click();
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        WebElement result=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        String resultText= result.getText();
        System.out.println("resultText = " + resultText);
        String expextedResult="1-48 of 204 results for";

        if(expextedResult.equals(resultText)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expextedResult = " + expextedResult);
            System.out.println("resultText = " + resultText);
        }
        driver.quit();

    }
}
