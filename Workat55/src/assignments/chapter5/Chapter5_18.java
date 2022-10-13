package assignments.chapter5;

public class Chapter5_18 {

	public static void main(String[] args) {
//		// Program A
		System.out.println("Pattern A");
		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		
		
		
		// Program B
		System.out.println("Pattern B");
		for (int r = 6; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		
		// Program C
		System.out.println("Pattern C");
		int numLines = 6;
		for (int r = 1; r <= numLines; r++) {
			for (int s = numLines - r; s >= 1; s--) {
				System.out.print("  "); // gives it the right shape
			}
			
			for (int c = r; c >= 1; c--) {
				System.out.print(c + " "); // displays the integers in the right order
			}
			System.out.println();
		}
		
		
		// Program D
		System.out.println("\nPattern D");
		for (int r = 0; r < 6; r++) {
			for (int s = 0; s < r; s++) {
				System.out.print("  "); // gives it the right shape 
			}
			
			for (int c = 0; c < 6 - r; c++) {
				System.out.print((c + 1) + " "); // displays the integers in the right order
			}
			
			System.out.println();

		}

		
	}

}
