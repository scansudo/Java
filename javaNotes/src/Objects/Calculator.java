package Objects;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner calc = new Scanner(System.in);
		int fnum, snum, answer;
		
		System.out.println("Enter a Whole Number:");
		fnum = calc.nextInt();
		
		System.out.println("Enter Another Whole Number:");
		snum = calc.nextInt();
		
		answer = fnum + snum;
		System.out.println("The sum = " + answer);
	}
}