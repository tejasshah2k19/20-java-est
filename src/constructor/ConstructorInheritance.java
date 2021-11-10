package constructor;

public class ConstructorInheritance {

	public static void main(String[] args) {

		Legion l = new Legion(10);
	}

}

class Laptop {
	public Laptop() {
		System.out.println("Laptop()");
	}

	Laptop(int a) {
		this(); //current class --> () no arg 
		System.out.println("Laptop(int)");
	}
}

class Legion extends Laptop {
	Legion() {
		super(10);
		System.out.println("Legion()");
	}

	Legion(int a) {
		super(10); // to invoke parent's parameterized
		System.out.println("Legion(int)");
	}
}
