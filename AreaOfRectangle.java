package programs.edu;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		float a = sc.nextFloat();
		System.out.println("Enter a number:");
		float b = sc.nextFloat();
		System.out.println("Enter c number:");
		float c = sc.nextFloat();
		double area = (double)(a*b*c);
		System.out.println(area);
		// TODO Auto-generated method stub

	}

}
