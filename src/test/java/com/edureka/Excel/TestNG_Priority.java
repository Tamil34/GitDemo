package com.edureka.Excel;

import org.testng.annotations.Test;

public class TestNG_Priority 
{
	@Test(priority=1)
    public void testCase1() 
	{
        System.out.println("Test - Running Test Case 1");
    }

    @Test(priority=2)
    public void testCase2() 
    {
        System.out.println("Test - Running Test Case 2");
    }
    
    @Test
    public void testCase3() 
    {
        System.out.println("Test - Running Test Case 3");
    }
    
    @Test(priority=1)
    public void testCase4()
    {
        System.out.println("Test - Running Test Case 4");
    }
    
    @Test
    public void testCase5()
    {
        System.out.println("Test - Running Test Case 5");
    }
}
