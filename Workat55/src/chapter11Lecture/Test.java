package chapter11Lecture;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("Hello");
		array.add("Messi");
		
		//array.add("Hello");
		//array.add("Bye");
		//System.out.println(array.size());
		//System.out.println(array.get(0));
		// String st = (String)array.get(0);
		
		String st = array.get(1);
		System.out.println(st);
		
		
	
	}

}
