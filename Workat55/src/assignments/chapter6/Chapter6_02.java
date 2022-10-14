package assignments.chapter6;
import java.util.Scanner;

// Assignment 6.2 (Sum the digits in an integer)

public class Chapter6_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Obtain user's input
		System.out.print("Enter integers without space: ");
		long userDigits = input.nextLong(); 	// store user's input
		
		System.out.println(sumDigits(userDigits)); 	// use method to display sum 
		input.close();

	}
	
	// method that adds user's digits 
	public static int sumDigits(long n) {
		int sum = 0;
		
		while (n != 0) { 
		sum += n % 10; 	// adds the last digit
		n = n / 10; 	// removes the last digit
		}
		
		return sum;
	}

}
