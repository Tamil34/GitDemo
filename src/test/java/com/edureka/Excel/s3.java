package com.edureka.Excel;

public class s3 {

	public static void main(String[] args) {
		String input="tam21il23";
		StringBuilder CurrentNumber=new StringBuilder();
		StringBuilder letters=new StringBuilder();
		int SumOfDigits=0;
		String numbers="";
		for(char ch:input.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				CurrentNumber.append(ch);
				numbers=numbers+ch;
			}
			else
			{
				if(CurrentNumber.length()>0)
				{
				SumOfDigits=SumOfDigits+SumDigits(CurrentNumber.toString());
				CurrentNumber.setLength(0);
				}
				letters.append(ch);
			}
		}
		
		if (CurrentNumber.length() > 0) 
		{
			SumOfDigits += SumDigits(CurrentNumber.toString());
		}
		
System.out.println("SumOfDigits:"+SumOfDigits);
System.out.println("Letters:"+letters);
System.out.println("Numbers:"+numbers);
	}

	public static int SumDigits(String number)
	{
		int sum=0;
		for(char ch:number.toCharArray())
		{
			sum=sum+Character.getNumericValue(ch);
		}
		return sum;
	}

}
