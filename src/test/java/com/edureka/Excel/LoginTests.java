package com.edureka.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Setup EdgeOptions for headless mode
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // You can set WebDriver path manually if needed:
        // System.setProperty("webdriver.edge.driver", "drivers/msedgedriver");

        // Initialize EdgeDriver with options
        driver = new EdgeDriver(options);
        driver.get("https://example.com/login");
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("login")).click();

        // Assertion to check the page title after login
        Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Login failed or Dashboard not loaded.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
