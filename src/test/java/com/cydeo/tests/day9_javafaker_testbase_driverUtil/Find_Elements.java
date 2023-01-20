package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Find_Elements {
    @Test
    public void number_of_link(){
        Driver.getDriver().get("https://www.openxcell.com");
        List<WebElement> listOfLLink = Driver.getDriver().findElements(By.xpath("//a"));

        System.out.println("listOfLLink.size() = " + listOfLLink.size());

        for (WebElement webElement : listOfLLink) {
            System.out.println(webElement.getText());
        }

        int count= 0;
        for (WebElement webElement : listOfLLink) {

            if (webElement.getText().isEmpty()){
                count++;
            }
        }
        System.out.println(count);

    }

}
