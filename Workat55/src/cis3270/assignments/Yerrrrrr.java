package cis3270.assignments;

import java.util.Scanner;

public class Yerrrrrr {

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			// Prompt the user to enter a three-digit integer
			System.out.print("Enter a three-digit integer: ");
			int number = input.nextInt();

			// Test for palindrome 
			int digit1 = (int)(number / 100);
			int remaining = number % 100;
			int digit3 = (int)(remaining % 10);

			// Display result
			System.out.println(
				number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
		}
	}
