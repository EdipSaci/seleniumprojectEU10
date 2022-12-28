package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_xpath {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/multiple_buttons");

        WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();

        WebElement actualText= driver.findElement(By.xpath("//p[@id='result']"));
        String exceptedText= "Clicked on button one!";

        System.out.println("actualText.getText() = " + actualText.getText());
        System.out.println("exceptedText = " + exceptedText);

        if (actualText.getText().equals(exceptedText)){
            System.out.println("Verification is PASSED!");
        }else {
            System.out.println("Verification is FAİLED!!");
        }


    }
}

/*
1. Open Chrome browser
2. Go to http://practice.cydeo.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
 */