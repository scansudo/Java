package Objects;
import java.util.Scanner;
public class JarOfChange2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pennies = 0;
		int nicks = 0;
		int dimes = 0;
		int quarts = 0;
		
		String message = "Enter the amount of pennies:";
		System.out.println(message);
		String line = null;
		while(line == null) {
			line = scanner.nextLine();
			try {
				pennies = Integer.valueOf(line);
			break;
		}catch(NumberFormatException e){
			System.out.println("Answer '" + line + "' invalid, please try again\n");
			line = null;
			System.out.println(message);
		}
		}
		message = "Enter the amount of nickels:";
		System.out.println(message);
		line = null;
		while(line == null) {
			line = scanner.nextLine();
			try {
				nicks = Integer.valueOf(line);
				break;
			}catch(NumberFormatException e){
				System.out.println("Answer '" + line + "' invalid, please try again\n");
				line = null;
				System.out.println(message);
			}
		}
		message = "Enter the amount of dimes:";
		System.out.println(message);
		line = null;
		while(line == null) {
			line = scanner.nextLine();
			try {
				dimes = Integer.valueOf(line);
				break;
			}catch(NumberFormatException e){
				System.out.println("Answer '" + line + "' invalid, please try again\n");
				line = null;
				System.out.println(message);
	}
}
		message = "Enter the amount of quarters:";
		System.out.println(message);
		line = null;
		while(line == null) {
			line = scanner.nextLine();
			try {
				quarts = Integer.valueOf(line);
				break;
			}catch(NumberFormatException e){
				System.out.println("Answer '" + line + "' invalid, please try again\n");
				line = null;
				System.out.println(message);
	}
}
		scanner.close();
		
		int totalCents = pennies * 1 + nicks * 5 + dimes * 10 + quarts * 25;
		double totalValue = totalCents / 100.0;
	System.out.println("Total Value: $" + totalValue);
}
}