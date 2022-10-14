package assignments.chapter5;
import java.util.Scanner;

// Assignment 5.51 (Longest common prefix)

public class Chapter5_51 {

	public static void main(String[] args) {
		// Get user's input for first string 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first string: ");
		String firstString = input.nextLine();
		
		// Get user's input for second string
		System.out.print("Enter the second string: ");
		String secondString = input.nextLine();
		input.close();

		// find the minimum length of both strings
		int minLength = firstString.length() < secondString.length() ? firstString.length() : secondString.length();
		
		// loop to find if no common prefix
		if (firstString.charAt(0) != secondString.charAt(0)) {
			System.out.print(firstString + " and " + secondString + "" + " have no common prefix");
			return;
		}
		
		// loop to find common prefix 
		int i;
		for (i = 1; i < minLength; i++) {
			if (firstString.charAt(i) != secondString.charAt(i)) {
				break;
			}
		}
				System.out.println("The common prefix is " + firstString.substring(0, i));
				
	}

}
