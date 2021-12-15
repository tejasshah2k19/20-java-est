package nonaccessmodifier;
 
public class FinalDemo {

	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		f.start();// child version's

		String s = "royal";
		// Scanner

	}
}

//parent 
class Car {
	final int price=1020202; // fixed -- constant variable

	void start() {
//		price = 90;
		System.out.println("Car:start()");
	}
}

//ferrari
class Ferrari extends Car {

	// overriding --- method overriding
	void start() { // method's signature
		System.out.println("Ferrari:start()");
	}
}












//final class A{
//	
//}
//
//final class B extends A{
//	
//}





