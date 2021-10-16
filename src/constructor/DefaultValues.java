package constructor;

public class DefaultValues {
	
	//UNICODE 
	
	//primitives 
	byte b;//integer type   1 byte = 8 bits  [-128 to 127 ]  
	short s;//integer type  2 byte [ -32768 to 32767 ] 
	char c;//character - single character [ 'Z' 'y' ] 
	int i;//integer type    4 byte [ 4^32 ]   
	long l;//integer type   8 byte [ 4^64 ] 
	float f;//real number   4 byte 
	double d;//real number  8 byte 
	boolean bb;//true | false 1 bit 

	void display() {
		System.out.println(b);//0
		System.out.println(s);//0
		System.out.println(c);// null char   '\u0000'   '\0'  
		System.out.println(i);//0
		System.out.println(l);//0
		System.out.println(f);//0.0
		System.out.println(d);//0.0
		System.out.println(bb);//false 
	}

	public static void main(String[] args) {
		DefaultValues obj = new DefaultValues();
		obj.display();
	}
}
