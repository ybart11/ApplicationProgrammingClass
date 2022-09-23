package gsu.CIS3270.homework;

// Assignment 2.5 

import java.util.Scanner; // Needed to get user's input 

public class SumDigitsInteger {

	public static void main(String[] args) {
			
		  // Needed to get user's input
		  Scanner input = new Scanner (System.in);
		  
		  // Ask user to input integer 
		  System.out.print("Enter a number between 0 and 1000: ");
		  
		  // Stores user's input into a variable
		  int num = input.nextInt();
		  
		  int sum = 0;
		  
		  // Loop to extract digits
		  while (num > 0) {
			  sum += (num % 10); // adds the last digit 
			  
			  num /= 10; // removes the last digit
		  } 
			  
		System.out.println("The sum of the digits is " + sum);
		  input.close();

	}

}
