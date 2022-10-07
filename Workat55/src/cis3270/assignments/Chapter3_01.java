package cis3270.assignments;

//Assignment 3.1 (Algebra: solve quadratic equations) 

import java.util.Scanner;

public class Chapter3_01 {

	public static void main(String[] args) {
		
		// Ask for user's input 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble(); 
		double b = input.nextDouble();
		double c = input.nextDouble(); 
				
		// b^2 - 4ac
		double discriminant = (Math.pow(b, 2) - 4 * a * c);
		
		// call other variables
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);
		
		// Loop to check and display how many roots the discriminant equation has 
		if (discriminant > 0) {
			System.out.print("The equation has two roots " + (float)r1 + " and " + (float)r2);
		}
		
		else if (discriminant == 0) { 
			System.out.print("The equation has one root " + (float)r1);

		}
		
		else {
			System.out.print("The equation has no real roots");
		}
		
		input.close();
		
				
		

	}

}
