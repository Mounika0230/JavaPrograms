package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
			int[] x = {1,2,3,4,5};
			//methods of arrays
			
			System.out.println("Length of Array:"+x.length);
			System.out.println(x.clone());
			System.out.println(x.equals(x));
			System.out.println(x.hashCode());
			System.out.println(x.toString());
			System.out.println(x.getClass());
			
			
			String[] s = {"a","aa","aaa"};
			System.out.println(s[0].length());
		// TODO Auto-generated method stub

	}

}
