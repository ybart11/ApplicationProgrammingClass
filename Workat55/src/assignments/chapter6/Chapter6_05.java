package assignments.chapter6;
import java.util.Scanner;

// Exercise 6.5 (Sort three numbers)


public class Chapter6_05 {

	public static void main(String[] args) {
		// Get user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		// Display results using method 
		displaySortedNumbers (n1, n2, n3);
		
		input.close();

	}
	
	public static void displaySortedNumbers ( // ex: 2 5 4  -> 2 4 5 
			double num1, double num2, double num3) {
	
		double temp; 
		if (num1 > num2 && num3 > num2) { // switch num1 and num2 
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		else if (num1 > num3) { // switch num1 and num3
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if (num2 > num3) { // switch num2 and num3
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.print(num1 + " " + num2 + " " + num3);
	}
	

}
