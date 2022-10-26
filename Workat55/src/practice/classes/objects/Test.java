package practice.classes.objects;

// test classes

public class Test {

	public static void main(String[] args) {
		// created object "car1"
		CarFactory car1 = new CarFactory("Red", 2000);
		
		// attributes 
		//System.out.println(car1.color);
		System.out.println(car1.weight);
		car1.weight = 2000;
		//car1.color = "Red";
		
		car1.start();
		car1.stop();
		
		System.out.println();
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		c1 = c2;
		System.out.println(c1.getArea()); // non-static because uses an object to call getArea()
		System.out.println(c2.getArea());
		Circle.message(); // called using class name, not object (static)

		

	}

}
