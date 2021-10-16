package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		Empl e = new Empl(); // instance of Empl --> constructor 
		Empl e2 = new Empl();//age->25  salary->10000 
		Empl e3 = new Empl();//age->25  salary->10000 
		Empl e4 = new Empl(30,200000);//age->30  salary->200000 
		e.display();
		e2.display();
		e3.display();
		e4.display();
		
	}
}

class Empl {

	int age;
	int salary;

	//constructor 
	Empl(){ // no argument  - default  
		System.out.println("Empl()");
		age = 25;
		salary = 10000;
	}

	Empl(int a,int s){
		System.out.println("Empl(int,int)");
		age =a;
		salary=s;
	}
	void display() {
		System.out.println(age + "  " + salary);
	}
}
