package cis3270.assignments;
import java.util.Scanner;

// Assignment 3.17 (Game: scissor, rock, paper)

public class Chapter3_17 {

	public static void main(String[] args) {
		
		String [] gameList = {"scissor", "rock", "paper"};
		
		// User's input
		Scanner input = new Scanner (System.in);
		System.out.print("scissor (0), rock (1), paper (2) : ");
		int userChoice = input.nextInt();
	
		
		// Random number between 0 and 2 
		int randNum = (int)(Math.random() * 2);
		
		// Using if to see who won the game
		if (userChoice == 0 )
		
		// Display results
		System.out.print("Random number: " + randNum);
		System.out.print("\nThe computer is " + gameList[randNum]);
		System.out.print("\nYou are " + gameList[userChoice]);
		

	}

}
