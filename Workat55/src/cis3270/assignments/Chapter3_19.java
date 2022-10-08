package cis3270.assignments;
import java.util.Scanner;

// Assignment 3.19 (Compute the perimeter of a triangle) 

public class Chapter3_19 {

	public static void main(String[] args) {
		// Obtain for user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the sides of a triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// if statement to check if user's input is valid and displays results
		if (side1 > (side2 + side3) || side2 > (side1 + side3) || side3 > (side1 + side2)) {
			System.out.print("Input is not valid");
			
		}
		else { // if user's input are valid, add the sides together
			System.out.print("The perimeter of the triangle is " + (side1 + side2 + side3));
		}
		
		input.close();
	}

}
