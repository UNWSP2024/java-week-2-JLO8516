package week2;

import java.util.Scanner;

public class Encouragement {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		String firstName;
		String middleName;
		String lastName;
		
		System.out.println("Enter your first name --> ");
		firstName = userinput.nextLine();
		System.out.println("Enter your middle name --> ");
		middleName = userinput.nextLine();
		System.out.println("Enter your last name --> ");
		lastName = userinput.nextLine();
		
		char w = '\u270B';
		char f = '\u263A';
		System.out.println("Hi," + w + " " + firstName + " " + middleName + " " + lastName + ", have a great day!!!" + f);

	}

}
