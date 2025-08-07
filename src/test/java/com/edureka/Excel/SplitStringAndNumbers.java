package com.edureka.Excel;

public class SplitStringAndNumbers {

	public static void main(String[] args) {
		String input="tam21il23";
		String numbers="";
		String letters="";
		for(char ch:input.toCharArray())
		{
			if(Character.isDigit(ch))
				numbers=numbers+ch;
			else if(Character.isLetter(ch))
				letters=letters+ch;
		}
		System.out.println(numbers);
		System.out.println(letters);

	}

}
