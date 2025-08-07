package com.edureka.Excel;

public class factorialUsingRecursion {

	public static void main(String[] args) 
	{
		int n=5;
     int factorialRecursionValue=factorialrecursion(n);
     System.out.println(factorialRecursionValue);
	}

	private static int factorialrecursion(int n)
	{
		if(n==0||n==1)
			return 1;
		else
		return n*factorialrecursion(n-1);
	}

}
