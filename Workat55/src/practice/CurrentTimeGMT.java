package practice;

public class CurrentTimeGMT {

	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliSeconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan, 1, 1970
		long totalSeconds = totalMilliSeconds/1000;
		
		// Compute the current second in the minute in the hour 
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour 
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hour 
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour 
		long currentHour = (totalHours  % 24); // subtract by 4 to display current local time
		
		
		// Display results 
		System.out.println("The current time is " + currentHour + ":" 
		+ currentMinute + ":" + currentSecond + " GMT ");
	}

}
