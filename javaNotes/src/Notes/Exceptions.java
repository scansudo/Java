package Notes;
//Exceptions
public class Exceptions {

	public static void main(String[] args) {
		try{
			int nums[] = new int[12];
			System.out.println(nums[12]);
		}catch (ArithmeticException e1) {
			System.out.println("Error: Arithmetic");
		}catch(IllegalArgumentException e2) {
			System.out.println("Error: Illegal Argument");
		}catch(IndexOutOfBoundsException e3) {
			System.out.println("Error: Index Out of Bounds");
		}
		
		try {
			int n[] = new int [6];
			System.out.println(n[9]);
		}catch (Exception e) {
			System.out.println("General Error!");
		}
		
// Checked Exceptions vs. Unchecked Exceptions (Runtime)
		
// Checked Exceptions are the error marks that show when the code is compiled, the code will not run until fixed.
// Runtime is the error that shows in the console after the code attempts to execute. (checked at runtime)
		
		//Ex. Checked Exception... w/out try and catch it will have an error mark before executed
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("Error");
		}
		
		//Ex. Unchecked Exception (runtime)... w/out try and catch it will error in the console
		try {
			int value = 7;
					value = value / 0;
		}catch(Exception e) {
			System.out.println("Error");
		}
	}

}