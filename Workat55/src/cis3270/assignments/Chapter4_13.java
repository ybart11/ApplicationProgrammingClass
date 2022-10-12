package cis3270.assignments;
import java.util.Scanner;

// Assignment 4.13 (Vowel or consonant?)

public class Chapter4_13 {

	public static void main(String[] args) {
		
		// Get user's input 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a letter: ");
		String a = input.next();
		char letter = a.charAt(0); // converts string to character 

		if (Character.isLetter(letter)) // checks if user's letter is a letter
		{
			switch(Character.toUpperCase(letter)) 
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(letter + " is a vowel"); break; 
				default : System.out.println(letter + " is a consonant"); 
			}
		}
		else {
			System.out.println(letter + " is an invalid input");
		}
		
		input.close();

	}
}


