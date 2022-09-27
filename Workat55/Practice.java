package gsu.work.fun;

// if file is from different package, import it  
import gsu.teammates.work.MyMethods55;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	
		// display header
		MyMethods55.header();
		
		// needed to get user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Answer: ");
		int userChoice = input.nextInt();
		
		// if statement to take action based on user's choice 
		if (userChoice == 1) {
			
			System.out.print("Enter your first number: ");
			int a = input.nextInt();
			
			System.out.print("Enter your second number: ");
			int b = input.nextInt();
			// twoSum() method goes here
			System.out.println("The sum is " + MyMethods55.twoSum(a, b));
		}
		
		else if (userChoice == 2) {
			// twoDif() method goes here
			System.out.print("Enter your first number: ");
			int a = input.nextInt();
			
			System.out.print("Enter your second number: ");
			int b = input.nextInt();
			System.out.println(MyMethods55.twoDif(a, b));
		}
		
		input.close();
	}
	
}
