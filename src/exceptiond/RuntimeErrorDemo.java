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
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter 0");
		} catch (InputMismatchException e) {
			System.out.println("Please enter onyl whole numbers");
		}catch(NullPointerException e) {
			System.out.println("Plase restart your app");
		}
		catch (Exception e) {
			System.out.println("something went wrong please try after sometime...");
			// sendBugReportToDeveloper(e); //mail
		}
	}
}
