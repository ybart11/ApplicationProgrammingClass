package practice.CodingWithJohn;

import java.util.HashMap;

// Collection of key value pairs like a lookup table

public class Maps {
	public static void main (String [] args) {
		
		// Key = String, Values = Integers
		HashMap <String, Integer> empIds = new HashMap <>();
		
		// Key = player's name, Value = player's jersey number 
		empIds.put("Messi", 30);
		empIds.put("Neymar", 10);
		empIds.put("Mbappe", 7);
		
		System.out.println(empIds);
		
		// What if this was Barcelona 2015?
		System.out.println("\nWhat if this was Barcelona 2015?");
		System.out.println();
		empIds.replace("Messi", 10);
		empIds.replace("Neymar", 11);
		
		System.out.println(empIds);
		
		System.out.println(empIds.get("Messi"));
		System.out.println(empIds.containsKey("Messi"));
		System.out.println(empIds.containsValue(10));
		
		
	}

}
