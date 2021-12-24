package task;

import java.util.Scanner;

public class FoodTask {

	public static void main(String[] args) {

		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();

		f1.getData();
		f2.getData();
		f3.getData();

		f1.printData();
		f2.printData();
		f3.printData();

		// Array of Objects

		Food f[] = new Food[3];// 3 food objects ---

		for (int i = 0; i < f.length; i++) {
			f[i] = new Food();
			f[i].getData();
		}
		for (int i = 0; i < f.length; i++) {
			f[i].printData();
		}

	}
}

//class Food 
//name 
//taste 
//origin
//price
//
//
//create above class with given data members.
//create method for input and print data. 
//create 3 food items and display all at once. 
class Food {
	String name, taste, origin;
	int price;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Name and Taste of Food");
		name = scr.next();
		taste = scr.next();
		System.out.println("Enter Origin and Price of Food");
		origin = scr.next();
		price = scr.nextInt();
	}

	void printData() {
		System.out.println("Name : " + name);
		System.out.println("Taste : " + taste);
		System.out.println("Origin : " + origin);
		System.out.println("Price : " + price);
	}
}