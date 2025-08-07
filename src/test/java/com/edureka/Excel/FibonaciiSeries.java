package com.edureka.Excel;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the No Of Terms");
		int n=scanner.nextInt();
		int first=0;
		int second=1;
		System.out.println("Fibonacii Series");
		for (int i=0;i<n;i++)
		{
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
		 }
		
}
}
