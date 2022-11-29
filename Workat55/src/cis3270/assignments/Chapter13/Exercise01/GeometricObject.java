package cis3270.assignments.Chapter13.Exercise01;

// 		UML Class Diagram
/******************************************
* 
*		Geometric Object 
* 
* ----------------------------------------
* -color: String  
* -filled: boolean
* dateCreated: java.util.Date
* ----------------------------------------
* +GeometricObject()
* +GeometricObject(color: String, 
* 				filled: boolean)
* +getColor(): String
* +setColor(color: String): void
* +isFilled(): boolean
* +setFilled(filled: boolean): void
* +getDateCreated(): java.util.Date
* +toString(): String
* ****************************************
*/

public abstract class GeometricObject {
	
	// Data fields 
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Construct a default geometric object 
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	// Construct a geometric object with the specified color
	// 		and filled value
	public GeometricObject (String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color; 
		this.filled = filled; 

	}
	
	// Return color
	public String getColor() {
		return color; 
	}
	
	// Set new color
	public void setColor(String color) {
		this.color = color;
	}
	
	// Return filled. Since filled is boolean, 
	// its getter method is named isFilled
	public boolean isFilled() {
		return filled; 
	}
	
	// Set a new filled
	public void setFilled (boolean filled) {
		this.filled = filled;
	}
	
	// Get dateCreated
	public java.util.Date getDateCreated () {
		return dateCreated;
	}
	
	@Override 
	// Return a string representation of this object
	public String toString() {
		return "created on " + dateCreated + "\ncolor: "
				+ " and filled: " + filled; 
	}
	
	// Abstract method getArea 
	public abstract double getArea();
	
	// Abstract method getPerimeter 
	public abstract double getPerimeter();
	
	

}
