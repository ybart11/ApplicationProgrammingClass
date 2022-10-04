package cis3270.assignments;

//Assignment 2.5 (Financial application: calculate tips)

import java.util.Scanner; // need this to use Scanner 


public class Chapter2_05 {

	public static void main(String[] args) {
		
		// Declare variables 
		double subtotal;
		double gratuity;
		double total;
		double gratuityRate;
		
		// Need this to prompt user input 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subtotal = input.nextInt();
		gratuity = input.nextInt();
		
		
		total = (subtotal * gratuity/100) + subtotal; // calculation to solve for total 
		gratuityRate = gratuity/10; // calculation to solve for gratuity rate  
		
		// Display results 
		System.out.println("The gratuity is $" + gratuityRate + " and the total is $" + total);
		
		input.close(); // close the Scanner
		
		

	}

}
