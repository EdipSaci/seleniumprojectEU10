package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Selecting {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void selectingDropdown(){
        //TC #5: Selecting state from State dropdown and verifying result
        //we located the dropdown and it is ready to use
        Select selectState=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        selectState.selectByVisibleText("Illinois");

        //4. Select Virginia
        selectState.selectByValue("VA");

        //5. Select California
        selectState.selectByIndex(5);

        //6. Verify final selected option is California.
        String exceptedOptionText = "California";
        String actualOptionText = selectState.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,exceptedOptionText);

        //Use all Select options. (visible text, value, index)
    }

    /*
    TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown

     */

    @Test
    public void dropdown_task6(){
        //3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        yearDropdown.selectByVisibleText("2023");
        //Select month using : value attribute
        monthDropdown.selectByValue("11");
        //Select day using : index number
        dayDropdown.selectByIndex(0);

        //creating excepted values
        String exceptedYear= "2023";
        String exceptedMonth= "December";
        String exceptedDay= "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth= monthDropdown.getFirstSelectedOption().getText();
        String actualDay= dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(exceptedYear));
        Assert.assertEquals(actualMonth,exceptedMonth);
        Assert.assertEquals(actualDay,exceptedDay);

    }
     @AfterMethod
    public void teardownMethod(){
        driver.close();
     }

}
