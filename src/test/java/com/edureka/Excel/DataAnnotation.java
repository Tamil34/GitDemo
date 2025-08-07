package com.edureka.Excel;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataAnnotation
{
@DataProvider(name="loginData")
public Object[][] provideData()
{
	return new Object[][]
			{
		{"Admin","admin123"},
	        };
}

@Test(dataProvider="loginData")
public void login (String Username,String Password)
{
	WebDriver driver=new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Boolean status=driver.findElement(By.xpath("//button[contains(@class,'oxd-main-menu-button')]")).isDisplayed();
	//Assert.assertEquals(status, true);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-userdropdown-tab']")));
	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='menu']\"")));
	Select obj=new Select(driver.findElement(By.xpath("//ul[@role='menu']")));
	obj.selectByVisibleText("Logout");
	
	//driver.close();
}

}
