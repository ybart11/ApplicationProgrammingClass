package practice.CodingWithJohn;

public class Dog {
	
	private String name; 
	private int age; 
	
	
	public Dog () {
		this("Messi", 35);
		 
		
	}
	
	// Constructor where you can set the data fields
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge (int age) {
		this.age = age; 
	}
	
	public int getAge () {
		return age; 
	}
	
	public void setName (String name) {
		
		/** This means take the myDog object
		 * and set its name to be the value 
		 * of the name variable being passed in
		 */
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void bark() {
		System.out.println("Bark!");
	}

}
