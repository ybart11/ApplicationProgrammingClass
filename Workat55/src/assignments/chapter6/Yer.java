package assignments.chapter6;


public class Yer {
	public static void main(String[] args) {
		int numberOfPrimes = 0;	// Counts the number of prime numbers

		// Find the number of prime numbers less than 10000
		for (int i = 1; i < 10000; i++) {
			if (PrimeNumberMethod.isPrime(i))
				numberOfPrimes++;
		}

		// Display result
		System.out.println(
			"The number of prime numbers less than 10000: " + numberOfPrimes);
	}
}


