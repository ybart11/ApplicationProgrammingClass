package practice;

// Reverse Array
public class YER {
	public static void main (String [] args) {
		
		
		int[] sourceArray = {2, 4, 1, 5, 10};
		int[] targetArray = reverse(sourceArray);
		
		for (int i = 0; i < sourceArray.length; i++) {
			System.out.print(targetArray[i] + " ");
		}
				
		
		}
		
		
	
	public static int [] reverse (int [] list) {
		int [] result = new int [list.length];
		
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result [j] = list [i];
		}
		
		return result;
	}

		
	}


