package com.edureka.Excel;

public class SwapUsingTemp {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int temp;
		
		temp=a;// temp holds the value of a
		a=b;//a holds the value of b
		b=temp;// b holds the value of temp
		
		System.out.println("Value of a:"+a+",Value of b:"+b);

	}

}
