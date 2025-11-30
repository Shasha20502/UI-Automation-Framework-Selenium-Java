package com.automation.tests;

import com.automation.base.BaseClass;
import com.automation.pages.AmazonHomePage;
import com.automation.utils.ElementUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseClass {

    AmazonHomePage amazon;
    ElementUtils utils;

    @BeforeMethod
    public void setUpTest() {
        setup();
        driver.get("https://www.amazon.in/");
        amazon = new AmazonHomePage(driver);
        utils = new ElementUtils(driver);
    }

    @Test
    public void searchLaptopTest() {
        amazon.searchProduct("Laptop");
        Assert.assertTrue(driver.getTitle().contains("Laptop"),
                "Search results did not load properly");
        System.out.println("Test Passed → Laptop search displayed.");
    }

    @AfterMethod
    public void closeDriver() {
        tearDown();
    }
}
