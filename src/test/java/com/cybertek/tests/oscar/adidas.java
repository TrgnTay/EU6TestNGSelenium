package com.cybertek.tests.oscar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class adidas {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(By.xpath("//div[@class='list-group']/a[3]")).click();

        driver.findElement(By.linkText("Sony vaio i5")).click();

        driver.findElement(By.linkText("Add to cart")).click();

        Alert alert1=driver.switchTo().alert();  //f or alert , we can write any name
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        alert1.accept();

        driver.findElement(By.xpath("//div[@class='list-group']/a[3]")).click();
        driver.findElement(By.linkText("Dell i7 8gb")).click();
        driver.findElement(By.linkText("Add to cart")).click();

        Alert a=driver.switchTo().alert();  //f or alert , we can write any name
        //Thread.sleep(2000);
        a.accept();

        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.className("btn btn-success"));

    }
}
