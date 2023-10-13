package programs.edu;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer ob = new StringBuffer("Method");
		ob.append(" new");
		System.out.println(ob);
		
		StringBuffer s1 = new StringBuffer("HELLO");
		System.out.println(s1.insert(4,"i"));
		
		StringBuffer s2 = new StringBuffer("HELLO");
		System.out.println(s2.replace(0,4,"i"));
		
		StringBuffer s3 = new StringBuffer("Shiva");
		System.out.println(s3.reverse());
		
		StringBuffer s4 = new StringBuffer("HELLO");
		System.out.println(s4.delete(2,4));
		System.out.println(s4.capacity());
		
		StringBuffer s5 = new StringBuffer("HELLO56");
		System.out.println(s5.toString());
		System.out.println(s5.length());
		
		
		
		

	}

}
