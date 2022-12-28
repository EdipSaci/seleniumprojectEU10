package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_cssSelector {

    public static void main(String[] args) {



        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        //b. “Forgot password” header
        WebElement forgotPasswordHeader= driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        //c. “E-mail” text
        WebElement email= driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("email.isDisplayed() = " + email.isDisplayed());

        //d. E-mail input box
        WebElement emailInputBox=driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());

        //e. “Retrieve password” button
        WebElement retrievePassword= driver.findElement(By.cssSelector("button[id='form_submit']> i"));
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());

        //f. “Powered by Cydeo" text
        WebElement poweredByCydeo=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());

        //4. Verify all web elements are displayed.
        driver.quit();
    }
}
