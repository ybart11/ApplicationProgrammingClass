package cis3270.assignments;
import java.util.Scanner;

// Assignment 4.15 (Phone key pads)

public class Chapter4_15 {

	public static void main(String[] args) {
		
		// Get user's input 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a letter: ");
		String s = input.next();
		char l = s.charAt(0);
		l = Character.toUpperCase(l);
		
		// Display the corresponding number
		if (l == 'A' || l == 'B' || l == 'c') { 
			System.out.println("The corresponding number is 2");
		}
		else if (l == 'D' || l == 'E' || l == 'F') {
			System.out.println("The corresponding number is 3");
		}
		else if (l == 'G' || l == 'H' || l == 'I') {
			System.out.println("The corresponding number is 4");
		}
		else if (l == 'J' || l == 'K' || l == 'L') {
			System.out.println("The corresponding number is 5");
		}
		else if (l == 'M' || l == 'N' || l == 'O') {
			System.out.println("The corresponding number is 6");
		}
		else if (l == 'P' || l == 'Q' || l == 'R' || l == 'S') {
			System.out.println("The corresponding number is 7");
		}
		else if (l == 'T' || l == 'U' || l == 'V') {
			System.out.println("The corresponding number is 8");
		}
		else if (l == 'W' || l == 'X' || l == 'Y' || l == 'Z') {
			System.out.println("The corresponding number is 9");
		}
		else {
			System.out.print(l + " is an invalid input");
		}
		input.close();
}
}
