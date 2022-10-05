package cis3270.assignments;
// yer
import java.util.Scanner;

public class Yerrrrrr {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter six names: ");
		
		String name1 = input.next();
		String name2 = input.next();
		String name3 = input.next();
		String name4 = input.next();
		String name5 = input.next();
		String name6 = input.next();
		
		System.out.println();
		System.out.println("The six names you entered are: " + name1 + name2 + name3 + name4 +
				name5 + name6);
		
		input.close();
	}
}
