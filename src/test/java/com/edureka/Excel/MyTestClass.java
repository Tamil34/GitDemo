package com.edureka.Excel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTestClass {
	
	/*@BeforeClass
	public void setupclass()
	{
		System.out.println("Sample - Before class");
	}*/
	
	@Test(groups="smoke")
    public void samplemethod1() {
		System.out.println("Sample method1");
        Assert.assertTrue(true);
    }
	
	@Test(groups="regression")
    public void samplemethod2() {
		System.out.println("Sample method2");
        Assert.assertTrue(true);
    }
	@Test(dependsOnGroups={"smoke"})
	public void samplemethod3()
	{
		System.out.println("Sample method3");
	}
	
	/*@AfterClass
	public void postclass()
	{
		System.out.println("Sample - After class");
	}*/

}
