package com.edureka.Excel;

public class CountOfOccurenceOfLetters {

	public static void main(String[] args) {
	String str="Selenium WebDriver";
	char ch='e';
	long count=str.chars().filter(d -> d == ch).count();
	System.out.println(count);
}

}
