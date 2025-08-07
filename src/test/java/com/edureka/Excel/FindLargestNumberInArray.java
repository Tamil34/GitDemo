package com.edureka.Excel;

import java.util.Arrays;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {10,2,30,60,50,70,80,100};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
		}

}

