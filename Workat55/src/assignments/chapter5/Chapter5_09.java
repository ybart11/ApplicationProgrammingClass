package assignments.chapter5;
import java.util.Scanner;

public class Chapter5_09 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);

		// Get user's input 
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Holds student's score 
		int score, highest = 0, secondHigest = 0;			
		
		// Holds student's name
		String name, student1 = "", student2 = ""; 
				 
		
		// Prompt the user to enter each students' name and score
		System.out.println("Enter each students' name and score:");
		for (int i = 1; i <= numberOfStudents; i++) {
			System.out.print( "Student " + i + ":\n   Name: ");
			name = input.next();
			System.out.print("   Score: ");
			score = input.nextInt();

			if (i == 0) {
				// Make the first student the highest scoring student so far
				highest = score;
				student1 = name;
			}
			else if (i == 1 && score > highest) {
				// Second student entered scored
				// higher than first student
				secondHigest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			}
			else if (i == 1) {
				// Second student entered scored
				// lower than first student
				secondHigest = score;
				student2 = name;
			}		
			else if (i > 1 && score > highest && score > secondHigest) {
				// Last student entered has the highest score 
				secondHigest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if (i > 1 && score > secondHigest) {
				// Last student entered has the second highest score 
				student2 = name;
				secondHigest = score;
			}
		}

		// Display results
		System.out.println("Higest scoring student: " + student1 
				+ "\nSecond Higest scoring student: " + student2);
		input.close();
	}
	}



