package com.edureka.Excel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class FileUploadDialogHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement FileInput=driver.findElement(By.id("file-upload"));
		String filePath="C:\\Users\\tamilselvi.murugesan\\Downloads\\seleniumTests\\sample.txt";
		FileInput.sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		String msg=driver.findElement(By.tagName("h3")).getText();
		System.out.println(msg);
		driver.quit();
	}

}
