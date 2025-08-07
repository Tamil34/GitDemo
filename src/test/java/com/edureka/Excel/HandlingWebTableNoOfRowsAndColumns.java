package com.edureka.Excel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWebTableNoOfRowsAndColumns
{

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int NoOfColumns=col.size();
		System.out.println("Number Of Columns:"+NoOfColumns);
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		int NoOfRows=rows.size();
		System.out.println("Number Of Rows:"+NoOfRows);
		driver.close();
	}

}
