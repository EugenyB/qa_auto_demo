package tests;

import helper.TestHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import steps.LoginSteps;

import java.io.File;
import java.time.Duration;

public abstract class BaseTest {
    private static WebDriver driver;

    protected WebDriverWait wait;

    public static WebDriver getDriver() {
        return driver;
    }

    LoginSteps steps;

    @BeforeClass
    public void beforeClass() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //driver.navigate().to(TestHelper.siteUrl());
        steps = new LoginSteps();
    }

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(TestHelper.siteUrl());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
