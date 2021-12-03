package nonaccessmodifier;

public class StaticDemo {

	public static void main(String[] args) {
		// ??how to call add() in main method?
		// create object of Calc and call add method
		// if you want to access property of a class [variable,method] , you need to
		// create instnace of a
		// class

		Calc c = new Calc();// a
		Calc d = new Calc();// a

		c.add();
		d.add();
		Calc.sub(); // static method can access using class name , no need to create object

		c.a = 120;
		d.a = 90;

		System.out.println(c.a); // 120
		System.out.println(d.a); // 90

		c.x = 900;
		d.x = 500;

		System.out.println(c.x);// 500
		System.out.println(d.x);// 500

		// we can access static property using class name
		System.out.println(Calc.x);// 500
	}
}

class Calc {

	// instance
	// non-static
	int a;// every object will get independant copy of instance variable .
			// instance variable allocates memory whenever we create object
			// so if we create 500 objects of class Calc , variable a will create 500 times
			// in
			// memory.
	// each object will have variable a
	static int x = 234;// static variable-- now, only 1 copy will create in memory
						// so if we create 500 objects of class Calc , variable x will create only 1
						// time in memory

	void add() {
		System.out.println("Calc::add()");
	}

	static void sub() {
		System.out.println("Calc::sub()");
		System.out.println(x);// valid
		// System.out.println(a); // invalid
	}

}
