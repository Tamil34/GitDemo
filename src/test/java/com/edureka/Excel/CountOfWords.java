package com.edureka.Excel;

public class CountOfWords {

	public static void main(String[] args) {
		String words= "One Two Three Four";
		int CountOfWords=words.split("\\s").length;
		System.out.println(CountOfWords);

	}

}
