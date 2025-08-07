package com.edureka.Excel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterFromString {


	public static void main(String[] args) {
	 String input="SWISS";
	 Character result=NonRepeatingCharacter(input);
	
    if(result != null)
    	System.out.println("First repeating character :" +result);
    else
    	System.out.println("No Non-Repeating character found");
	}

	private static Character NonRepeatingCharacter(String str)
	{
		HashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for(char c:str.toCharArray()) 
		{
			map.put(c,map.getOrDefault(c,0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
		return null;
	}

}
