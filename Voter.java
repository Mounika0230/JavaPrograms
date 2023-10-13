package controlflow;

import java.util.Scanner;
public class Voter {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int age = sc.nextInt();
			if(age >= 18) {
				System.out.println("Eligible to Vote");
			}
			else {
				System.out.println("Not Eligible to Vote");
			}
			// TODO Auto-generated method stub
			

			
		}
}
