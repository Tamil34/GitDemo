package com.edureka.Excel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;


public class JDBC {
	
	public static List<Integer> fetchCustomerIds()
	{
		List<Integer> CustomerIds=new ArrayList();
		String Url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Password123";
		
		try(Connection conn=DriverManager.getConnection(Url, username, password);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT Customer_id FROM CUSTOMERS"))
		{
		while(rs.next())	
		{
			int id=rs.getInt("Customer_id");
			CustomerIds.add(id);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return CustomerIds;
	
	}
	
	public static void main(String[] args)
	{
		List<Integer> CustomerIds=fetchCustomerIds();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("C:\\Users\\tamilselvi.murugesan\\Downloads\\seleniumTests\\sampleDBHtml.html");
		driver.manage().window().maximize();
		try
		{
		for(Integer id:CustomerIds)
		{
			WebElement CustomerId=driver.findElement(By.id("customerId"));
			CustomerId.clear();
			CustomerId.sendKeys(String.valueOf(id));
			System.out.println("Filled form with CustomerId:"+id);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			driver.quit();
		}
		
	}

}
