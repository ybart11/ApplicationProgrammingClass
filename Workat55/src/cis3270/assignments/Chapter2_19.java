package cis3270.assignments;

// Assignment 2.19 (Geometry: area of a triangle)

import java.util.Scanner;

public class Chapter2_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		// Obtain user's input 
		System.out.print("Enter three points for a triangle: "); 
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Compute the sides of the triangle
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		// Compute s 
		double s = (side1 + side2 + side3)/2;
		
		// Compute area
		double area = Math.sqrt(s*(s - side1) * (s - side2) * (s - side3));
		
		// Display results
		System.out.println("The area of the triangle is " + (float)(area));
		
		input.close();

	}

}
