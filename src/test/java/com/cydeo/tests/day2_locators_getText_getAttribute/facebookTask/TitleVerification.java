package com.cydeo.tests.day2_locators_getText_getAttribute.facebookTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) {

        //1. Set up driver
        WebDriverManager.chromedriver().setup();

        //2. Open browser
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //3. Get webpage: https://www.facebook.com
        driver.get("https://www.facebook.com");

        //4. Use .getTitle() method, and store the actual title in a String
        String actualTitle=driver.getTitle();
        //5. Create expectedTitle String
        String expectedTitle= "Facebook - Log In or Sign Up";

        //6. Create if conditions to do your verification
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAİLED!");
        }

    }
}
