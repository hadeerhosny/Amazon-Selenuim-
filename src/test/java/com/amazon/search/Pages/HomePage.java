package com.amazon.search.Pages;


import io.opentelemetry.api.internal.ConfigUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id=\"twotabsearchtextbox\"]")
    private WebElement SearchBox;

    @FindBy(css = "[id=\"nav-search-submit-button\"]")
    private WebElement SearchIcon;

    @FindBy(css = "[id=\"low-price\"]")
    private WebElement MinPrice;

    @FindBy(css = "[id=\"high-price\"]")
    private WebElement MaxPrice;

    @FindBy(css = "[class=\"a-button a-spacing-top-mini a-button-base s-small-margin-left\"]")
    private WebElement FilterPrice;

    @FindBy(css = "[id=\"p_n_size_two_browse-vebin/21908989031\"]")
    private WebElement ColorBlue;

    @FindBy(css = "[class=\"a-size-base-plus a-color-base a-text-normal\"]")
    private WebElement SelectItem;


    @FindBy(css = "[class=\"a-price aok-align-center reinventPricePriceToPayMargin priceToPay\"]")
    private WebElement AssertPrice;

    @FindBy(css = "[class=\"selection\"]")
    private WebElement AssertColor;

    public void SearchBox(String product) {
        SearchBox.sendKeys(product);
    }

    public void Search() {
        SearchIcon.click();
    }

    public void MinPrice(String minprice) {
        MinPrice.sendKeys(minprice);
    }

    public void MaxPrice(String maxprice) {
        MaxPrice.sendKeys(maxprice);
    }

    public void FilterPrice() {
        FilterPrice.click();
    }

    public void Color() {
        ColorBlue.click();
    }

    public void SelectItem() {
        SelectItem.click();
    }

    public void AssertPrice() {
        AssertPrice.getText();
    }

    public void AssertColor() {
        AssertColor.getText();
    }

}
