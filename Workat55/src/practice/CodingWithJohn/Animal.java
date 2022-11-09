package practice.CodingWithJohn;

public class Animal {
	
	// This animal class has two fields,  
	int age;
	String name;

	public Animal() {}
	
	// Create a constructor that take in the two field values and set them on the object that is  being created 
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("Hello, I am an animal.");
	}
	
	public void eat() {
		System.out.println("Munch munch");
	}
	
	public void doSomethingPrivate() {
		System.out.println("Hey this method is private");
	}
	
}


