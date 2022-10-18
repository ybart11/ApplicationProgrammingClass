package practice.mostlyArrays;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		// obtain user to enter # of students 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of students: ");
		int [] scores = new int [input.nextInt()];
		
		char [] grades = new char [scores.length];
		
		// obtain user to enter student's scores 
		System.out.println("Enter " + scores.length + " scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores [i] = input.nextInt();
		}
		
		// get grades
		getGrades(scores, grades);
		
		// Display results
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " + 
								scores[i] + " and grade is " + grades[i]);
		}
		
		input.close();

		
	}
		
		
		// get highest grade to be used later
		public static int max (int [] array) {
			int max = array [0];
			
			for (int i = 1; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
				
			}
			
			return max;
		}
		
		// convert scores to grades based on highest grade
		public static void getGrades (int [] scores, char [] grades) {
			int best = max(scores);
			
			for(int i = 0; i < scores.length; i++) {
				if (scores[i] >= best - 10) {
					grades [i] = 'A';
				}
				else if (scores[i] >= best - 20) {
					grades [i] = 'B';
				}
				else if (scores[i] >= best - 30) {
					grades [i] = 'C';
				}
				else if (scores[i] >= best - 40) {
					grades [i] = 'D';
				}
				
				else { 
					grades [i] = 'F';
				}
			}
		}

}
