package practice.classes.objects;

class Circle {
	// The radius of this circle 
	
	double radius; // instance variable because it is dependent on a specific instance 
	
	static void header() {
		System.out.println("Chapter 9, Example 9.3 " +
						"\nStarting page 324, resume on page 326" +
						"\n------------------------"); 
	}
	
	
	// Construct a circle object 
	Circle() {
		radius = 1; 
	}

	// Construct a circle object with a specified radius 
	Circle (double newRadius) {
		radius = newRadius;
	}
	
	// Create method to return the area of this circle
	// Referred to as an instance method because you can invoke it only on a specific instance 
	// Non-static 
	double getArea () {
		return radius * radius * Math.PI;
	}
	
	// create method to return the perimeter/circumference of this circle
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	// Set new radius for this circle 
	void setRadius (double newRadius) {
		radius = newRadius;
	}
	
}