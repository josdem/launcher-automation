package com.josdem.launcher.automation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LauncherTest extends BaseTest {

    private AndroidDriver driver;
    private WebElement textView;

    private Logger log = Logger.getLogger(this.getClass().getName());

    @When("I launch the application")
    public void shouldLaunchTheApplication() throws Exception {
        log.info("Running: I launch the application at " + new Date());
        driver = getDriver();
    }

    @Then("I validate Launcher! message is present")
    public void shouldDisplayCategories() throws Exception {
        log.info("Running: I should be able to see the category list at " + new Date());
        textView = driver.findElement(By.id("message"));
        assertEquals("Hello", textView.getText());
    }

}
