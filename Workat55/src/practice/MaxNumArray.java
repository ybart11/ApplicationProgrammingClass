package practice;

public class MaxNumArray {

	public static void main(String[] args) {
		// getting the max number from a list 

		int [] numbers = {3, 4, 5, 7, 9, 2}; 
		int max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\nThe max number number of this array is " + max);
	}

}
