package chapter11Lecture;

public class Animal {
	
	private String name; // a property
	private String color; // a property
	
	
	
	public Animal () {
		
	}
	
	public Animal (String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void move() { // a behavior
		System.out.println("Moving...");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}