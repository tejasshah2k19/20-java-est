package array;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i;
		Scanner scr = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			System.out.println("Enter number");
			a[i] = scr.nextInt(); // 0 1 2 3 4
			// 2 4 55 6 7
		}
		System.out.println("Array Elements");
		for (i = 0; i < 5; i++) {
			System.out.println(a[i]);// 0 1 2 3 4
		}
		int sum = 0;
		for (i = 0; i < 5; i++) {// 0 1 2 3 4
			sum = sum + a[i]; // sum => 61 | 61 + 6
		}
		System.out.println("Sum = > " + sum);
		int oddSum = 0, evenSum = 0;
		for (i = 0; i < 5; i++) {// 0 1 2 3 4
			if (a[i] % 2 == 0) {
				evenSum = evenSum + a[i];
			} else {
				oddSum = oddSum + a[i];
			}
		}
		System.out.println("odd sum = > "+oddSum);
		System.out.println("Even sum = > "+evenSum);
	}

}
