package bufferbuilder;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		// royal
		// education
		// royaleducation

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two string");
		String x = scr.next();// royal
		String y = scr.next();// education

		StringBuffer sb1 = new StringBuffer(x);
		StringBuffer sb2 = new StringBuffer(y);

		System.out.println(sb1.append(sb2));
	}
}
