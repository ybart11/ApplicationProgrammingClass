package assignments.chapter5;

// Assignment 5.24 (Sum a series)

public class Chapter5_24 {

	public static void main(String[] args) {
		// variable to store the sum
		double sum = 0;
		
		// loop to compute problem 
		for (int i = 1; i <= 97; i += 2) {
			sum += i / (i + 2.0);
		}
		
		// Display results 
		System.out.println("\nThe sum is " + sum);
		}

	}
