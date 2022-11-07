package practice.classes.objects;

public class Student {
	
	String name; // name has the default value null 
	int age; // age has default value 0 
	String classification; 
	String major; 
	int studentID = 2542145;
	
	static void header() {
		
		System.out.println("What do you want to know aboout this student?");
		
		System.out.println("\nA. Name " +
						   "\nB. Classification " +
						   "\nC. Major" + 
						   "\nD. Student ID"); 
	}

}


