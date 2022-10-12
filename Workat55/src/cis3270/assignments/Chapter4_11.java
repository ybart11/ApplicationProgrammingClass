package cis3270.assignments;
import java.util.Scanner;

//Assignment 4.11 (Decimal to hex)

public class Chapter4_11 {

	public static void main(String[] args) {
		
		// Ask for user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int userNum = input.nextInt();
		
		
		// if statement to see if user's number is between 0 and 9, 10 and 15
		// if true, display hex number 
		if (userNum >= 0 && userNum <= 9) {
			System.out.print("The hex value is " + userNum);
		}
		
		else if (userNum >= 10 && userNum <= 15) {
			System.out.println("The hex value is " + (char)(userNum + 'A' - 10));
		}
		else {
			System.out.print(userNum + " is an invalid input");
		}
		
		input.close();
		
		System.out.print((int)'A');
	
	}
	

}
