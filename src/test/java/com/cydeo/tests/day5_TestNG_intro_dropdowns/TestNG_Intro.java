package com.cydeo.tests.day5_TestNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("------>BeforeClass is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("------>AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){  //It will execute before every method
        System.out.println("---> Before method is running");
    }

    @AfterMethod
    public void tearDown(){ //It will execute after every method
        System.out.println("---> After method is running");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running..");

        //Assert Equals: compare 2 of the same things
        String actual= "apple";
        String excepted= "apple";
        Assert.assertEquals(actual,excepted);
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2 is running..");

        //AssertTrue
        String actual= "apple";
        String excepted= "apple";
        Assert.assertTrue(actual.equals(excepted),"your message will go here");
    }




}
