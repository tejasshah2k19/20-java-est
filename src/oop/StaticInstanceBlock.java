package oop;

public class StaticInstanceBlock {

	public static void main(String[] args) {

		Movie m = new Movie();
		m.display(); // what is the value of title releaseYear and language value here 

	}
}

class Movie {
	//from where below variables will get default values?? -- constructor  
	String title; // null 
	int releaseYear;// 0 
	static String language;//null

	
	
	//static block 
	static{
		
		language = "hindi";
		
	}
	
	//instance block 
	{
		title = "ABCD";
		releaseYear = 2021;
		
	}
	void display() {
		System.out.println(title);
		System.out.println(releaseYear);
		System.out.println(language);
	}
}
