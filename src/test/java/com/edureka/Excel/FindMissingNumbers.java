package com.edureka.Excel;

public class FindMissingNumbers {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,5,7,8};
		int n=8;
		
		for(int i=1;i<=n;i++)
		{
			boolean found=false;
			for(int num:arr)
			{
				if(num==i)
				{
					found=true;
					break;
				}
			}
			
			if(!found)
			{
				System.out.println(i+" ");
			}
		}

	}

}
