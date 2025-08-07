package com.edureka.Excel;

import java.util.Scanner;

public class UserInputAddition {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter First Number");
		int x = myobj.nextInt();
		System.out.println("Enter Another Number");
		int y =myobj.nextInt();
		int sum =x+y;
		System.out.println("Total:"+sum);

	}

}
