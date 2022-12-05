package practice.BroCode;
import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		// ArrayLisst = a resizable array.
		//				Elements can be added and removed after compliation phase 
		//				store refernce data types 
		
		ArrayList <String> food = new ArrayList<String>();
		
		// How to add to array list
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		food.remove(2);
		food.clear();
		
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
