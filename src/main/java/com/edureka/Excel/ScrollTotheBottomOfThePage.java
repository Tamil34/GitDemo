package com.edureka.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollTotheBottomOfThePage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://infinite-scroll.com/demo/full-page/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
		driver.quit();

	}

}
