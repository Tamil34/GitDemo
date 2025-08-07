package com.edureka.Excel;

public class CountOfLettersOfEachWordInAString {

	public static void main(String[] args) {
		String input="Java is awesome";
		String[] words=input.split(" ");
		for(String word:words)
		{
			System.out.println(word + ":"+word.length());
		}
		
		}

}
