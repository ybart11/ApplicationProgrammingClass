package practice.classes.objects;

public class Circle {
	
	
	public double radius;
	public static int numberOfObjects; // static bc you want to share it 
	
	public Circle() {
		radius = 10;
	}
	
	public Circle (double r) {
		radius = r; 
	}
	
	public double getArea() {
		return radius * radius * 3.14;
		
	}
	
	public static void message () { // static meaning you can call this method without an object
		System.out.println("I am in Circle class");
	}
}
