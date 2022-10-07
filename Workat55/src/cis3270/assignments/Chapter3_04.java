package cis3270.assignments;

// Assignment 3.4 (Random month)
public class Chapter3_04 {

	public static void main(String[] args) {
		
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"};
		
		// random number between 1 and 12
		int randomNum = 1 + (int)(Math.random() * 12);
		System.out.print(randomNum);
		System.out.println();

		
		// Display results
		System.out.print(months[randomNum - 1]);
		}
		
		

	}
	

		
		

