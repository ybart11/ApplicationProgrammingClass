package assignments.chapter6;
import java.util.Scanner;

// Exercise 6.18 (Check password)

public class Chapter6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Header
		System.out.print("Password must:"
				+ " \n-Have at least eight characters"
				+ " \n-Consist of only letters and digits"
				+ " \n-Must contain at least two digits");
		
		// Get user's input 
		System.out.print("\n\nEnter password: ");
		String password = input.nextLine();
		
		// Display results methods
		if (isPassword(password)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
		
		input.close();
	}
	// method to check if password is valid 
	public static boolean isPassword (String p) {
		boolean validPassword = 
				lengthValid(p) && lettersDigits (p) && twoDigits(p);
		return validPassword;
	}
	
	// method to check if password's length is valid
	public static boolean lengthValid (String p) {
		return (p.length() >= 8);
		}
	
	// method to check if password is alphanumeric
	public static boolean lettersDigits(String p) {
		// loop to check every character of string 
		for (int i = 0; i < p.length(); i++) {
			if (!Character.isLetterOrDigit(p.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	// method to check if password contains at least two digits 
	public static boolean twoDigits(String p) {
		int numOfDigits = 0;
		
		for (int i = 0; i < p.length(); i++) {
			if (Character.isDigit(p.charAt(i))) {
				numOfDigits++; 
			}
			
			if (numOfDigits >= 2) {
				return true;
			}
			
		}
		
		return false;

		
	}

}
