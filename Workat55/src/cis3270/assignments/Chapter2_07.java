package cis3270.assignments;

// Assignment 2.7 (Find the numbers of years)

import java.util.Scanner;
public class Chapter2_07 {

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
