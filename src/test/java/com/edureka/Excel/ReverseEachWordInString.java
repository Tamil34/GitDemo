package com.edureka.Excel;

public class ReverseEachWordInString {

	public static void main(String[] args)
	{
     String input="Java Selenium Automation";
     String[] str1=input.split(" ");
     for(String str:str1)
     {
    	 StringBuilder bf=new StringBuilder(str);
    	 String reversed=bf.reverse().toString()+" ";
    	    System.out.print(reversed);
     }
 
	}

}
