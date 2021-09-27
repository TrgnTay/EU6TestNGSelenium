package com.cybertek.tests.day7_homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxOscar {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

        WebElement firstName= driver.findElement(By.cssSelector("#forename"));
        WebElement surName= driver.findElement(By.cssSelector("input[name='map(lastName)']"));
        firstName.sendKeys("turghantay");
        surName.sendKeys("shokret");

        WebElement checkbox= driver.findElement(By.cssSelector("div[class='validation']"));

        String textOfCheckbox=checkbox.getText();
        System.out.println("textOfCheckbox = " + textOfCheckbox);

Assert.assertTrue(textOfCheckbox.contains("I accept the Terms"),"Verify the text of Checkbox with text 'I accept the Terms aer");

WebElement termBtn= driver.findElement(By.cssSelector("input[name='map(terms)']"));
termBtn.click();
Assert.assertTrue(termBtn.isSelected(),"verify term button is selected");

WebElement joinNowBtn=driver.findElement(By.cssSelector("#form"));
joinNowBtn.click();

WebElement birth=driver.findElement(By.cssSelector("label[for='dob']"));
String birthText=birth.getText();
        System.out.println("birthText = " + birthText);
        Assert.assertTrue(birthText.contains("This field is required"),"Validate that a validation message with text ‘ This field is required’ appears under the date of\n" +
        "        birth box");

driver.quit();

    }
}
