package task;

import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		Contact c[] = new Contact[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = new Contact();
			c[i].getData();
		}

		for (int i = 0; i < c.length; i++) {
			c[i].printData();
		}

		System.out.println("Enter name for search contacnt");
		String name = scr.next();// sachin

		for (int i = 0; i < c.length; i++) {
			if (c[i].firstName.equals(name)) {
				c[i].printData();
			}
		}
	}
}

class Contact {
	String firstName, contactNum, country, email;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name and contact num");
		firstName = scr.next();
		contactNum = scr.next();
		System.out.println("Enter countryname and email");
		country = scr.next();
		email = scr.next();
	}

	void printData() {
		System.out.println(firstName);
		System.out.println(contactNum);
		System.out.println(contactNum);
		System.out.println(email);
	}

}
