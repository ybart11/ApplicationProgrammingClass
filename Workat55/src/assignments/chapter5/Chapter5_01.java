package assignments.chapter5;
import java.util.Scanner;

// Assignment 5.1 (Count positive and negative numbers and compute the average of numbers)


public class Chapter5_01 {

	public static void main(String[] args) {
		// Get user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		
		// call variables
		int positives = 0;
		int negatives = 0;
		int sum = 0;
		
		if (number == 0) {
			System.out.println("No number are entered except 0");
			System.exit(1);
		}
		
		while (number != 0) {
			if (number > 0) {
				positives++;
			}
			else if (number < 0) {
				negatives++;
			}
			
			sum += number;
			
			// ask user to enter number again
			number = input.nextInt();
			
		}
		
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + sum /(float)(positives + negatives));
		
		input.close();
	}

}
