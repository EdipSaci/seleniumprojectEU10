package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Software_verify {
    @Test
    public void test1(){
        //1. Open browser and login to Smartbear software
        //2. Click on View all orders
        //3. Verify Susan McLaren has order on date “01/05/2010”

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement userNameBox =  Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameBox.sendKeys("Tester");

        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");

        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        WebElement susanOrder= Driver.getDriver().findElement(By.xpath("//table[@class='SampleTable']//td[.='Susan McLaren']/following-sibling::td[3]"));


        Assert.assertEquals("01/05/2010",susanOrder.getText());
    }
}
