package programs.edu;

public class EnumDay {
//	static enum Day{
	public enum Day{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY;
		
	}
	public static void main(String[] args) {
		Day today = Day.SUNDAY;
		System.out.println(today);
	}
		// TODO Auto-generated method stub


}
