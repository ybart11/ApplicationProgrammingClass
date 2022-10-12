package cis3270.assignments;
import java.util.Scanner;

// Assignment 4.21 (Check SSN)

public class Chapter4_21 {

	public static void main(String[] args) {
		// Get user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();
		
		
		// use boolean to check if user's SSN is valid 
		boolean isValid = (ssn.length() == 11) 
				&& (Character.isDigit(ssn.charAt(0)))
				&& (Character.isDigit(ssn.charAt(1)))
				&& (Character.isDigit(ssn.charAt(2)))
				&& (ssn.charAt(3) == '-')
				&& (Character.isDigit(ssn.charAt(4)))
				&& (Character.isDigit(ssn.charAt(5)))
				&& (ssn.charAt(6) == '-')
				&& (Character.isDigit(ssn.charAt(7)))
				&& (Character.isDigit(ssn.charAt(8)))
				&& (Character.isDigit(ssn.charAt(9)))
				&& (Character.isDigit(ssn.charAt(10)));
		
		// if statement to display results 		
		if (isValid) {
			System.out.println(ssn + " is a valid social security number");
		}
		else {
			System.out.println(ssn + " is an invalid social security number");

		}
				
		input.close();
	}

}
