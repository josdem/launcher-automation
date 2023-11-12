package com.josdem.launcher.automation;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LauncherTest extends BaseTest {

    private AndroidDriver driver;

    private Logger log = Logger.getLogger(this.getClass().getName());

    @When("I launch the application")
    public void shouldLaunchTheApplication() throws Exception {
        log.info("Running: I launch the application at " + new Date());
        driver = getDriver();
    }

    @And("I validate welcome message is present")
    public void shouldDisplayWelcomeMessage() throws Exception {
        log.info("Running: I should be able to see welcome message " + new Date());
        WebElement textView = driver.findElement(By.id("message"));
        assertEquals("Hello", textView.getText());
    }

    @And("I click on go button")
    public void shouldClickOnGoButton() throws Exception {
        log.info("Running: I should click on button " + new Date());
        WebElement button = driver.findElement(By.id("button"));
        button.click();
    }

    @Then("I validate launcher message")
    public void shouldValidateLauncherMessage() throws Exception {
        log.info("Running: I should validate launcher message " + new Date());
        WebElement textView = driver.findElement(By.id("message"));
        assertEquals("Launcher!", textView.getText());
    }

}
