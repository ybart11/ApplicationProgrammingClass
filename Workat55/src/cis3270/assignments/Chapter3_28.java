package cis3270.assignments;
import java.util.Scanner;

// Assignment 3.28 (Geometry: two rectangles)

public class Chapter3_28 {

	public static void main(String[] args) {
		
		// Get user's input for first rectangle 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter r1's center x-, y-coordnantes, width and height: ");
		double x1 = input.nextDouble(); // x1
		double y1 = input.nextDouble(); // y1
		double w1 = input.nextDouble(); // w1
		double h1 = input.nextDouble(); // h1
		
		// Get user's input for second rectangle 
		System.out.print("Enter r2's center x-, y-coordnantes, width and height: ");
		double x2 = input.nextDouble(); // x2
		double y2 = input.nextDouble(); // y2
		double w2 = input.nextDouble(); // w2
		double h2 = input.nextDouble(); // h2 
		
		// if statement to determine whether second rectangle is inside the first or overlaps 
		// 
		if (x2 + (w2 / 2) <= x1 + (w1 /2) && x2 - (w2 /2) >= x1 - (w1 / 2) 
			&& y2 + (h2 /2) <= y1 + (h1 / 2) && y2 - (h2 / 2) >= y1 - (h1 / 2)) {
			
			System.out.print("r2 is inside r1");
			}
			
		else if (x1 + w1 / 2 > x2 - w2 || y1 + h1 / 2 > y2 - h2) {
			
			System.out.print("r2 overlaps r1");
		}
		else {
			
			System.out.print("r2 does not overlap r1");
			
		}
		input.close();
	}

}
 