package practice.CodingWithJohn;

public class Cat extends Animal {
	
	String catFoodPreference;
	
	public Cat (int age, String name, String catFoodPreference) {
		
		// have to use it in a sub class constructor 
		// and must be the first statement in the constructor 
		super(age, name);
		this.catFoodPreference = catFoodPreference; 
	}
	
	@Override 
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Meow meow meow!"); 
		
		super.doSomethingPrivate(); // if method is private, the animal class so won't work 
		eat();
	}

}
