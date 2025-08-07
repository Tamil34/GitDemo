package com.edureka.Excel;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); //
        WebElement windowbutton=driver.findElement(By.id("windowButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", windowbutton);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("windowButton")));
		windowbutton.click();
        Set<String> allwindowHandles=driver.getWindowHandles();
        Iterator<String> it=allwindowHandles.iterator();
        String ParentWindow=it.next();
        boolean Status=it.hasNext();
        System.out.println("Is it true that we have child window"+Status);
        while(it.hasNext())
        {
        String ChildWindow=it.next();
        driver.switchTo().window(ChildWindow);
        WebElement text=driver.findElement(By.id("sampleHeading"));
        System.out.println("Header text of child window"+text.getText());
        driver.close();
        }
        driver.switchTo().window(ParentWindow);
        driver.quit();
        }
	}
   

