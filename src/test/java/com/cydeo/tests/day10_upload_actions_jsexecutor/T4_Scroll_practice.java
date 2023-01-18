package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_Scroll_practice {

    @Test
    public void scroll_test1(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        Actions actions= new Actions(Driver.getDriver());
        WebElement poweredByCydeo= Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        actions.moveToElement(poweredByCydeo).perform();

        //4- Scroll using Actions class “moveTo(element)” method

        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
        }

    }


}
