package com.google.tests.testCases;

import com.google.tests.BaseTest;


import com.google.tests.pageObjects.SearchHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePageTest extends BaseTest {


    @Test
    public void verifyGooglePageTittle() {
        SearchHomePage sp = new SearchHomePage(getDriver());
        sp.openSearchPage();
        Assert.assertEquals(sp.getPageTitle(), "Google");

    }


}
