package oop;

import java.util.Scanner;

import javafx.scene.transform.Scale;

/*
JB Restaurant app , 

customer signup before placing order. 
in signup customer provide , firstName and contactNum. 

In food menu , we have fix three items. 
Pizza  100RS 
Pasta  120RS 
Burger 110RS

Customer can select any item with quantity. 

our app will print final bill once order place. 

App must follow menu driven approach. 
e.g 

1 For Pizza  100RS
2 For Pasta  120RS
3 For Burger 110RS 
4 For Place Order 

class :-	Customer [ firstName , contactNum , pizzaQty , pastaQty , burgerQty , totalAmount  ]
*/

public class JbMenuApp {
	public static void main(String[] args) {
		Customer c = new Customer();
		int choice;
		Scanner scr = new Scanner(System.in);

		c.signup();

		while (true) {

			System.out.println(
					"1 For Pizza  100RS\n" + "2 For Pasta  120RS\n" + "3 For Burger 110RS\n" + "4 For Place Order ");
			System.out.println("Enter your choice");
			choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("How many Pizza You  want ? ");
				c.pizzaQty = scr.nextInt();
				break;
			case 2:
				System.out.println("How many Pasta You Want ?");
				c.pastaQty = scr.nextInt();
				break;
			case 3:
				System.out.println("How Many Burger You Want ?");
				c.burgerQty = scr.nextInt();
				break;
			case 4:
				c.totalAmount = (c.pizzaQty * 100) + (c.pastaQty * 120) + (c.burgerQty * 110);
				System.out.println("Total  => " + c.totalAmount);
				System.exit(0);
			}
		}
	}
}

class Customer {
	String firstName, contactNum;
	int pizzaQty, pastaQty, burgerQty, totalAmount;
	Scanner scr = new Scanner(System.in);

	Customer() {
		pizzaQty = 0;
		pastaQty = 0;
		burgerQty = 0;
		totalAmount = 0;
	}

	void signup() {

		System.out.println("Enter your FirstName and ContactNum");
		firstName = scr.next();
		contactNum = scr.next();
	}

}
