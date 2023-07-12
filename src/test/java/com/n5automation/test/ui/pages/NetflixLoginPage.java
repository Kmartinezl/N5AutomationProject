package com.n5automation.test.ui.pages;

import org.openqa.selenium.WebDriver;

public class NetflixLoginPage extends Page {
    public NetflixLoginPage(WebDriver driver) {
        super(driver);
    }
    public String verifyTitlePage() {
        return driver.getTitle();
    }
    public String printPageUrl() {
        return driver.getCurrentUrl();
    }
}
