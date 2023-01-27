package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void drag_drop(){
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement circle= Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        Actions actions= new Actions(Driver.getDriver());

        WebElement bigCircle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        //actions.dragAndDrop(circle,bigCircle).perform();
        actions.clickAndHold(circle).moveToElement(bigCircle).release().perform();
        BrowserUtils.sleep(3);
        //2. Drag and drop the small circle to bigger circle.
        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualBigCircleText= bigCircle.getText();
        String exceptedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText,exceptedBigCircleText);
    }
}
