package controlflow;

import java.util.Scanner;
public class SwitchDemo1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your letter grade: ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Your grade is Excellent");
                break;
            case 'B':
                System.out.println("Your grade is Good");
                break;
            case 'C':
                System.out.println("Your grade is Satisfactory");
                break;
            case 'D':
                System.out.println("Your grade is Needs Improvement");
                break;
            case 'F':
                System.out.println("You"
                		+ "r grade is Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}


