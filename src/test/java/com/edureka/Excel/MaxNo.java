package com.edureka.Excel;

public class MaxNo {

	public static void main(String[] args) {
      int[] a= {10,20,30,40,50};
      int max=a[0];
      int sum=0;
      for(int i:a)
      {
    	  sum=sum+i;
    	  if(max<i)
    		  max=i;
      }
      System.out.println("Maximum No:"+max);
      System.out.println("Sum Of all the Numbers:"+sum);
      
     
	}

}
