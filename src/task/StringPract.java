package task;

import java.util.Scanner;

public class StringPract {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter two string ");
		String s1 = scr.next();
		String s2 = scr.next();

		
		if(s1.contains(s2)) {
			System.out.println("substring");
		}else {
			System.out.println("no substring  ");
		}
		
//		if (s1.equalsIgnoreCase(s2)) {
//			System.out.println("Strings are same");
//		} else {
//			System.out.println("Strings are not same");
//		}

		
	}
}
