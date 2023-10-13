package TypeCasting;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		byte b = 123; 
		int c = b ;//implicit -- Lower to higher
		
		int num  = 1234567890;
		float d  = num ;
		
		short s = 1234;
		double d1 = s;

		
		System.out.println(d);
		System.out.println(c);
		System.out.println(d1);

	}

}
