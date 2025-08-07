package com.edureka.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

public class FrameHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
        driver.get("file:///C:/Users/tamilselvi.murugesan/Downloads/seleniumTests/Frame-Practice.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement FrameOneText=driver.findElement(By.tagName("h2"));
        System.out.println("Text inside Frame1: "+FrameOneText.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        driver.switchTo().frame("nestedFrame");
        WebElement NestedFrameText=driver.findElement(By.tagName("h3"));
        System.out.println("Text inside NestedFrame: "+NestedFrameText.getText());
        driver.quit();
	}

}
