package cis3270.assignments;

//Assignment 3.1 (Algebra: solve quadratic equations) 

import java.util.Scanner;

public class Chapter3_01 {

	public static void main(String[] args) {
		// Ask for user's input 
		Scanner input = new Scanner (System.in);
		
		System.out.print("");
		double a = input.nextInt(); 
		double b = input.nextInt();
		double c = input.nextInt(); 
		
		// b^2 - 4ac
		double discriminant = (Math.pow(b, 2) - 4 * a * c); 
		
		
				
		

	}

}
