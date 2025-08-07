package com.edureka.Excel;

public class StringReversalChar {

	public static void main(String[] args) 
	{
		String OriginalStr="Hello";
		String reversedStr="";
		for(int i=0;i<OriginalStr.length();i++)
		{
			reversedStr=OriginalStr.charAt(i)+reversedStr;
		}
		
		System.out.println(reversedStr);
	}

}
