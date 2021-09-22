import java.util.Scanner;

public class CountUpperLower {

	public static void main(String[] args) {

		int upperCounter = 0;
		int lowerCounter = 0; 
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = scr.next(); // RoyalEducatioN
		//3 upper                // i
		//11 lower 
		
		
		for(int i=0;i<str.length();i++) {
			if (  str.charAt(i) >= 'A' && str.charAt(i) <='Z') {
				upperCounter++;
			}
			if (  str.charAt(i) >= 'a' && str.charAt(i) <='z') {
				lowerCounter++;
			}
		}
		System.out.println("total upper letters => "+upperCounter);
		System.out.println("total lower letters => "+lowerCounter);
	}
}
