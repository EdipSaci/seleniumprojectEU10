package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtysTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // go to the page
        driver.get("https://www.etsy.com");
        //find the search box
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        //search the "wooden wpoon"
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        //verify the title
        String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        String expectedTitle= "Wooden spoon | Etsy";
        System.out.println("expectedTitle = " + expectedTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAİLED!");
        }



    }
}
