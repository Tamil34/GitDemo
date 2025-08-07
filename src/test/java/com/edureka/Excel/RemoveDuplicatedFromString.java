package com.edureka.Excel;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatedFromString {

	public static void main(String[] args) {
	
		String Actual="programming";
		Set<Character> unique=new LinkedHashSet<>();
		for(char c:Actual.toCharArray())
		{
			unique.add(c);
		}
		List<Character> expected=new ArrayList<>(unique);
		System.out.println(unique);
		System.out.println(expected);
		StringBuilder bf=new StringBuilder();
		for(char c:unique)
		{
			bf.append(c);
		}
       System.out.println("Unique characters to String:"+ bf.toString());
	}

}
