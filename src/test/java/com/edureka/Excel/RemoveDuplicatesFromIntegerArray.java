package com.edureka.Excel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromIntegerArray {

	public static void main(String[] args) {
		int[] arr= {1,1,2,3,3,4,5};
  Set<Integer> unique=new LinkedHashSet<>();
   for(int num:arr)
   {
	   unique.add(num);
   }
System.out.println(unique);
	}

}
