package com.cybertek.tests.day9_homework;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase6 {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
    @Test
    public void test1(){
        driver.get("https://www.tempmailaddress.com/");
        String email=driver.findElement(By.cssSelector("div>#email")).getText();

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        //driver.findElement(By.name("full_name")).sendKeys("MikeSmith");
        driver.findElement(By.name("full_name")).sendKeys(Faker.instance().name().fullName());
        driver.findElement(By.cssSelector("[type='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("[name='wooden_spoon']")).click();
        String ExpectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String ActualMessage=driver.findElement(By.cssSelector("#content>div>h3")).getText();
       Assert.assertEquals(ActualMessage,ExpectedMessage);
        driver.get("https://www.tempmailaddress.com/");



        String actualIncomingEmail = driver.findElement(By.xpath("(//span[@class='odMobil'])[1]")).getAttribute("innerHTML");
        String expectedIncomingEmail = "do-not-reply@practice.cybertekschool.com";

        Assert.assertEquals(actualIncomingEmail, expectedIncomingEmail);

        driver.findElement(By.xpath("//tbody[@id='schranka']/tr[1]")).click();
        String actualEmail = driver.findElement(By.cssSelector("#odesilatel")).getText();
        String expectedEmail = "do-not-reply@practice.cybertekschool.com";

        Assert.assertEquals(actualEmail, expectedEmail);

        String actualMailSubject = driver.findElement(By.cssSelector("#predmet")).getText();
        String expectedMailSubject = "Thanks for subscribing to practice.cybertekschool.com!";

        Assert.assertEquals(actualMailSubject, expectedMailSubject);


        //shameer.caius@zooants.com




    }
}
