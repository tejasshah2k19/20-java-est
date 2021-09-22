
public class StringMethods {

	public static void main(String[] args) {
		// 01234
		String s = "royal";// index starts with 0

		// find the total characters in a string?
		System.out.println(s.length());// 5

		// to convert string into uppercase?
		System.out.println(s.toUpperCase());

		// search where is 'a' located in a string ?
		// find the index of character 'a' in a string?
		System.out.println(s.indexOf('a'));// 3
		System.out.println(s.indexOf('z'));// -1

		// 012345678901234
		s = "royal education";
		System.out.println(s.indexOf('a'));// search from beginning
		// find out the index of last 'a'
		System.out.println(s.lastIndexOf('a'));// search from end
		// 01234567890123
		s = "jony jony jony";
		System.out.println(s.lastIndexOf('j'));// 10

		s = "jony jony yes papa";
		// how to print individual words from above string.
		System.out.println("all words :- ");
		String x[] = s.split(" ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		s = "1,2,3,4,5";
		System.out.println("all words :- ");
		String y[] = s.split(",");
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}

		s = "royal royal royal";
		s = s.replace('r', 'g');
		System.out.println(s);

		
		s = "    royal education   ";
		System.out.println(s);
		System.out.println(s.trim());
		
		// 01234567890
		s="java is programming language";
		//find out the character on 3rd index 
		System.out.println(s.charAt(3));
		
		
	}
}
