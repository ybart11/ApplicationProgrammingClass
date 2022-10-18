package practice;

public class Methods {

	// return max number of list
	public static int maxNum (int [] list) {
		int maxNum = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > maxNum) {
				maxNum = list[i];
			}
			
		}
		return maxNum;	
	}
	
	// Use to test out functions
	public static void main(String[] args) {
		int [] list = {1,2,3,4,8};
		System.out.print(maxNum(list)); 
	}
	
	// Sum the digits in an integer
	public static int sum(int n) {				// Example: 121 = 4 
		int sum = 0;
		
		while (n != 0) {
			sum += n % 10; // adds the last digit
			n = n/10;	   // removes the last digit 
		}
		
		return sum;
	}


}
