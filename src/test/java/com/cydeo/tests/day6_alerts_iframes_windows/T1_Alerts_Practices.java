package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alerts_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #1: Information alert practice
        //1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1(){
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //To be able to clıck to Alert OK button we need to swıtch driver's focus alert itself
        Alert alert= driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");

        String exceptedText="You successfully clicked an alert";
        String actualText=resultText.getText();

        Assert.assertEquals(actualText,exceptedText,"Actual result text is not as excepted!");

    }

    @Test
    public void alert_test2(){

        //3. Click to “Click for JS Confirm” button
        WebElement clickForJsConfirmButton= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickForJsConfirmButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
        String exceptedText="You clicked: Ok";
        String actualText=resultText.getText();

        Assert.assertEquals(actualText,exceptedText,"Actual result text is not as excepted!");
    }

    @Test
    public void alert_test3(){
        //3. Click to “Click for JS Prompt” button
        WebElement clickForJSPrompt= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickForJSPrompt.click();

        //4. Send “hello” text to alert
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();
        //6. Verify “You entered: hello” text is displayed.
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));

        String exceptedText="You entered: hello";
        String actualText=resultText.getText();

    }

}
