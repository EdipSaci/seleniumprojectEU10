package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class T1_SmartBear {


    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    @Test
    public void test1(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        //3. Enter username: “Tester”
        WebElement userNameBox =  Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameBox.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");

        //5. Click to Login button
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        //6. Print out count of all the links on landing page
        List<WebElement> listOfLinks= Driver.getDriver().findElements(By.xpath("//a"));
        System.out.println("listOfLinks.size() = " + listOfLinks.size());

        //7. Print out each link text on this page
        for (WebElement eachOfListOfLink : listOfLinks) {
            System.out.println(eachOfListOfLink.getText());
        }

    }
}
