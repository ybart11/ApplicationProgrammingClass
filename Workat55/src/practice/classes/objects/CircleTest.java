package practice.classes.objects;

// test classes

public class CircleTest {
	/** Create circle with main method */
	public static void main(String[] args) {
		
		// Display header
		Circle.header();
		
		// Create a circle with a radius 1
		Circle c1 = new Circle(); 
		System.out.println("The area of the circle of radius " 
				+ c1.radius + " is " + c1.getArea());
		
		// Create a circle with radius 25
		Circle c2 = new Circle(25);
		System.out.println("The area of the circle of radius " 
				+ c2.radius + " is " + c2.getArea());
		
		// Create a circle with radius 125
		Circle c3 = new Circle(125);
		System.out.println("The area of the circle of radius " 
				+ c3.radius + " is " + c3.getArea());

		// Modify circle radius 
		c2.radius = 100;
		System.out.println("The area of the circle of radius " 
				+ c2.radius + " is " + c2.getArea());
		

		

		//Circle.message(); // called using class name, not object (static)

		

	}

}
