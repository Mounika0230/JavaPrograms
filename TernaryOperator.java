package com.edu;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		int c = (a > b)? a:b;
		System.out.println(c);

	}

}
