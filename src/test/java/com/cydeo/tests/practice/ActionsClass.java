package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsClass {
    //1. Launch browser
    WebDriver driver;
    @BeforeMethod
    public void setup_method(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void actionTest(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        String exceptedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,exceptedUrl);

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed());

        //6. Enter name and email address
        Actions actions= new Actions(driver);
        WebElement nameBox=driver.findElement(By.xpath("//input[@name='name']"));
        nameBox.sendKeys("edips");
        actions.sendKeys(Keys.TAB)
                .sendKeys("edipss@gmail.com")
                //7. Click 'Signup' button
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//b")).isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement genderMr= driver.findElement(By.xpath("//input[@id='id_gender1']"));
        genderMr.click();

        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys("12345");

        Select selectOfDay= new Select(driver.findElement(By.xpath("//select[@id='days']")));
        selectOfDay.selectByIndex(3);
        actions.sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                //10. Select checkbox 'Sign up for our newsletter!'
                .sendKeys(Keys.TAB)
                .click()
                //11. Select checkbox 'Receive special offers from our partners!'
                .sendKeys(Keys.TAB)
                .click().perform();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstNameBox=driver.findElement(By.xpath("//input[@id='first_name']"));
        firstNameBox.sendKeys("edips");
               actions .sendKeys(Keys.TAB)
                .sendKeys("s")
                .sendKeys(Keys.TAB)
                .sendKeys("my")
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("john street")
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("texsasBig")
                .sendKeys(Keys.TAB)
                .sendKeys("george")
                .sendKeys(Keys.TAB)
                .sendKeys("06930")
                .sendKeys(Keys.TAB)
                       .sendKeys("05355554488")
                       .sendKeys(Keys.TAB).perform();
                //13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//b")).isDisplayed());

        //15. Click 'Continue' button
        driver.findElement(By.xpath("//a[text()='Continue']")).click();

        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//b[text()='edips']")).isDisplayed());

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(driver.findElement(By.xpath("//b")).isDisplayed());
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
    }

}
