package com.cydeo.tests.day5_TestNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_SelectingValue {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void selectValue(){

        //3. Click to non-select dropdown
        WebElement nonSelectDropdown= driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();

        //4. Select Facebook from dropdown
        WebElement itemFacebook=driver.findElement(By.linkText("Facebook"));
        itemFacebook.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle= driver.getTitle();
        String exceptedTitle= "Facebook - Giriş Yap veya Kaydol";

        Assert.assertEquals(actualTitle,exceptedTitle,"not match");



    }
}
