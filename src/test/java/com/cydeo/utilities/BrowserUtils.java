package com.cydeo.utilities;

    /*
    In this class only general utility methods that are NOT related to some specific page.
     */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
   This method will accept int (in seconds) and execute Thread.sleep for given duration
    */
    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }



    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */

    public static void switchWindowAndVerify(WebDriver driver,String exceptedInUrl,String expectedInTitle){
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles ) {

            driver.switchTo().window(each);

            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(exceptedInUrl)){
                break;
            }
        }
        //5. Assert: Title contains "expectedInTitle"
        String actualTitle= driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

   /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */

    public static void verifyTitle(WebDriver driver,String exceptedTitle){
        Assert.assertEquals(driver.getTitle(),exceptedTitle);
    }


}
