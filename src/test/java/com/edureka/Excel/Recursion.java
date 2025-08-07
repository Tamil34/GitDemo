package com.edureka.Excel;

public class Recursion {

	public static void main(String[] args) 
	{
		int result = sum(10);
		System.out.println(result);
	}
	
	public static int sum(int k)
		{
		if(k>0)
		{
		System.out.println(k);
		//return sum(k-1);
		return k+sum(k-1);
		}
		else
		{
			return 0;
		}
		}

	

}
