package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (WebDriverException e) {
                System.out.println("***** CAUGHT EXCEPTION IN DRIVER TEARDOWN *****");
                e.printStackTrace();
            }
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
