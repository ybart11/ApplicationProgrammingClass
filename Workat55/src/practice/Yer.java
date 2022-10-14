package practice;
import java.util.Scanner;


public class Yer {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int largest = 0;
        int occurrence = 0;
        int number;

        System.out.print("Enter number: ");
        do {
            number = input.nextInt();
            if (number > largest) {
                occurrence = 0;
                largest = number;
            }
            if (number == largest) {
                occurrence++;
            }

        } while (number != 0);

        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count is " + occurrence);

        input.close();
	}

}
