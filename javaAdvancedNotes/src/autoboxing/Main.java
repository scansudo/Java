package autoboxing;
// Converting an primitive data type into a object(boxing), and then convert it back(unboxing).
public class Main {

	public static void main(String[] args) {
		int x = 10;
		
		// Autoboxing
		Integer xObject = Integer.valueOf(x);
		System.out.println("Integer: " + xObject);
		
		//Auto-Unboxing
		int xx = xObject;
		System.out.println("int: " + xx);
		
		// Autoboxing
		Character charObject = 'a';
		
		//Auto-Unboxing
		@SuppressWarnings("unused")
		char ch = charObject;
		
	}

}
