package com.n5automation.test.ui.pages;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Page {
    protected final WebDriver driver;
    public Page(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
