// yer


package cis3270.assignments;
import java.util.Scanner;
public class Testing123 {

	public static void main(String[] args) {
		// Testing to see how this will look in GitHub

		Scanner input = new Scanner (System.in);

		System.out.print("What is your favorite number? ");
		int favNum = input.nextInt();

		// display results
		System.out.println("Your favorite number is " + favNum);

		// close scanner
		input.close();
	}

}
