package exceptiond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeErrorDemo {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int a, b, c;

		try {
			//resource 
			//open 
			System.out.println("Enter two numbers ");
			a = scr.nextInt();
			b = scr.nextInt();
			c = a / b;// 20/0 -> throw new ArithmeticException();
			System.out.println(c);
			//close resource
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in second value");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only whole numbers");
		} catch (Exception e) {
			System.out.println("Something went wrong please try after sometime...");
		} finally {
			//close resource
			System.out.println("i am always execute....");
		}

		// finally block will execute all the time
		//gc 
	}
}
