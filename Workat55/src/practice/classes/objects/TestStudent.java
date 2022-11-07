package practice.classes.objects;
import java.util.Scanner; 

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(); 
		s1.name = "Yovany"; 
		s1.classification = "Junior";
		s1.major = "CIS"; 
		
		
		
		Student.header();
		
		// Obtain user's input
		Scanner input = new Scanner (System.in);
		System.out.print("Answer: ");
		String userChoice = input.next();
		char ans = userChoice.charAt(0);
		
		
		// Boolean to display results
		if (Character.toUpperCase(ans) == 'A')
			System.out.println(s1.name);
		else if (Character.toUpperCase(ans) == 'B')
			System.out.println(s1.classification);
		else if (Character.toUpperCase(ans) == 'C')
			System.out.println(s1.major);
		else if (Character.toUpperCase(ans) == 'D')
			System.out.printf("00%d", s1.studentID);
		else
			System.out.println("Invalid option");
		
		input.close(); 
		
		
		
		
		
		
		
		

	}

}
