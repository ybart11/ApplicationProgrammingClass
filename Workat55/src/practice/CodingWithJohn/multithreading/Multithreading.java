package practice.CodingWithJohn.multithreading;

public class Multithreading {
	
	public static void main (String [] args) {
		
		/* How to start a multithread if you extend the Thread class */
		
//		MultithreadThing myThing = new MultithreadThing();
//		MultithreadThing myThing2 = new MultithreadThing();
//
//		
//		myThing.start();   
//		myThing2.start();
		
		// Create and start five threads 
		for (int i = 0; i < 5; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			myThing.start();

		}
		
		//  throw new RuntimeException();
		
		
		
		/* How to start a multithread if you implement the Runnable interface */
		
		
	}
		
}
