package com.edureka.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathOrOperator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		boolean loginbutton=driver.findElement(By.xpath("//button[@class='radius' or @type='submit']")).isDisplayed();
		System.out.println("Is login button displayed: "+loginbutton);
		driver.quit();

	}

}
