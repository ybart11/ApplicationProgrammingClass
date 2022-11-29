package cis3270.assignments.Chapter13.Exercise01;

//		UML Class Diagram
/******************************************
* 
*		Geometric Object 
* 
* ----------------------------------------
* -side1: double
* -side2: double
* -side3: double
* ----------------------------------------
* +Triangle()
* +Triangle(side1: double, side2: double, side3: double)
* +getSide1(): double
* +getSide2(): double
* +getSide3(): double
* +getArea(): double
* +getPerimeter(): double
* +toString(): String 
* ****************************************
*/

public class Triangle extends GeometricObject {
	
	// Data fields
	private double side1;
	private double side2;
	private double side3;
	
	// no-arg constructor that creates default triangle
	Triangle () {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	// Constructor that specifies date fields
	Triangle (double side1, double side2, double side3) {
		this.side1 = side1; 
		this.side2 = side2; 
		this.side3 = side3;
	}
	
	// Accessor or getter methods for all three data fields
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	// Returns the area of this triangle
	public double getArea() {
		double s = (side1 + side2 + side3) / 2; 
		double area = Math.sqrt (s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	// Returns the perimeter of this triangle
	public double getPerimeter() {
		double p = side1 + side2 + side3;
		return p;
	}
	
	// Returns a string description of the triangle
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 
				+ " side3 = " + side3;
	}
	
	
	

}
