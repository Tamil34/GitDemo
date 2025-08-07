package com.edureka.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class ActionClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Actions action = new Actions(driver);
		WebElement RightClickEvent=driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(RightClickEvent).perform();
		driver.navigate().refresh();
		WebElement DoubleClickEvent=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(DoubleClickEvent).perform();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.navigate().refresh();
		driver.get("https://www.amazon.in/");
		WebElement MouseHoverEvent=driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(MouseHoverEvent).perform();
		driver.navigate().refresh();
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement From=driver.findElement(By.id("draggable"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", From);
		WebElement To=driver.findElement(By.id("droppable"));
		action.dragAndDrop(From, To).perform();
		String Text=driver.findElement(By.tagName("p")).getText();
		System.out.println(Text);
		driver.quit();
		
}

}
