package practice.classes.objects;

// working with classes



public class CarFactory { // java makes a method named after the class by default 
	

	public String color;
	public double weight;
	
	public CarFactory() {
		color = "Black";
		weight = 3000; 
	}
	
	public CarFactory(String c) {
		color = c;
		weight = 4000; 
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
	
	
	
	

}

		
		
		

		
	
	
