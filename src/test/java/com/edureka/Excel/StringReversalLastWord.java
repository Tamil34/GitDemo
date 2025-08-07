package com.edureka.Excel;

public class StringReversalLastWord {

	public static void main(String[] args)
	{
		String input = "I love programming";
		String Output=ReverseLastword(input);
		System.out.println(Output);
	}

	private static String ReverseLastword(String input)
	{
		String[] words=input.split(" ");
		if(words.length==0)
			return input;
		String lastWord = words[words.length-1];
		StringBuilder bf= new StringBuilder(lastWord);
		String reversedLast=bf.reverse().toString();
		words[words.length-1]=reversedLast;
		return String.join(" ", words);
	}

}
