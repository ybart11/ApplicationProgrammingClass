package practice.classes.objects;

/** Note that the channel and volume level are not changed if the TV is not on. 
 * Before either of these change, its current value is checked to ensure that 
 * it is within the correct range. */

public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create object for first TV
		TV tv1 = new TV(); 
		
		// Check if Tv1 is on 
		System.out.println("Is TV1 on? ");
		
		if(tv1.on)
			System.out.println("Yes, tv1 is on.");
		else
			System.out.println("No, tv1 is off.");
		
		// Turn tv1 on, change channel & volume 
		// Default channel and volume is 1
		tv1.turnOn();	
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		// Create object for second TV
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp(); 
		tv2.volumeUp();
		
		System.out.println();
		
		// Display results
		System.out.println("tv1's channel is " + tv1.channel +
				" and volume level is " + tv1.volumeLevel);
		
		System.out.println("tv2's channel is " + tv2.channel +
				" and volume level is " + tv2.volumeLevel);
	}

}
