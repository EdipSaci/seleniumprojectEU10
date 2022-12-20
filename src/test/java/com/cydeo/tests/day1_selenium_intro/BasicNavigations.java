package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium Webdriver
        // This is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //This line will fullscreen the browser size
        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");


        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //----Stop code execution for 3 seconds
        Thread.sleep(3000);

        //4- Use selenium to navigate back
        driver.navigate().back();

        //----Stop code execution for 3 seconds
        Thread.sleep(3000);

        //5-Use selenium to navigate forward
        driver.navigate().forward();

        //----Stop code execution for 3 seconds
        Thread.sleep(3000);

        //6- Use selenium to navigate refresh
        driver.navigate().refresh();

        //----Stop code execution for 3 seconds
        Thread.sleep(3000);

        //7- Use navigate().to()
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the google page
        currentTitle= driver.getTitle();

        //8- Get the title from the page
        System.out.println("currentTitle = " + currentTitle);

        //9- Get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //10- This will close the currently window
        driver.close();

        //11- This will close all of the opened window
        driver.quit();

        //INTERVIEW QUESTION: Tell me about the common exceptions you are getting when you are using Selenium WebDriver?
        // NoSuchSessionException




    }
}
