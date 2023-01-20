package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_SmartBear {

    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    @Test
    public void test1(){
        /*
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        //3. Enter username: “Tester”
        WebElement userNameBox =  Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameBox.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");

        //5. Click to Login button
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

         */

        SmartBearUtils.loginToSmartBear(Driver.getDriver());

        //6. Click on Order
        Driver.getDriver().findElement(By.xpath("//a[.='Order']")).click();

        //7. Select familyAlbum from product, set quantity to 2
        Select productSelect= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
        productSelect.selectByVisibleText("FamilyAlbum");

        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")).sendKeys("2");


        //8. Click to “Calculate” button
        Driver.getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();

        //9. Fill address Info with JavaFaker   Generate: name, street, city, state, zip code
        Faker faker= new Faker();
        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']")).sendKeys(faker.name().fullName());

        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")).sendKeys(faker.address().streetName());

        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")).sendKeys(faker.address().city());

        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")).sendKeys(faker.address().state());

        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")).sendKeys(faker.numerify("#####"));


        //10. Click on “visa” radio button
        Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();

        //11. Generate card number using JavaFaker
        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")).sendKeys(faker.finance().creditCard().replaceAll("-",""));
        Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")).sendKeys(faker.numerify("##/##"));


        //12. Click on “Process”
        Driver.getDriver().findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

        //13. Verify success message “New order has been successfully added.”
        String actualMessage=Driver.getDriver().findElement(By.xpath("//strong")).getText();
        String exceptedMessage= "New order has been successfully added.";

        Assert.assertEquals(actualMessage,exceptedMessage);
    }


}
