package cis3270.assignments;
import java.util.Scanner;
// Assignment 3.5 (Find future dates)

public class Chapter3_05 {

	public static void main(String[] args) {
		// List of days 
		String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
						"Saturday"};
		
		// Ask user input 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter today's day: ");
		int todayDay = input.nextInt(); 
		
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		
		// Get future day 
		int futureDay = (todayDay + elapsedDays) % 7;
		
		// Display results 
		System.out.println("Today is " + days[todayDay] + " and the future day is " + days[futureDay]);
		
		input.close();
		
		
	
	}

}
