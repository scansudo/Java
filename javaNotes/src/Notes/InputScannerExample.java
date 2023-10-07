package Notes;

import java.util.Scanner;

public class InputScannerExample { 
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner myVar = new Scanner(System.in);
		System.out.println(myVar.nextLine());
		
	}
}