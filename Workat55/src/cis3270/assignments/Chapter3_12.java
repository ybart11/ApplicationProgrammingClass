package cis3270.assignments;
import java.util.Scanner;

// Assignment 3.12 (Palindrome number)

public class Chapter3_12 {

	public static void main(String[] args) {
		
		// Ask for user input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a three-digit number: ");
		int userNum = input.nextInt();
		
		
		int digit1 = (int)userNum / 100;
		int remaining = userNum % 100;
		int digit2 = (int)remaining % 10;
	
		if (digit1 == digit2) {
			System.out.print(userNum + " is a palindrome");
			
		}
		
		else {
			System.out.print(userNum + " is not a palindrome");
		}
		
		input.close();
	
	}

}
