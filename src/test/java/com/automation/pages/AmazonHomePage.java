package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

    WebDriver driver;

    // Locators
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    // Constructor
    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterSearchText(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}
