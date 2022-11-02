package practice.classes.objects;
//import java.math.BigDecimal;

public class Course {
	private String name;
	private String [] students; // declaration
	private int numOfStudents;
	
	public Course(String name) {
		this.name = name;
		students = new String [50];
		
	}

	public String getName() {
		return name;
	}
	
	public void addStudent(String name) {
		students[numOfStudents++] = name; 
	}
	
	public void dropStudent(String name) {
	
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStudents() {
		return students;
	}

	public void setStudents(String[] students) {
		this.students = students;
	}

	public int getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	
	public static void main (String [] args) {
		//String st = "I like programming. And Java is great";
		
		//System.out.println(st.matches(".*")); // any number of characters 
		//System.out.println(st.matches(".*Java.*")); //yer
		
		StringBuilder str = new StringBuilder ("Hello"); 
		str.append(" Python"); 
		System.out.println(str.reverse()); // how to avoid creating garbage 
		
	}
}	
