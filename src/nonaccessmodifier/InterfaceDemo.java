package nonaccessmodifier;

public class InterfaceDemo {

	public static void main(String[] args) {

		System.out.println(Laptop.X);
	}
}

//pure abstract class 
interface Laptop {

	void playSong();

	void start();

	public static final int X = 90; // final-> you can't modify it
	// static -> single copy --> you can access it without object -- using class
	// name

	public abstract void shutdown();
}

class Dell implements Laptop {
	public void playSong() {

	}

	public void start() {

	}

	public void shutdown() {

	}
}