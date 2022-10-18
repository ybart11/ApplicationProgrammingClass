package practice;

import java.util.Scanner;


public class Yer {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		String n = input.next();
		
		// convert string to int
		int num = Integer.parseInt(n);
		
		System.out.println("Your number: " + num);

					
		
		// Is number palindrome?
		System.out.println("Number is palindrome: " + isPalindrome (num) + ", " + reverse(num));
		
		input.close();
		
	}
	
	public static int reverse (int number) {
		int reverse = 0;
		
		while (number != 0) {
			reverse *= 10; // is ignored in first iteration
			reverse += number % 10; // adds the last number
			
			number /= 10; // removes the last number
		}
		
		return reverse;
	}
	
	// test if number is palindrome 
	public static boolean isPalindrome (int number) {
		return (number == reverse(number));
	}
	
	
}