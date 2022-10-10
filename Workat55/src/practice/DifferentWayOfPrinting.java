package practice;

public class DifferentWayOfPrinting {

	public static void main(String[] args) {
		// how to print using "printf" 
		// %s is for string 
		// %d is for integers
		// %f is for floats, doubles 
		
		String name = "Yovany";
		int age = 20;
		double balance = 450.25;
		
		System.out.printf("Your name is %s!", name);
		System.out.printf("\nYou are %d years old!", age);
		
		// This could be another way to round numbers
		System.out.printf("\nYou have $%.2f in your bank account.", balance); 
		
		System.out.println("\n----------------------------------------");
		
		// All in one line
		System.out.printf("Hi %s, you are %d years old and you have $%.2f in your bank account.",
				name, age, balance);
		
		

	}

}
