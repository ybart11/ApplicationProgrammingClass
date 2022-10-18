package practice.mostlyArrays;
import java.util.Scanner;
import practice.Methods;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		int [] num = new int [5];
		int n;
		
		System.out.print("Enter integers: ");
		for (int i = 0; i < num.length; i++) {
			n = input.nextInt();
			if (n < 0) {
				break;
			}
			
			num [i] = n;
		}
		
		Methods.printIntArray(num); 
	}

}
