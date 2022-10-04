package cis3270.assignments;

// Assignment 2.8 (Current time)

import java.util.Scanner;

public class Chapter2_08 {

	public static void main(String[] args) {
		
		// Obtain user's input
		System.out.print("Enter the time zone offset to GMT: ");
		Scanner input = new Scanner (System.in);
		int userOffset = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliSeconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan, 1, 1970
		long totalSeconds = totalMilliSeconds/1000;
		
		// Compute the current second in the minute in the hour 
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour 
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hour 
		long totalHours = totalMinutes / 60;
		
		// Offset time 
		totalHours = totalHours + userOffset;
		
		// Compute the current hour 
		long currentHour = totalHours  % 24;
		
		input.close();

		
		// Display results 
		System.out.println("The current time is " + currentHour + ":" 
		+ currentMinute + ":" + currentSecond);
		
		
	}

}
