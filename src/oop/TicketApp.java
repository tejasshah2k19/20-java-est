package oop;

import java.util.Scanner;

public class TicketApp {

	public static void main(String[] args) {
		CustomerTicket ct = new CustomerTicket();
		int choice;
		Scanner scr = new Scanner(System.in);
		ct.signup();

		System.out.println("Signup Done Please select your tickets");

		while (true) {
			System.out.println(
					"Press\n1 For Diamond 300RS \n2 For Gold 250RS \n3 For Silver 200Rs\n4 For Exit\nEnter your chocie");
			choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("How many Diamond tickets you want?");
				ct.diamond = scr.nextInt();
				break;
			case 4:
				System.out.println("BILL");
				System.exit(0);
			}

		}
	}
}

class CustomerTicket {

	// store quantity of tickets taken by user
	int gold;
	int silver;
	int diamond;

	// store total amount for bill
	int totalAmount;

	// customer's mobile , booking
	int mobile;
	Scanner scr = new Scanner(System.in);

	void signup() {
		System.out.println("Enter mobile number");
		mobile = scr.nextInt();
	}
}
