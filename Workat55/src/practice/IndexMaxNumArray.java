package practice;

public class IndexMaxNumArray {

	public static void main(String[] args) {
		// How to get index number of the max number of an array
		
		int [] numbers = {1, 5, 3, 8, 2, 8, 4, 3};
		int max = numbers[0];
		int maxIndex = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max) {
				max = numbers [i];
				maxIndex = i;
			}
		}
		
		System.out.println(maxIndex);
	}

}
