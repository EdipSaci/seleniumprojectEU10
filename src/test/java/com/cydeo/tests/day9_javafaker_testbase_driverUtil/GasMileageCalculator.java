package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMileageCalculator {
    @Test
    public void test(){
        Driver.getDriver().get("https://www.calculator.net");
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@id='calcSearchTerm']"));

        searchBox.sendKeys("gas mileage");

        WebElement gasMileageLink=Driver.getDriver().findElement(By.xpath("//a[.='Gas Mileage Calculator']"));

        gasMileageLink.click();


        //a. Title equals: “Gas Mileage Calculator”
        Assert.assertEquals("Gas Mileage Calculator",Driver.getDriver().getTitle());

        //b. “Gas Mileage Calculator” label is displayed
        WebElement label = Driver.getDriver().findElement(By.xpath("//h1"));
        Assert.assertTrue(label.isDisplayed());

        //6. Locate, clear and type “7925” into “Current odometer” field
        WebElement currentOdometer= Driver.getDriver().findElement(By.xpath("//input[@id='mucodreading']"));
        currentOdometer.clear();
        currentOdometer.sendKeys("7925");

        //7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometer = Driver.getDriver().findElement(By.xpath("//input[@id='mupodreading']"));
        previousOdometer.clear();
        previousOdometer.sendKeys("7550");

        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded = Driver.getDriver().findElement(By.xpath("//input[@id='mugasputin']"));
        gasAdded.clear();
        gasAdded.sendKeys("16");

        //9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice = Driver.getDriver().findElement(By.xpath("//input[@id='mugasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");

        //10. Click on Calculate button
        WebElement calculateButton = Driver.getDriver().findElement(By.xpath("(//input[@value='Calculate'])[2]"));
        calculateButton.click();

        //11. Verify mpg value is as expected:
        //Expected value: “23.44 mpg”


    }
}
