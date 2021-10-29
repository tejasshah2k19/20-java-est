package inheritance;

public class Car {
	void drive() {
		System.out.println("Car::Drive()");
	}
	public static void main(String[] args) {

		Mercedes m = new Mercedes();
		m.drive();
	}
}


//Mercedes ->child , Car -> parent 
class Mercedes extends Car {
	void drive() {
		System.out.println("Mercedes::Drive()");
	}
}
class MercedesBenzA extends Mercedes{
	//overriding 
	void drive() {
		System.out.println("MercedesBenzA::Drive()");
	}
}