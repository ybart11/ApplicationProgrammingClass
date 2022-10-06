package practice;

public class RandomizeCurrentArray {

	public static void main(String[] args) {
		// randomly changes the position of the values in the array
		
		int [] numbers = {2, 7, 5, 4, 3};
		
		for (int i = 0; i < numbers.length; i++) {
			int randIndex = (int) (Math.random() * numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[randIndex];
			numbers[randIndex] = temp;
			
		}
		
		System.out.println("--------------------------------");
		
		for (int i = 0; i < numbers.length; i++ ) {
			System.out.print(numbers[i] + " ");
		}
		

	}

}
