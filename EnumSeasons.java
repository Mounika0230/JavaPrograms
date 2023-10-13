package programs.edu;

import programs.edu.EnumMonths.Year;

public class EnumSeasons {
	public enum Year{
		WINTER,
		SUMMER,
		RAINY;
		
	}
	public static void main(String[] args) {
		Year season = Year.SUMMER;
		System.out.println(season);
	}

}
