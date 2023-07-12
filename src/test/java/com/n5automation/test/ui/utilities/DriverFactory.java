package com.n5automation.test.ui.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Map<String, Supplier<WebDriver>> webDriverMap = new HashMap<>();

    static {
        webDriverMap.put("Chrome", ChromeDriver::new);
        webDriverMap.put("Firefox", FirefoxDriver::new);
        webDriverMap.put("Edge", EdgeDriver::new);
    }

    public static WebDriver getDriver(String browserType) {
        return webDriverMap.get(browserType).get();
    }
}
