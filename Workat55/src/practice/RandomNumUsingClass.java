package practice;
import java.util.Random;
public class RandomNumUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random ();
		
		// generate random number between 0 and 4 using the class Random
		System.out.println( 1 + rand.nextInt(5));

	}

}
