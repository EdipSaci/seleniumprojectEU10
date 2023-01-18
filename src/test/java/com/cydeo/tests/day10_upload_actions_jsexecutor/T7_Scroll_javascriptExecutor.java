package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_javascriptExecutor {
    @Test
    public void scroll_test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink= Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        //3- Scroll down to “Cydeo” link (JavaScript method)
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);


        //4- Scroll up to “Home” link
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[0].scrollIntoView(false)",homeLink);

        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }
}
