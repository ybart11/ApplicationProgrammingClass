package practice;

public class BubbleSort {

	public static void main(String[] args) {
		// sorting using bubble method
	int [] list = {9, 8, 4, 2, 6, 3, 5, 1};
		
	for (int j = 0; j < list.length; j++) {
		

		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list [i + 1]) {
				int temp = list [i];
				list[i] = list [i + 1];
				list[i + 1] = temp;
			}
		}
	}		

		for (int i = 0; i < list.length; i++)  {
			System.out.print(list[i] + " ");
		}
	}

}
