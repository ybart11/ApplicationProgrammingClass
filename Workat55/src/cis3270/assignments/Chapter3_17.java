package cis3270.assignments;
import java.util.Scanner;

// Assignment 3.17 (Game: scissor, rock, paper)

public class Chapter3_17 {

	public static void main(String[] args) {
		
		// array to store scissor-rock-paper
		String [] gameList = {"scissor", "rock", "paper"};
		
		// User's input
		Scanner input = new Scanner (System.in);
		System.out.print("scissor (0), rock (1), paper (2) : ");
		int userChoice = input.nextInt();
	
		
		// Random number between 0 and 2 
		int randNum = (int)(Math.random() * 2);
		
		// Use if statement to see who won the game
		if (userChoice == 0) {
			
			if (randNum == 0) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". It is a draw"); 
			}
			
			else if (randNum == 1) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". You lost");
			}
			
			else if (randNum == 2) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". You won");
			}	
			}
		
		else if (userChoice == 1) { 
			if (randNum == 0) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". You won"); 
			}
			
			else if (randNum == 1) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". It is a draw");
			}
			
			else if (randNum == 2) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". You lost");
			}
		}
		
		else if (userChoice == 2) {
			if (randNum == 0) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". You lost"); 
			}
			
			else if (randNum == 1) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". You won");
			}
			
			else if (randNum == 2) {
				System.out.print("The computer is " + gameList[randNum] + "." + " You are " + gameList[userChoice]
						+ ". It is a draw");
			}
			
		}
		
		input.close(); 
		
			
		}
		
	}


