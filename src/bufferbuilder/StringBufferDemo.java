package bufferbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s = new String("royal");
		s.concat("education");
		System.out.println(s);// royal

		StringBuffer sb = new StringBuffer("royal"); // extra space-memory 
		sb.append("education");
		System.out.println(sb);// royaleducation
	
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());//0
		System.out.println(sb1.capacity());//16
	
		sb1.append("royaleducation");
		System.out.println(sb1);
		
		sb1.insert(5, " JAVA ");
		System.out.println(sb1);//
		
		sb1.delete(0, 5);//01234
		System.out.println(sb1);
		
		
	
	}
}




