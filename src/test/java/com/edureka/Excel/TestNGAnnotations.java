package com.edureka.Excel;

import org.testng.annotations.*;

public class TestNGAnnotations {

		@BeforeSuite
	    public void beforeSuite() {
	        System.out.println("1. BeforeSuite - Setup DB connection");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("2. BeforeTest - Launch browser");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("3. BeforeClass - Open application");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("4. BeforeMethod - Login");
	    }
	    @Test()
	    public void testCase1() {
	        System.out.println("5. Test - Running Test Case 1");
	    }

	    @Test
	    public void testCase2() {
	        System.out.println("6. Test - Running Test Case 2");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("7. AfterMethod - Logout");
	    }
	    @AfterClass
	    public void afterClass() {
	        System.out.println("8. AfterClass - Close application");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("9. AfterTest - Close browser");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("10. AfterSuite - Disconnect DB");
	    }


	}


