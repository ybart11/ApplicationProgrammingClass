package practice.mostlyArrays;
import java.util.Scanner;

// reverse the order of the integers in an array 

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] nums = new int [10];
		
		
		
		System.out.print("Enter ten integers: ");
		fill(nums);
		
		// Display integers in reverse order
		
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		
		input.close();

		
	}
	
	public static void fill (int [] array) {
		
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < array.length; i++) {
			array [i] = input.nextInt();
		}
		
		input.close();
	}

}
