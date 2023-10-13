package programs.edu;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("hello");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.concat(s2));
		// TODO Auto-generated method stub

	}

}
