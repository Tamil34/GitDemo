package com.edureka.Excel;

public class FactorialUsingIteration {

	public static void main(String[] args)
	{
	int n=5;
   int factorialvalue=factorial(n);
   System.out.println(factorialvalue);
	}

	private static int factorial(int n)
	{
	 if(n==0||n==1)
		 return 1;
	 int result=1;
	 for(int i=2;i<=n;i++)
	 {
		result=result*i; 
	 }
	 return result;
	}

}
