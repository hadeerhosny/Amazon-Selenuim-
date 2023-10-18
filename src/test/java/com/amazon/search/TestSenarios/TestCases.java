package com.amazon.search.TestSenarios;

import com.amazon.search.Pages.HomePage;
import com.amazon.search.base.BaseTest;
import com.shaft.driver.SHAFT;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {

    HomePage homePage;
    SHAFT.GUI.WebDriver Browser = new SHAFT.GUI.WebDriver();

    @Test
    public void SearchProductTC1() {
        HomePage homePage = new HomePage(driver);
        homePage.SearchBox("iPhone 12 Pro Max");
        homePage.Search();
        homePage.MinPrice("2000");
        homePage.MaxPrice("40000");
        homePage.FilterPrice();
        homePage.Color();
        homePage.SelectItem();
    }



    @Test
    public void AsssertProductPriceTC3() {
        homePage.SelectItem();
        homePage.AssertPrice();
        Assert.assertEquals(homePage, "EGP39,999.00");
    }

    @Test
    public void AssertProductColorTC4() {
        homePage.AssertColor();
        Assert.assertEquals(homePage, "blue");

    }

}
