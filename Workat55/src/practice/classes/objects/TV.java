package practice.classes.objects;

/** Consider television sets. Each TV is an object with states (current channel,
 * current volume level, power on or off) and behaviors (change channels, 
 * adjusts volume, turn on/off). You can use a class to model TV sets. */



public class TV {
	int channel = 1; 
	int volumeLevel = 1; 
	
	boolean on = false; // In other words, the TV is off
	
	// Create constructor 
	
	public TV () {
		
	}
	
	public void turnOn() { // void means it doesn't return anything 
		on = true; 
	}
	
	public void turnOff() {
		on = false;
	}

	public void setChannel (int newChannel) {
		
		// boolean to see if TV is on and the channel is between 1 and 120 
		if (on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	public void setVolume (int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	// Increment channel if TV is one and not on channel 120 
	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}
	// Lower channel if TV is on and channel is not 1 
	public void channelDown () {
		if (on && channel > 1) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}
	
	
	
	
	
	
	
	

}
