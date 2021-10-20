package inheritance;

public class MultilevelInh {

	public static void main(String[] args) {
//		B objB = new B();
//		objB.sub(); 	
//		objB.add();

		C objC = new C();
		objC.add();
		objC.sub();
		objC.div();
	}
}

class A { //add() 
	void add() {
		System.out.println("A::add()");
	}
}

class B extends A { //add() sub()
	void sub() {
		System.out.println("B::sub()");
	}
}

class C extends B { // add()  sub()  div() 
	void div() {
		System.out.println("C::div()");
	}
}