package com.edureka.Excel;

public class SumAndAvg {

	public static void main(String[] args) {
      int[] ages= {10,20,30,40,50};
      int sum=0;
      int length=ages.length;
      System.out.println("length of the array:"+length);
      for(int i:ages)
      {
    	  sum=sum+i;
      }
      System.out.println("Sum:"+sum);
      
      int avg=sum/length;
      System.out.println("Average:"+avg);

	}

}
