package packagedemo.subpac;
import packagedemo.A;
public class B {

	
	public static void main(String[] args) {

		A obja = new A();
		obja.mul();//yes-public 
		//obja.add();//no-default 
		//obja.sub();//no-protected
	}
}


//if we have a class in X package having protected , public and default method 
//if we have a class in Y package and it wants to create object of X package then first we need to import , import X.*; 
//Now we can create object of X package in Y but we can only access public method and public variables. 


