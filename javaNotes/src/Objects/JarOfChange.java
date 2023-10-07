package Objects;
import java.util.Scanner;
public class JarOfChange {

	public static void main(String[] args) {
		Scanner jar = new Scanner(System.in);
		int pennies, nickles, dimes, quarters;
		
		System.out.println("Enter amount of pennies:");
		pennies = jar.nextInt() * 1;
		System.out.println("Enter amount of nickles:");
		nickles = jar.nextInt() * 5;
		System.out.println("Enter amount of dimes:");
		dimes = jar.nextInt() * 10;
		System.out.println("Enter amount of quarters:");
		quarters = jar.nextInt() * 25;
		
		jar.close();
		
		int amount = pennies + nickles + dimes + quarters;
		double dvalue = amount / 100.00;
		System.out.println("Total: $" + dvalue);
	}
}