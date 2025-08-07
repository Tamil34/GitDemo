package com.edureka.Excel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class HandlingAuthenticationPopups {

	public static void main(String[] args)
	{
		String username = "admin";
		String password = "admin";
		String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\tamilselvi.murugesan\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		String bodyText = driver.findElement(By.tagName("body")).getText();
		System.out.println(bodyText.contains("Congratulations") ? "Auth success" : "Auth failed");

	}

}
