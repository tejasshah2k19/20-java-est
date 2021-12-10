package nonaccessmodifier;

public class AbstractDemo {
	public static void main(String[] args) {
	}
}
abstract class RBI {
	abstract void wid();// no defination - only declaration
	abstract void dep();
	void roi() {
		System.out.println("RBI::roi()");
	}
}
class ICICI extends RBI {
	void wid() {
		System.out.println("wid()");
	}
	void dep() {
		System.out.println("dep()");
	}
}
abstract class Mcd{
	abstract void sBg();
	abstract void sFf();
}
class FofNY extends Mcd{
	void sBg() {
	}
	void sFf() {
	}
}














