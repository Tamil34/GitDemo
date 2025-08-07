package com.edureka.Excel;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountAllNonRepeatedCharactersFromString {

	public static void main(String[] args) 
	{
		String input = "SWISS";
        printAllNonRepeatingCharacters(input);

	}
	private static void printAllNonRepeatingCharacters(String str) 
	{
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if (entry.getValue() == 1) 
            {
                System.out.println("Non-repeating character: " + entry.getKey() + " => Count: " + entry.getValue());
                found = true;
            }
        }

        if (!found) 
        {
            System.out.println("No Non-Repeating characters found");
        }
    }
}


