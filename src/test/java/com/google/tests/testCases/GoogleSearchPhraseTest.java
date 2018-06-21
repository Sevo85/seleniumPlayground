package com.google.tests.testCases;

import com.google.tests.BaseTest;
import com.google.tests.pageObjects.SearchHomePage;
import com.google.tests.pageObjects.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchPhraseTest extends BaseTest {

    @Test
    public void verifySearch() {
        SearchHomePage sp = new SearchHomePage(getDriver());
        sp.openSearchPage();
        SearchResultPage rp = sp.enterSearchPhrase("Sevo");
        String title = rp.getNthResult(1).getText();
        Assert.assertTrue(title.contains("Sevo"));
    }
}
