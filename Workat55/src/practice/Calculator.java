package practice;

/**
 * To run code using the command prompt: 
 * 1. Click on run in eclipse menu
 * 2. Click on Run Configurations
 * 3. You will see program window. Select your program for which you are passing arguments.
 *    Then click on arguments tab. 
 * 4. Click on run button. Your program will execute
 *
 *
 */

public class Calculator {
	
	/** Main method */
	public static void main(String[] args) {
		// Check number of strings passed
		if (args.length != 3 ) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

	
	
	// The result of the operation 
	int result = 0;
	
	// Determine the operator
	switch (args[1].charAt(0)) {
	case '+': result = Integer.parseInt(args[0]) + 
			 		   Integer.parseInt(args[2]);
					   break;
	case '-': result = Integer.parseInt(args[0]) - 
	 		   Integer.parseInt(args[2]);
			   break;
					   
	case '.': result = Integer.parseInt(args[0]) * 
	 		   Integer.parseInt(args[2]);
			   break;			   
	case '/': result = Integer.parseInt(args[0]) / 
	 		   Integer.parseInt(args[2]);
			   // do not need to add break since it is the last case 				   			   
	}
	
	// Display result
	System.out.println(args[0] + " " + args[1] + " " + args[2]
		+ " = " + result);
	
	
	}
}
