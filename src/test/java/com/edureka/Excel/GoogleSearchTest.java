package com.edureka.Excel;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	import org.openqa.selenium.edge.EdgeDriver;
	
	
	@Listeners(com.edureka.Excel.ExtentReportListener.class)
	public class GoogleSearchTest {
	    WebDriver driver;

	    @BeforeMethod
	    public void setUp()
	    {
	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testGoogleTitle()
	    {
	        driver.get("https://www.google.com");
	        Assert.assertTrue(driver.getTitle().contains("Google"));
	    }
	    
	    @Test
	    public void testFailExample()
	    {
	        driver.get("https://www.google.com");
	        Assert.assertTrue(driver.getTitle().contains("Bing"));
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

