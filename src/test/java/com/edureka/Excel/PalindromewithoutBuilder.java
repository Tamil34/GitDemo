package com.edureka.Excel;

import java.util.Scanner;

public class PalindromewithoutBuilder {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=myobj.nextLine();
		boolean isPalindrome=true;
		int length=x.length();
		for(int i=0;i<length/2;i++)
		{
			if(x.charAt(i)!= x.charAt(length-i-1))
				isPalindrome=false;
				break;
		}
		if(isPalindrome)
			System.out.println(x+"is a Palindrome");
		else
			System.out.println(x+"is not a Palindrome");

	}

}
