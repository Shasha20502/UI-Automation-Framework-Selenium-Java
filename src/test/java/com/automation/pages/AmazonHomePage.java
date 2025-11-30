package com.automation.pages;

import com.automation.utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    WebDriver driver;
    ElementUtils utils;

    // Locators
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    // Constructor
    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utils = new ElementUtils(driver);
    }

    // Actions
    public void searchProduct(String product) {
        utils.type(searchBox,product);
        utils.click(searchButton);
    }
}
