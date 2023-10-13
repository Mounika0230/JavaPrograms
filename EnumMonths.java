package programs.edu;

public class EnumMonths {
	public enum Year{
		JAN,
		FEB,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPT,
		OCT,
		NOV,
		DEC;
		
	}
	public static void main(String[] args) {
		 Year month = Year.DEC;
		System.out.println(month);
	}

}
