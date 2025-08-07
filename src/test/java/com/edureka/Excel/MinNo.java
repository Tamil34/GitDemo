package com.edureka.Excel;

public class MinNo {

	public static void main(String[] args) {
	
		int[] ages= {20,40,60,70};
		int min=ages[0];
		for(int age:ages)
		{
			if(min>age)
				min=age;
		}
		System.out.println("Smallest No:"+min);

	}

}
