package cis3270.assignments.Chapter13.Exercise01;
import java.util.Scanner;

// Exercise 13.1 (Triangle class)

public class Test {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt the user to enter three sides of a triangle
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();
		
		// Prompt the user to enter a boolean value that indicates
		// if the triangle is filled 
		System.out.print("Is the triangle filled (true or false)? ");
		boolean filled = input.nextBoolean();
		
		// Create triangle
		Triangle triangle = new Triangle (side1, side2, side3, 
											color, filled);
		
		System.out.println(triangle);

		input.close();
	}

}
