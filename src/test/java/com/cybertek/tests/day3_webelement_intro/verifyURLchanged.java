package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

    public static void main(String[] args) {

    /* Verify URL changed
            open chrome browser
                    go to http://practice.cybertekschool.com/forgot_password Links to an external site.
                            enter any email
                                    click on Retrieve password
                                           verify that url changed to http://practice.cybertekschool.com/email_sent    */

        WebDriver driver = WebDriverFactory.getDriver("cHrome");

        //driver.get("");
        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");


        WebElement forgotPassword=driver.findElement(By.id("forgot_password"));

       // enter ant email
WebElement emailInputBox= driver.findElement(By.name("email"));

//sendKeys()--> send keyboard action to the webelement

        emailInputBox.sendKeys("ttaayy@outlook.be");
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sent";

        String actualUrl= driver.getCurrentUrl();

        //verify that url did not change
        if(expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);

        }
//CLOSE YOUR BROWSER
        driver.quit();





    }
}