package assignments.chapter5;
import java.util.Scanner;

//Assignment 9.17 ()

public class Chapter5_17 {

	public static void main(String[] args) {
		// Ask for user's input 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of lines: ");
		int numOfLines = input.nextInt();
		
		// Display pyramid using a loop 
		for (int i = 1; i < numOfLines; i++) {
			
			
			// Loop to create space
			for (int j = numOfLines - i; j >= 1; j--) {
				System.out.print("  ");
			}
			
			// loop to create descending numbers 
			for (int k = i; k >= 2; k--) {
				System.out.print(k + " ");
			}
			
			// loop to create ascending numbers
			for (int l = 1; l <= i; l++) {
				System.out.print(l + " ");
			}
			
			System.out.println(); // causes it to have that pyramid shape 
		}
		
		input.close();
		

	}

}
