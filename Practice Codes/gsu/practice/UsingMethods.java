package gsu.practice;

import java.util.Scanner;

// Practice using methods

public class UsingMethods {

	public static int sum(int a, int b) {
		int sum;
		sum = a + b;

		return sum;
	}

	public static void nPrintln(String message, int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(message);

		}
	}

	public static void header() {
		System.out.println("Which program do you want to run?");
		System.out.println("A. Getting the sum of two numbers \nB. Displaying a message a number of times");

	}

	public static void main(String[] args) {

		// Needed to get user's input
		Scanner input = new Scanner (System.in);

		header();

		System.out.print("Answer: ");
		String letter = input.next();

		if (letter == "a") {


		  // Get user's input for variable yer
		  System.out.print("Enter a number: ");
		  int yer = input.nextInt();

		  // Get user's input for variable ner
		  System.out.print("Enter another number: ");
		  int ner = input.nextInt();

		  // display results
		  System.out.println("The sum of the numbers you entered is " + sum(yer,ner));
		 }
		else if (letter == "b") {

			// Ask user for their message
			System.out.print("Enter a message: ");
			String message = input.next();

			// Ask user how many times they want their message to display
			System.out.print("How many times do you want to display your message: ");
			int n = input.nextInt();

			nPrintln(message, n);
		 }
		  input.close();




	}

}
