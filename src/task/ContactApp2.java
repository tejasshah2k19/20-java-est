package task;

import java.util.*;

//class Contact 
//firstName
//contactNum
//country 
//email 
//
//create class and add data members.
//create method for input and print data.
//create 5 contacts. 
//
//create 1 method that is use to search contact by name;###  

public class ContactApp2 {

	String firstName, country, email, contactNum;

	void getData() {

		Scanner scr = new Scanner(System.in);
		System.out.println("enter name ");
		firstName = scr.next(); // scan string
		System.out.println("enter email and contact num");
		email = scr.next();
		contactNum = scr.next();
		System.out.println("enter country");
		country = scr.next();
	}

	void printData() {
		System.out.println("FirstName  : " + firstName);
		System.out.println("Email : " + email);
		System.out.println("Country : " + country);
		System.out.println("ContactNum : " + contactNum);
	}

	public static void main(String[] args) {
//			ContactApp2 c1 = new ContactApp2();
//			c1.getData();
//			c1.printData();
//			

		Scanner scr = new Scanner(System.in);
		ContactApp2 c[] = new ContactApp2[3];

		for (int i = 0; i < c.length; i++) {
			c[i] = new ContactApp2();// memory
			c[i].getData();
		}

		for (int i = 0; i < c.length; i++) {
			c[i].printData();
		}

		System.out.println("Enter name for search ? ");
		String searchName = scr.next();

		for (int i = 0; i < c.length; i++) {
			if (c[i].firstName.equals(searchName)) {
				System.out.println("Name Found");
				c[i].printData();
			}
		}

	}
}
