package com.edureka.Excel;

public class StringReversal 
{
public static void main(String[] args) 
	{
	String OriginalStr="Tamilselvi";
	StringBuilder bf=new StringBuilder(OriginalStr);
	String ReversedStr=bf.reverse().toString();
	System.out.println("Original String:"+OriginalStr+",Reversed String:"+ReversedStr);
    }
}
