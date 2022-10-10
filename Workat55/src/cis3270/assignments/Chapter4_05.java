package cis3270.assignments;
import java.util.Scanner;

// Assignment 4.5 (Geometry: area of a regular polygon)

public class Chapter4_05 {

	public static void main(String[] args) {
		// Get user's input for number of sides
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		
		// Get user's input length of a regular polygon 
		System.out.print("Enter the length of the side: ");
		double s = input.nextDouble();
		
		// Compute area
		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
			
		// Display results
		System.out.println("The area of the polygon is " + area);
		
		input.close();
	}

}
