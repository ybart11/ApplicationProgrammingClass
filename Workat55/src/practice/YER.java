package practice;
import java.util.Scanner;

public class YER {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("How long do you want your list to be? ");
		int n = input.nextInt();
	
		int [] list = new int [n];
		
		// add random numbers to list 
		for (int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 11);
		}
		
		System.out.print("Your randomized list: ");
		// Display list
		for (int num : list) {
			System.out.print(num + " ");
		}
		
		System.out.print("\nMax number: " + Methods.maxNum(list)); 
		input.close();
	}


	}


