package assignments.chapter6;

// Exercise 6.10 (Use the isPrime Method from PrimeNumberMethod.java 

public class Chapter6_10 {

	public static void main(String[] args) {
		int countPrimeNum = 0; // Counts the number of prime numbers
		for (int i = 0; i < 10000; i++) { 
			if (PrimeNumberMethod.isPrime(i)) { // call method
				countPrimeNum++; 
			}
		}
		
		// Display results
		System.out.println("The number of prime numbers less than 10000 is " + countPrimeNum);
				 
	}

}

