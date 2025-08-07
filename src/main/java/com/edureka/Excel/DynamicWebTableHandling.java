package com.edureka.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DynamicWebTableHandling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement tableContainer=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='table-responsive']")));
		WebElement table=tableContainer.findElement(By.tagName("table"));
		WebElement headerRow=table.findElement(By.tagName("thead")).findElement(By.tagName("tr"));
		List<WebElement> headers=headerRow.findElements(By.tagName("th"));
		
		int cpuIndex=-1;
		for (int i=0;i<headers.size();i++)
		{
			if(headers.get(i).getText().contains("CPU"))
			{
				cpuIndex=i;
				break;
			}
		}
		
		if(cpuIndex == -1)
		{
			System.out.println("CPU column not found");
			driver.quit();
			return;
		}
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			List<WebElement> cols=row.findElements(By.tagName("td"));
			if(cols.size() > cpuIndex && cols.get(0).getText().contains("Chrome"))
			{
				String cpuUsage = cols.get(cpuIndex).getText();
				System.out.println("CPU usage for " + cols.get(0).getText() + " is :" + cpuUsage);
				break;
			}
		}
		driver.quit();

	}

}
