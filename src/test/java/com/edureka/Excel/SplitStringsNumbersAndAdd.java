package com.edureka.Excel;

public class SplitStringsNumbersAndAdd {
	public static void main(String[] args) {
		// Sample input string
		String input = "tam21il23";

		// Separate letters and numbers
		StringBuilder letters = new StringBuilder();
		int sumOfDigits = 0;
		StringBuilder currentNumber = new StringBuilder();

		// Iterate through each character in the input string
		for (char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) 
			{
				// If the character is a digit, append it to the current number
				currentNumber.append(ch);
				System.out.println(currentNumber.toString());
			}
			else
			{
				// If a number has been collected, sum the digits of that number
				
				if (currentNumber.length() > 0) 
				{
					//System.out.println("before:"+currentNumber.toString());
					sumOfDigits += sumDigits(currentNumber.toString());
					//System.out.println("after:"+currentNumber.toString());
					currentNumber.setLength(0); // Reset the number string
					
				}

				// If it's a letter, append it to the letters string
				letters.append(ch);
			}

		}


		// After loop ends, check if there's a number left to sum (in case of digits at the end)

		if (currentNumber.length() > 0) 
		{
			sumOfDigits += sumDigits(currentNumber.toString());
		}

		
		  // Print the result
		  
		  System.out.println("Letters: " + letters);
		  System.out.println("Sum of Digits: " + sumOfDigits);
		 
	}

	// Method to sum the individual digits of a number (given as a string)
	
	  public static int sumDigits(String number)
	  { 
		  int sum = 0; // Iterate through each character in the number string and add its numeric value
	   for (char ch :number.toCharArray())
	   { 
		   sum += Character.getNumericValue(ch); // Convert char to numeric value
       } 
	   return sum; 
	   }
	 
}
