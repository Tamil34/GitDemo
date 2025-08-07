package com.edureka.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Static_Webtable_handling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Total No of Rows:"+rows.size());
	    List<WebElement> firstDataRowColumns = rows.get(1).findElements(By.tagName("td"));
		System.out.println("Total No of Columns: " + firstDataRowColumns.size());
		List<WebElement> headers=table.findElements(By.tagName("th"));
		for(WebElement header:headers)
		{
			System.out.print(header.getText()+" | ");
		}
		for(WebElement row: rows)
		{
			List<WebElement> columns=row.findElements(By.tagName("td"));
			for(WebElement column: columns)
			{
				System.out.print(column.getText()+" | ");
			}
			System.out.println();
		}
		
      driver.quit();
	}

}
