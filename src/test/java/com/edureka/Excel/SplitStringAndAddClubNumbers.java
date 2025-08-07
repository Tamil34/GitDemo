package com.edureka.Excel;

public class SplitStringAndAddClubNumbers {
	
	    public static void main(String[] args) {
	        // Sample input string
	        String input = "abc123xyz45";

	        // Separate letters and numbers
	        StringBuilder letters = new StringBuilder();
	        StringBuilder currentNumber = new StringBuilder();
	        
	        // Iterate through each character in the input string
	        for (char ch : input.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                // If the character is a digit, append it to the current number
	                currentNumber.append(ch);
	            } else {
	                // If a number has been collected, sum the digits and reset the number string
	                if (currentNumber.length() > 0) {
	                    int sumOfDigits = sumDigits(currentNumber.toString());
	                    System.out.println("Sum of digits in number " + currentNumber + ": " + sumOfDigits);
	                    currentNumber.setLength(0);  // Reset the number string
	                }
	                // If it's a letter, append to the letters string
	                letters.append(ch);
	            }
	        }

	        // After loop ends, check if there's a number left to sum (in case of digits at the end)
	        if (currentNumber.length() > 0) {
	            int sumOfDigits = sumDigits(currentNumber.toString());
	            System.out.println("Sum of digits in number " + currentNumber + ": " + sumOfDigits);
	        }

	        // Print the result
	        System.out.println("Letters: " + letters);
	    }

	    // Method to sum the individual digits of a number (as a string)
	    public static int sumDigits(String number) {
	        int sum = 0;
	        // Iterate through each character in the number string
	        for (char ch : number.toCharArray()) {
	            sum += Character.getNumericValue(ch);  // Convert the character to its numeric value and add it
	        }
	        return sum;
	    }
	}


