package com.edureka.Excel;

public class FindOneMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6};
		int n=6;
		
		int expectedsum=n*(n*1)/2;
		int actualsum=0;
		
		for(int num:arr)
			actualsum +=num;
		
		int missing=expectedsum-actualsum;
		System.out.println("Missing no is:"+missing);

	}

}
