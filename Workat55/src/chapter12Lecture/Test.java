package chapter12Lecture;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			int[] a = new int [4];
			System.out.println(a[100]);
			
			System.out.println(3/0);
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("I caught the stone");
		} catch (ArithmeticException ex) {
			System.out.println("I caught the stone");

		} catch (Exception ex) {
			System.out.println("I caught the stone");
		}

		System.out.println("End");
	}

}
