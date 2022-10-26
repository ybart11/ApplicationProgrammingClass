package practice.classes.objects;

// working with classes



public class CarFactory { // java makes a method named after the class by default 
	

	private String color; // instance variable, the scope is the whole class 
	public double weight; // instance variable, the scope is the whole class 
	
	public CarFactory() {
		//this.color = "Black";
		//weight = 3000; 
		
		this("Black", 3000); // a method 
	}
	
	public CarFactory(String color) {
		
		//this.color = color; 
		//weight = 4000; 
		this(color,4000); // same thing as the top 
	}
	
	public CarFactory(String c, double w) {
		color = c;
		weight = w; 
	}
	
	
	
	public void start() {
		System.out.print("Car is starting...");
	}
	
	public void stop() {
		System.out.println("Car is stopping...");
	}
	
	// getters
	// for private 
	public String getColor() { // get color to the user
		
		return this.color; // this means any reference that is trying to access this property when you create the object 
	}
	
	
	// setters 
	// for private
	public void setColor(String c) { // change the color the safe way. You protect the internal stuff of your class 
		color = c;
	}
	
	
	
	

}

		
		
		

		
	
	
