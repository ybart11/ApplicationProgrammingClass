package gsu.practice;
import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		// Needed to ask user's input
		Scanner input = new Scanner (System.in);

		// ask user for number
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		// ask user for name
		System.out.print("Enter a name: ");
		String name = input.next();

		for (int i = 0; i <num; i++) {
			System.out.println(name + " is the goat");
		}

		input.close();
	}

}
