package gsu.CIS3270.homework;

// Assignment 2.7

import java.util.Scanner;
public class NumberOfYears {

	public static void main(String[] args) {
		int years;
		int days;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of minutes: ");
		int userMin = input.nextInt();
		
		years = userMin / 60 / 24 / 365;
		days = userMin / 60 / 24 % 365;
		
		System.out.println(userMin + " minutes is approximatelty " + years + " year(s) and " + days + " day(s).");
		
		input.close();
	}

}