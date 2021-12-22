package nonaccessmodifier;

public class AbstractRev {

	public static void main(String[] args) {
		
	}
	
}


abstract class Santa{
	
	void add() {
		System.out.println("add()");
	}
	
	abstract void sub();//no defination 
}

class Banta extends Santa{
	void sub () {
		System.out.println("sub()");
	}
}
