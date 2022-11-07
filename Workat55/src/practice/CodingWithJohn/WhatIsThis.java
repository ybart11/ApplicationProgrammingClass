package practice.CodingWithJohn;

public class WhatIsThis {

	public static void main(String[] args) {
		
	/** MAX **/
		// Create object for Max
		Dog myDog = new Dog(); 
		

		
		// Set Max's age
		myDog.setAge(2); 
		
		// Set Max's name
		myDog.setName("Maxy");
		
		// Display Max's results
		System.out.println("My dog is " + myDog.getAge() + " years old.");
		System.out.println("His name is " + myDog.getName()); 
		
	
	/** Cookie **/
		// Create object for Cookie 
		Dog myDog2 = new Dog("Cookie", 10);
		
		// Display Cookie's results
		System.out.println("\nMy other dog is " + myDog2.getAge() + " years old. " + 
							"\nHer name is " + myDog2.getName());
		
		System.out.println();
		
	/** Other **/
		
		Dog myDog3 = new Dog(); 
		// Display the constructor that has this() inside which is it's default values 
		System.out.println("Default dog's name is " + myDog3.getName());
		System.out.println("Default dog's age is " + myDog3.getAge());
		
	}

}
