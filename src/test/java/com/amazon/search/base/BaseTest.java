package com.amazon.search.base;

import com.amazon.search.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new DriverFactory().initialization();
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
