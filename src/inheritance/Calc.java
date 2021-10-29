package inheritance;

public class Calc {

	void add(int a, int b) {
		int c = a + b;
		System.out.println("addition = " + c);
	}
 //method over-loading 
	void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("addition = " + d);
	}
	
	void add(int a,int b,int c,int d) {
		int e = a+b+c+d;
		System.out.println("addition = "+e);
	}

	public static void main(String[] args) {

		Calc c = new Calc();
		c.add(20, 30);
		// now user wants to perform addition of three numbers?
		// is it possible ?
		c.add(10, 20, 30);
		//now user wants to perform addition of 4 numbers? ? ?? 
		c.add(10, 20,30,40);
	}
}
