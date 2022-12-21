package com.cydeo.tests.day2_locators_getText_getAttribute.facebookTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTitle {
    public static void main(String[] args) {

        //1. Set up driver
        WebDriverManager.chromedriver().setup();

        //2. Open browser
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //3. Get webpage: https://www.facebook.com
        driver.get("https://www.facebook.com");

        //4. Locate the username input box using By.name() method using and send random string sendKeys() method
        WebElement emailBox= driver.findElement(By.name("email"));
        emailBox.sendKeys("78+'23d" + Keys.ENTER);

        //5. Locate the password input box using By.name() method using and send random string sendKeys() method
        WebElement passwordBox= driver.findElement(By.name("pass"));
        passwordBox.sendKeys("78sa1!'ad"+ Keys.ENTER);

        //6. Get title and store it in new String (actual)
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //7. Create new String for expected
        String expectedTitle="Log into Facebook";
        System.out.println("expectedTitle = " + expectedTitle);

        //8. Verify results with if condition
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAİLED!");
        }



    }
}
