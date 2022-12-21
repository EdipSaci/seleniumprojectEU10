package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoClassLocator {

    public static void main(String[] args) {

        //creating browser and opening chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // go to the page
        driver.get("https://practice.cydeo.com/inputs");
        //find the "home" link and click the link
        WebElement homeLink= driver.findElement(By.className("nav-link"));
        homeLink.click();
        //creating string object for titles
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        //print out the string objects
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        //verify the objects
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAİLED!");
        }



    }
}
