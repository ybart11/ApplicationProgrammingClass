package assignments.chapter6;
import java.util.Scanner;

// Exercise 6.3 (Palindrome integer) 

public class Chapter6_03 {
	public static void main (String [] args) {
		System.out.print("Test to see if your integer is palindrome");
		Scanner input = new Scanner (System.in);
		System.out.print("\nEnter an integer: ");
		int userNum = input.nextInt();
		
		// Display results using if statement
		if (isPalindrome(userNum)) {
			System.out.println(userNum + " is a palindrome");
		}
		else {
			System.out.println(userNum + " is not a palindrome");
		}
		input.close();
		
	}
	// Return the reversal of an integer, i.e., reverse (456) returns 654 
	public static int reverse (int number) {
		String reverse = "";
		String n = Integer.toString(number); // convert int to string
		
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		
		return Integer.parseInt(reverse);	// convert string back to int
	}

	// Return true if number is a palindrome
	public static boolean isPalindrome (int number) {
		return (number == reverse(number));
		}
	}

