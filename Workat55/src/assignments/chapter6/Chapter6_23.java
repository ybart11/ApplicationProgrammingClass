package assignments.chapter6;
import java.util.Scanner;

// Exercise 6.23 (Occurrences of specified character)

public class Chapter6_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Get user's input 
		System.out.print("Enter a string: ");
		String userStr = input.nextLine();
		
		System.out.print("Enter the letter you want to count: ");
		char userLetter = input.next().charAt(0);
		
		System.out.println("Amount of times letter '" + userLetter 
				+ "' occurs in " + userStr + ": "  + count(userStr, userLetter));
		
		input.close(); 
	
	}
	
	public static int count (String str, char a) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++; 
			}
		}
		return count; 
	}


}
