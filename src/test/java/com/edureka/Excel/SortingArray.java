package com.edureka.Excel;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) 
	{
	String[] cars= {"Volvo","BMW","Benz"};
	Arrays.sort(cars);
	for(String car:cars)
	{
		System.out.println(car);
	}
	}

}
