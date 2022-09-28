// how to get user's input to add to list 

package practice;
import java.util.Scanner;

public class UserInputToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.print("How long do you want your list? ");
		int count = input.nextInt();
		
		String [] goats = new String [count];
		
		for (int i = 0; i < goats.length; i++) {
			System.out.print("Enter a player who is considered a goat: ");
			goats [i] = input.next();
			
		
		}
		
		// display array
		
		for (String player : goats) {
			System.out.print(player + " ");
		}
		
		input.close();
		
		}

	}
