package com.google.tests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchHomePage extends BaseClass {
    String pageUrl = "http://google.com";
    public SearchHomePage(WebDriver driver) {
        super(driver);
    }

    public void openSearchPage(){
        driver.navigate().to(pageUrl);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public SearchResultPage enterSearchPhrase(String phrase) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(phrase);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }
}
