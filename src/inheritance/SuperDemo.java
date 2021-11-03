package inheritance;
public class SuperDemo {
	public static void main(String[] args) {
		// voiceChat
		Iphone i = new Iphone();
//		i.voiceChat();
		//i.sms();//this will call sms method of Iphone class 
	//	i.start();
		//now call the sms() here from Mobile class 
		i.sms();//not work
		
	}
}
class Mobile {
	void sms() {
		System.out.println("Mobile::sms()");
	}
	void start() {
		System.out.println("Mobile::start()");
	}
}
class Iphone extends Mobile {
	void sms() {
	    super.sms();
		System.out.println("Iphone::sms()");
	}
	void voiceChat() {
		System.out.println("Iphone::voiceChat()");
	}
}