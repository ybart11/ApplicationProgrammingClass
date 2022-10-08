package cis3270.assignments;

// Assignment 3.24 (Game: pick a card)

public class Chapter3_24 {

	public static void main(String[] args) {
		
		
		// array for ranks 
		String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King"};
		
		// array for suits
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

		// random integer between 1 and 13 for ranks
		int rankNum = 1 + (int)(Math.random() * 13);
	
		
		// random integer between 1-4 
		int suitNum = 1 + (int)(Math.random() * 4);
		
		// Display card picked from deck 
		System.out.print("The card you picked is " + ranks[rankNum - 1] + " of " + suits[suitNum - 1]);

		

}
}
