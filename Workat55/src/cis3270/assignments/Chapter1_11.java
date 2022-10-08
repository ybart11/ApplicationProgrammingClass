package cis3270.assignments;

// Assignment 1.11 (Population projection)

public class Chapter1_11 {

	public static void main(String[] args) {
		
		// Declare each variable
		int secInYears;
		int birth; 
		int death;
		int immigrant;
		int currentPopulation;
		int newPopulation;
		int i;
		
		// Current population given 
		currentPopulation = 312032486;
	
		// Convert year into seconds 
		secInYears = 60 * 60 * 24 * 365;
		
		// Births in one year if it happens every 7 seconds 
		birth = secInYears / 7;
		
		// Deaths in one year if it happens every 13 seconds 
		death = secInYears / 13;
		
		// New immigrants in one year if it happens every 45 seconds 
		immigrant = secInYears / 45; 
		
		// New population 
		newPopulation = birth + immigrant - death; 
		
		
		// integer to use for loop
		i = 1;
		
		while (i <= 5) {
			i++;
			// Result
			currentPopulation = currentPopulation + newPopulation;
			System.out.println("Population in year " + (i - 1) + " is " + currentPopulation); 
			
		}
		
	}

}
