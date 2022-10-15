package assignments.chapter6;
import java.util.Scanner;

// Exercise 6.17 (Display matrix of 0s and 1s

public class Chapter6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Get user's input 
		System.out.print("Enter n: ");
		int userN = input.nextInt();
		
		// Display results 
		printMatrix(userN);
		
		input.close();
	}
	
	public static void printMatrix(int n) {
		
		// Make two dimensional array
		int [][] list = new int [n][n];
		
		// loop that goes through each row and column 
		for (int i = 0; i < list.length; i++) { 
			for (int j = 0; j < list.length; j++) {
				list [i][j] = (int)(Math.random() * 2); // generate random number between 0 and 1
				System.out.print(list[i][j] + " ");  
			}
			System.out.println(); // Gives it the right shape
		}
	}

}
