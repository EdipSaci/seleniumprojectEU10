package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfPractice {
    public static void main(String[] args) {

        //set up the browser
        WebDriverManager.chromedriver().setup();

        // create the instance driver
        WebDriver driver= new ChromeDriver();

        // go to the google
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.navigate().to("https:www.tesla.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }
}
