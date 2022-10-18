package practice;
import java.util.Arrays;

public class FindKeyInArray {

	public static void main(String[] args) {
		int [] list = {4, 3, 7, 8, 9, 22};

		//System.out.println(Arrays.binarySearch(new int [] {1,3,5,7,9}, 23)); // will return -6 because it should be 
		System.out.println(Arrays.binarySearch(list, -10)); // will return -6 because it should be 

	}

}
