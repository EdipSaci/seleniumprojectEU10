package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //Set up the web driver
        WebDriverManager.chromedriver().setup();

        //Create instance webDriver
        WebDriver driver = new ChromeDriver();

        //Go to yahoo web page
        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();


        // verify title
        String actualTitle= driver.getTitle();
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";


        System.out.println("ActualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected.Verification PASSED");
        }else {
            System.out.println("Title is Not as expected.Verification FAİLED");
        }

        driver.close();


    }
}
/*
TC #1: Yahoo Title Verification
        1. Open Chrome browser
        2. Go to https://www.yahoo.com
        3. Verify title:
        Expected: Yahoo

 */