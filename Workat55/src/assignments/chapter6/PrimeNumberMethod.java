package assignments.chapter6;

// Method needed to complete exercise 6.10
// Listing 6.7

public class PrimeNumberMethod {
	public static boolean isPrime (int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not prime
			}
		}
		
		return true; // prime number
	}
}


