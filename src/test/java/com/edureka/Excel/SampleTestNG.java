package com.edureka.Excel;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@BeforeClass
    public void setUpClass()
	{
        System.out.println("BeforeClass: Setting up the test class...");
    }
	
	@BeforeMethod
    public void setUpMethod() 
	{
        System.out.println("BeforeMethod: Setting up the test method...");
    }
	
	@Test
	public void Addition()
	{
	int sum=2+3;
	Assert.assertEquals(5, sum);
	System.out.println("Test Addition Executed");
	}
	
	@Test
	public void subtraction()
	{
		int sub=3-2;
		Assert.assertEquals(1, sub);
		System.out.println("Subtraction executed");
	}
	
	
	@AfterMethod
    public void tearDownMethod() {
        System.out.println("AfterMethod: Cleaning up after test method...");
    }
	
	@AfterClass
	public void finishClass()
	{
		System.out.println("After Class: Class has been executed");
	}

}
