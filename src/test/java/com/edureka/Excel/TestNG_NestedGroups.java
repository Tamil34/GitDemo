package com.edureka.Excel;

import org.testng.annotations.Test;

public class TestNG_NestedGroups 
{
	@Test(priority=1,groups= {"demo"})
    public void testCase1() 
	{
        System.out.println("Test - TestNG Nested Groups- Running Test Case 1");
    }
	
	@Test(priority=2)
    public void testCase2() 
    {
        System.out.println("Test -TestNG Nested Groups- Running Test Case 2");
    }
}
