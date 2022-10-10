package cis3270.assignments;
import java.util.Scanner;

// Assignment 4.8 (Find the character of an ASCII code)

public class Chapter4_08 {

	public static void main(String[] args) {
		// Get user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an ASCII code: ");
		int userCode = input.nextInt();
		
		// character of user's ASCII
		char userASCII = (char) userCode;
		
		
		
		
		// if statement to see if user input is between 0 and 127
		
		if (userCode >= 0 && userCode <= 127) {
		System.out.print("The character for ASCII code " + userCode + " is " + userASCII);
		
	}
		else {
			System.out.println("Invalid input");
		}
		input.close();
}
}
