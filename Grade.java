package controlflow;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("Grade A");
		}
		else{
			if(score <=89 && score >=60) {
				System.out.println("Grade B");	
			}
			else {
				if(score <=59 && score>=45) {
					System.out.println("Grade c");
				}
				else {
					if(score>=34) {
						System.out.println("Grade D");
					}
					else {
						System.out.println("Fail");
					}
				}
			}
			
		}
	}
	
}
