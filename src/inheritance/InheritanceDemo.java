package inheritance;
//single level inheritance 
public class InheritanceDemo {
	public static void main(String[] args) {
		SciCalc sc = new SciCalc();
		// sc =>
		sc.sin();
		sc.cos();
		sc.add();
		sc.sub();
//		BasicCalc bs = new BasicCalc();
//		bs.add();
//		bs.sub();
	}
}
class BasicCalc {
	void add() {
		System.out.println("BasicCalc::add()");
	}
	void sub() {
		System.out.println("BasicCalc::sub()");
	}
}
class SciCalc extends BasicCalc{
	void sin() {
		System.out.println("SciCalc::sin()");
	}

	void cos() {
		System.out.println("SciCalc::cos()");
	}
}
