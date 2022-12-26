package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_xpath {
    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement loginBox= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect");

        //4- Click to `Reset password` button
        WebElement resetPasswordButton= driver.findElement(By.xpath("//button[@value='Reset password']"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorLabel= driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualErrorLabelText = errorLabel.getText();
        String exceptedErrorLabelText= "Login or E-mail not found";
        if (actualErrorLabelText.equals(exceptedErrorLabelText)){
            System.out.println("Error label text verification is PASSED!");
        }else {
            System.out.println("Error label text verification is FAİLED!");
        }

    }
}
/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
 */