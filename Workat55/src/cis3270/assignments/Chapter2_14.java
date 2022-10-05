package cis3270.assignments;

// Assignment 2.14 (Health application: computing BMI)
import java.util.Scanner;

public class Chapter2_14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		// Obtain user's weight in pounds, 95.5
		System.out.print("Enter weight in pounds: ");
		double userPounds = input.nextDouble();
		
		// Obtain user's weight in inches, 50
		System.out.print("Enter heigh in inches: ");
		int userWeight = input.nextInt();
		
		// Convert pounds to kilograms, one pound = 0.45359237
		double userKilo = userPounds * 0.45359237;
		
		// Convert inches to meters, one inch = 0.0254 meters
		double userMeters = userWeight * 0.0254;
		
		// Compute BMI 
		double userBMI = userKilo / (Math.pow(userMeters,2));
		
		// Display results, "BMI is 26.8573"
		System.out.print("BMI is " + (float)(userBMI));
		
		input.close();
		
		

	}

}
