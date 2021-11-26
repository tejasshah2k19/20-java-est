package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// linear search

		int search, i, isFound = 0; // isFound is zero -> search num is not present in an array
		int a[] = new int[5]; // 1D array with size 5
		Scanner scr = new Scanner(System.in);

		// 0 1 2 3 4
		for (i = 0; i < a.length; i++) {
			System.out.println("Enter value");
			a[i] = scr.nextInt(); // a[0] a[1] a[2] a[3] a[4]
		}

		System.out.println("Enter number for Search");
		search = scr.nextInt();

		for (i = 0; i < a.length; i++) {
			if (a[i] == search) { // a[0] a[1] a[2] a[3] a[4] 
				isFound = 1;// number is present
			}
		}

		if (isFound == 1) {
			System.out.println(search + " found");
		} else {
			System.out.println(search + " not found");
		}

	}
}
