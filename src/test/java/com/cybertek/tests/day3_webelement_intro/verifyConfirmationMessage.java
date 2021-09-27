package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {

/*    Verify confirmation message
        open chrome browser
           go to http://practice.cybertekschool.com/forgot_password Links to an external site.
       enter any email
       verify that email is displayed in the input box
       click on Retrieve password
       verify that confirmation message says 'Your e-mail's been sent!'
        */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));
        String expectedEmail = "mike@smith.com";
        emailInputBox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        //somehow we should get text from web elements
        //two main ways:
        //1.getText()-->it will work 99% and it will return string
        //2. getAttribute(""value)--> second way of getting text especially input box
        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);
        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        //click on Retrieve password
        WebElement retrievePasswordButton = driver.

                findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        // verify that confirmation message says 'Your e-mail's been sent!'
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));
        // System.out.println(actualConfirmationMessage);  wrong cause it's not string , it's webelement we can not print it
        System.out.println(actualConfirmationMessage.getText());
        //save expected message
        String expectedMessage = "Your e-mail's been sent!";
        //save actual message to variable
        String actualMessage = actualConfirmationMessage.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);


        driver.quit();
        }

    }
