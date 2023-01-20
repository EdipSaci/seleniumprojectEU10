package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {

    public static void  loginToSmartBear(WebDriver driver){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Enter username: “Tester”
        WebElement userNameBox =  Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameBox.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");

        //5. Click to Login button
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();


    }
}
