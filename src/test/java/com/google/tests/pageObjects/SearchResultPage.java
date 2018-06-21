package com.google.tests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends BaseClass {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNthResult(int n){
        return driver.findElement(By.cssSelector("div#rso .g:nth-child(" + n + ") h3 a"));
    }
}
