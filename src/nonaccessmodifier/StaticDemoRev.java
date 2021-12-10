package nonaccessmodifier;

import java.util.Scanner;

public class StaticDemoRev {

	public static void main(String[] args) {

		Employee e1 = new Employee(); // firstName , salary
		e1.getData();
		Employee e2 = new Employee(); // firstName , salary
		e2.getData();
		Employee e3 = new Employee(); // firstName , salary
		e3.getData();

		System.out.println(" === e1 === ");
		e1.printData();
		System.out.println(" === e2 === ");
		e2.printData();
		System.out.println(" === e3 === ");
		e3.printData();

		e1.tax = 20;
		System.out.println(e1.tax);
		System.out.println(e2.tax);
		System.out.println(e3.tax);
		System.out.println(Employee.tax);
		Employee.changeTax(15);
	}
}

class Employee {

	String firstName;// instance variable
	int salary;
	static float tax = 10.0f; // 10% --only single copy will create in memory

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter firstname and salary");
		firstName = scr.next();
		salary = scr.nextInt();

	}

	void printData() {
		System.out.println(firstName);
		System.out.println(salary);
	}

	// static method can only access static property
	static void changeTax(float x) {
		tax = x;
	}

}
