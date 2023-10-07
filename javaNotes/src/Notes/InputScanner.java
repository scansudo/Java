package Notes;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		
		// Declare The Input Scanner
		@SuppressWarnings("resource")
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter Age: ");
		
		int age;
		age = inputScanner.nextInt();
		
		// Input Scanners Function
		if (age >= 18 && age < 21) {
			System.out.println("Access Granted");
		}else if (age < 18) {
			System.out.println("Error, too young");
		}else if (age >= 21) {
			System.out.println("Access Granted + Eligable for drinks");
		}
	}
}