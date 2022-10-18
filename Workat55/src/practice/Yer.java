package practice;

import java.util.Scanner;


public class Yer {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		String n = input.next();
		
		// convert string to int
		int num = Integer.parseInt(n);
		
		// add converted int to int 5
		
		int sum = num + 5;
		
		System.out.println(sum);
		
		input.close();
		
	}
}