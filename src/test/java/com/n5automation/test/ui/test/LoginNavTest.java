package com.n5automation.test.ui.test;

import com.n5automation.test.ui.pages.NetflixLoginPage;
import com.n5automation.test.ui.utilities.DriverFactory;
import com.n5automation.test.ui.utilities.ConfigProperties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginNavTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() throws IOException {

        ConfigProperties.initializePropertyFile();

        this.driver = DriverFactory.getDriver(ConfigProperties.setUpBrowser());

        assert driver != null;
        driver.get(ConfigProperties.setUpBaseUrl());

        driver.manage().window().maximize();
    }

    @Test
    public void verifyPageTitle() {

        NetflixLoginPage netflixLoginPage = new NetflixLoginPage(driver);

        System.out.println(netflixLoginPage.verifyTitlePage());
        String expectedTitlePage = "Netflix Colombia: Ve series online, ve películas online";
        Assert.assertEquals("Page title doesn't match",netflixLoginPage.verifyTitlePage(),
                expectedTitlePage);

    }
    @Test
    public void verifyPageUrl() {

        NetflixLoginPage netflixLoginPage = new NetflixLoginPage(driver);

        System.out.println(netflixLoginPage.printPageUrl());
        Assert.assertEquals("Page URL doesn't match",netflixLoginPage.printPageUrl(),
                ConfigProperties.property.getProperty("appUrl"));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
