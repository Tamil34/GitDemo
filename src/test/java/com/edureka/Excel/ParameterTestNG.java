package com.edureka.Excel;



import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParameterTestNG 
{

    @Test
	@Parameters ({"Url"})
	public void LaunchUrl(String url)
	{
		System.out.println("Url:"+url);
	}
	
}
