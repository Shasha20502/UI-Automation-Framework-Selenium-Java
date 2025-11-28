package com.automation.tests;

import com.automation.base.BaseClass;
import com.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    HomePage home;

    @BeforeMethod
    public void setUpTest() {
        setup();
        driver.get("https://www.google.com");
        home = new HomePage(driver);
    }

    @Test
    public void verifyGoogleTitle() {
        String title = home.getTitle();
        System.out.println("Page Title Found: " + title);
        Assert.assertEquals(title,"Google","Page title did not match!");
    }


    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
