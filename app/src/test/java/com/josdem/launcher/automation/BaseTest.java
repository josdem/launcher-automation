package com.josdem.launcher.automation;

import com.josdem.launcher.automation.service.AppiumService;
import com.josdem.launcher.automation.service.impl.AppiumServiceImpl;
import com.josdem.launcher.automation.util.ConfigurationReader;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

    private static AndroidDriver driver;
    private static AppiumService appiumService = new AppiumServiceImpl();
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static AndroidDriver getDriver() throws IOException {
        if (driver == null) {
            appiumService.setCapabilities(capabilities);
            driver = new AndroidDriver(new URL(ConfigurationReader.getProperty("appium.server")), capabilities);
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigurationReader.getProperty("appium.wait")), TimeUnit.SECONDS);
        }
        return driver;
    }
}
