package assignments.chapter5;
import java.util.Scanner;

// Assignment 5.41 (Occurrence of max numbers)

public class Chapter5_41 {

	public static void main(String[] args) {
		// Get user's input 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter number: ");
        
        // Set variables 
        int largest = 0;
        int occurrence = 0;
        int number;
        
        
       // do loop to find largest number 
        do {
            number = input.nextInt();
            if (number > largest) {
                occurrence = 0;
                largest = number;
            }
            if (number == largest) {
                occurrence++;
            }

        } while (number != 0); // program ends when user enter's 0
        
        
        // Display results
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count is " + occurrence);
        
        input.close();
	}

}
