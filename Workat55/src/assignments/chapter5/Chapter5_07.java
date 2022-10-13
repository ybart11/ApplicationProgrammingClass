package assignments.chapter5;

public class Chapter5_07 {

	public static void main(String[] args) {
		// set variables 
		double tuition = 10000;		// starting tuition 
		double increasePercentage = 0.05;		// 5% yearly increase in tuition
		double tuitionInTenYears = 0;
		double tuitionInFourYears = 0;
		
		// if statement to determine tuition in ten years and the four years after 
		for (int i = 1; i <= 14; i++) {
			tuition += tuition * increasePercentage;
			
			if (i == 10) {
				tuitionInTenYears += tuition;
			}
			
			if (i == 11 || i == 12 || i == 13 || i == 14) {
				tuitionInFourYears += tuition;
			}
		}

		// Display results 
		System.out.printf("The tuition in 10 years is $%,.2f", tuitionInTenYears);
		System.out.printf("\nThe total cost of 4 years after the 10th year is $%,.2f", tuitionInFourYears);

		
	}

}
