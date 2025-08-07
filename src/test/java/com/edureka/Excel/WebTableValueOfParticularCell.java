package com.edureka.Excel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableValueOfParticularCell {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		WebElement Row=table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]"));
	    String RowText=Row.getText();
	    WebElement Row1=table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[1]"));
	    String RowText1=Row1.getText();
	    System.out.println("Row Text:"+RowText);
	    WebElement Col=Row.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[4]"));
	    String ColText=Col.getText();
	    System.out.println("Current Price of "+RowText1+" is:"+ColText);
	    driver.close();
		
	}
}
