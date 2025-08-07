package com.edureka.Excel;

import java.util.HashMap;

public class CountOfRepeatedCharacters {

	public static void main(String[] args) {
		String str="Selenium Automation";
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char c: str.toCharArray())
		{
			map.put(c, map.getOrDefault(c,0) + 1);
		}
		
		for(char c: map.keySet())
		{
			if(map.get(c) > 1)
				System.out.println(c + " : "+ map.get(c));
				
		}
		

	}

}
