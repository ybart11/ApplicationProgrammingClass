package practice.mostlyArrays;

public class TwoDimenArray {
	public static void main(String [] args) { // how to print a two dimensional list
		
	int [][] list = new int [3][5]; // rows columns 
	
	for (int i = 0; i < list.length; i++) {
		
		for (int j = 0; j < list[i].length; j++) {
			list[i][j] = (int)(Math.random() * 21);
			System.out.print(list[i][j] + " ");
		}
		
		System.out.println();
	}
	
}
}	


