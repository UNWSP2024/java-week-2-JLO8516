package week2;
import java.util.Scanner;

public class Name {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		String firstName;
		String middleName;
		String lastName;
		Double sleepHrs;
		
		System.out.println("Enter your first name --> ");
		firstName = userinput.nextLine();
		System.out.println("Enter your middle name --> ");
		middleName = userinput.nextLine();
		System.out.println("Enter your last name --> ");
		lastName = userinput.nextLine();
		System.out.println("Enter average amount of sleep, in hours, you get a day --> ");
		sleepHrs = userinput.nextDouble();
		
		System.out.format("Your first name is        : %6s\n", firstName);
		System.out.format("Your middle name is       : %6s\n", middleName);
		System.out.format("Your last name is         : %6s\n", lastName);
		System.out.format("Your avg sleep rounded is : %6.1f\n", sleepHrs);

	}

}
