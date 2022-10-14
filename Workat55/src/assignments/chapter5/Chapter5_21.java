package assignments.chapter5;
import java.util.Scanner;

// Assignment 5.21 (Financial application: compare loans with various interest rates

public class Chapter5_21 {

	public static void main(String[] args) {
		// Get user's input
		Scanner input = new Scanner (System.in);
		System.out.print ("Loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of years: ");
		int numOfYears = input.nextInt();
		
		// header
		System.out.println("\nInterest Rate		Monthly Payment		Total Payment");
		// Loop to display table with interest rates
		for (double i = 5; i <= 8; i += 0.125) {
			System.out.printf("%.3f", i);
			System.out.print("%         		");
			
			double monthlyInterestRates = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRates / (1 - 1 / Math.pow(1 + monthlyInterestRates, numOfYears * 12));
			
			// Display results 
			System.out.printf("$%-19.2f", monthlyPayment);
			System.out.printf("	$%-8.2f\n",(monthlyPayment * 12) * numOfYears);

			
			
		}
		
		
		input.close();
			
		

	}

}
