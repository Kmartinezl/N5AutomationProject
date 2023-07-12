package com.n5automation.test.ui.utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
    public static Properties property;

    public static void initializePropertyFile() throws IOException {
        property = new Properties();
        String configPath = "properties/TestData.properties";
        InputStream instm = new FileInputStream(configPath);
        property.load(instm);
    }
    public static String setUpBrowser() throws IOException{
        Properties properties = new Properties();
        properties.load(new FileReader("properties/TestData.properties"));
        return properties.getProperty("browserType");
    }

    public static String setUpBaseUrl() throws IOException{
        Properties properties = new Properties();
        properties.load(new FileReader("properties/TestData.properties"));
        return properties.getProperty("appUrl");
    }
}
