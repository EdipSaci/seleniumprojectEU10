package com.cydeo.tests.day5_TestNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_SelectingValue {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void selectValue(){
        //3. Select all the options from multiple select dropdown.
        Select select=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        //check if this element has multi select option
        System.out.println("select.isMultiple() = " + select.isMultiple());

        //select items
        select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);

        //4. Print out all selected values.
        List<WebElement> alloptions= select.getOptions();

        for (WebElement each : alloptions) {
            System.out.println(each.getText());
        }
        System.out.println("select = " + select.getFirstSelectedOption().getText());


        //5. Deselect all values.
        //select.deselectAll();
    }
}
