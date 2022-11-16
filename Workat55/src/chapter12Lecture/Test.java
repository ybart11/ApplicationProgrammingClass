package chapter12Lecture;

public class Test {
	public static void checkFlightCapacity() throws FlightFullException {
		
		// run a query check the database if there is still empty seat
		throw new FlightFullException ("The flight is full");
	}
	
	public static void main (String[] args) { // you do not want to throw it in the main 
		

		try {
			
			checkFlightCapacity();
			
		} catch (FlightFullException ex) {
			System.out.println(ex);
		}
		System.out.println("End");
		
	}

}
