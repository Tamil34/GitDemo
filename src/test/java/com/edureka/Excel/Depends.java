package com.edureka.Excel;

import org.testng.annotations.Test;



public class Depends
{
	@Test(dependsOnMethods={"login"})
	public void logout() 
	{
	System.out.println("This is a logout method");	
	}
	
	@Test
	public void login()
	{
		System.out.println("This is login method");
	}
	

	

}
