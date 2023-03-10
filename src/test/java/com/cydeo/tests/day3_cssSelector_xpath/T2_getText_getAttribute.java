package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel= driver.findElement(By.className("login-item-checkbox-label"));
        String exceptedRememberMeLabel="Remember me on this computer";
        String actualRememberMeLabel= rememberMeLabel.getText();
        if (actualRememberMeLabel.equals(exceptedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else {
            System.out.println("Label verification FAİLED!!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String exceptedForgotPasswordLinkText= "Forgot your password?";
        String actualForgotPasswordLinkText=forgotPassword.getText();
        if (actualForgotPasswordLinkText.equals(exceptedForgotPasswordLinkText)){
            System.out.println("Forgot password verification PASSED!");
        }else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("exceptedForgotPasswordLinkText = " + exceptedForgotPasswordLinkText);
            System.out.println("Forgot password verification FAİLED!!!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String exceptedInHref= "forgot_password=yes";
        String actualHrefAttributeValue= forgotPassword.getAttribute("href");
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(exceptedInHref)){
            System.out.println("Href attribute value verification PASSED!");
        }else {
            System.out.println("Href attribute value verification FAİLED!!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.






    }
}
/*
 */