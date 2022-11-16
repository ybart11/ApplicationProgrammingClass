package chapter11Lecture;

public class Cat extends Animal { // known as inheritance 
								  // Animal is super class or parent class
								  // Cat is sub class or child class 
/* Notes:
 * 	- JAVA does not do multiple inheritance 
 *        -Example: inheriting from two parents 
 * 
 * 
 */
	
	
	public Cat(String color, String name) {
		//super(); // call the constructor of the parent class with no argument 
				 // super() with no argument is always there by default; always the constructor of parent gets called 
		
		//super("YER", "YER"); // if constructor without arguments doesn't exist 
		
		super(color, name);
	}
	
	public Cat() {
		// super(); // if you write your own super, you do not have the default anymore 
	
		
	}
	private boolean hasStripes;

	public boolean isHasStripes() {
		
		
		//String s = super.getColor(); // searches the parent class 
		// String s = getColor(); // means the method in the same class if it exists or else it goes to the parent class ß
		return hasStripes;
	}

	public void setHasStripes(boolean hasStripes) {
		this.hasStripes = hasStripes;
	}

	@Override
	public void sound() {
	
		
	}

	
	
	
}
