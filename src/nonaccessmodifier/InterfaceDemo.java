package nonaccessmodifier;

public class InterfaceDemo {

	public static void main(String[] args) {

	}
}

//pure abstract class 
interface Laptop {

	void playSong();

	void start();

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