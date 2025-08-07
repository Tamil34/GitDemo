package com.edureka.Excel;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
       int number=153;
       int Originalnum=number;
       int Calculatednum= Armstrong(number);
       System.out.println(Calculatednum);
       if(Originalnum==Calculatednum)
    	   System.out.println("Given no is an armstrong number");
       else
    	   System.out.println("Given no is not an armstrong number");
    }

	private static int Armstrong(int number) {
		int result=0;
		int digits=String.valueOf(number).length();
		while(number!=0)
		{
		int digit = number%10;
		result+=Math.pow(digit, digits);
		number=number/10;
		}
		return result;
	}
	
	

}
