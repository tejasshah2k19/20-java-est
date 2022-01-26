package exceptiond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeErrorDemo {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int a, b, c;

		try {

			System.out.println("Enter two numbers ");
			a = scr.nextInt();
			b = scr.nextInt();
			c = a / b;// 20/0 -> throw new ArithmeticException();
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in second value");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only whole numbers");
		} catch (Exception e) {
			System.out.println("Something went wrong please try after sometime...");
		}

	}
}
