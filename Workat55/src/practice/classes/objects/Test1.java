package practice.classes.objects;

public class Test1 {

	public static void main(String[] args) {
		
		CarFactory car1 = new CarFactory();	
		
		car1.getColor(); 
		//CarFactory car3 = getMeNewCar(car1); 
		


		
		

	}
	// my argument is an object type 
	public static String giveMeTheCarColor(CarFactory car) {
		
		car.setColor("blue"); // will have side affect
		return car.getColor();
	}
	
	public static CarFactory getMeNewCar (CarFactory car) {
		CarFactory car1 = new CarFactory();	
		car1.setColor(car.getColor()); // change color to what is passed
		return car1; 

	}

}
