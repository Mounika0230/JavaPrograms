package controlflow;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();
		System.out.println("Enter a number: ");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest Number:"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest Number:"+b);	
		}
		else {
			System.out.println("Largest Number:"+c);
		}
		
		// TODO Auto-generated method stub

	}

}
