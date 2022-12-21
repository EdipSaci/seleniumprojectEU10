package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForth {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go to google page
        driver.get("https://google.com");

        //find the link
        WebElement gmailLink= driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        //find the title name
        String gmailTitle= driver.getTitle();
        System.out.println("gmailTitle = " + gmailTitle);
        String expectedTitle="Gmail";
        System.out.println("expectedTitle = " + expectedTitle);

        //verify the title
        if (gmailTitle.contains("Gmail")){
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification is FAİLED!");
        }

        //go to main page with back()
        driver.navigate().back();

        //verify the title
        if (driver.getTitle().equals("Google")){
            System.out.println("Title verification is PASSED!");
        }
        else {
            System.out.println("Title verification is FAİLED!");
        }




    }
}
