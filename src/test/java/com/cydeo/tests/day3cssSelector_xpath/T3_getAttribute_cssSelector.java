package com.cydeo.tests.day3cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        //                        tagName[attribute='value']
        //                        input[class='login-btn']
        //WebElement logIn = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement logIn = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement logIn = driver.findElement(By.cssSelector("input[value='Log In']"));

        String exceptedButtonText= "Log In";
        // Getting the value of attribute
        String actualButtonText= logIn.getAttribute("value");//we can not use getText().because there is no text.
        System.out.println(actualButtonText);

        if (actualButtonText.equals(exceptedButtonText)){
            System.out.println("Log in button text verification is PASSED!");
        }else {
            System.out.println("Log in button text verification is FAİLED!");
        }
    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice

2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
