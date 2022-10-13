package assignments.chapter5;

public class Chapter5_18 {

	public static void main(String[] args) {
		// Program A
		System.out.println("Pattern A");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		
		
		
		// Program B
		
		for (int i = 6; i <= 1; i--) {
			for (int j = 6; j <= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
