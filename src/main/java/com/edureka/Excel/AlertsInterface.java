package com.edureka.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Alert;


public class AlertsInterface {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement button1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        button1.click();
        Alert alert1=driver.switchTo().alert();
        alert1.accept();
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        button2.click();
        alert1.dismiss();
        WebElement button3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button3.click();
        String AlertText=alert1.getText();
        System.out.println("Text from Alert:"+AlertText);
        alert1.sendKeys("sample");
        alert1.accept();
        driver.quit();
       
    }

}
