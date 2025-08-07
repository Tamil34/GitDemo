package com.edureka.Excel;

public class Palindrome {

	public static void main(String[] args) {
		String OriginalStr="Hello";
		StringBuilder bd=new StringBuilder(OriginalStr);
		String ReversedStr=bd.reverse().toString();
		System.out.println(ReversedStr);
		
		  if(OriginalStr.equals(ReversedStr))
		    System.out.println("Given String is a Palindrome");
		  else
		    System.out.println("Not a Palindrome");
		  
		 
		
		}

}
