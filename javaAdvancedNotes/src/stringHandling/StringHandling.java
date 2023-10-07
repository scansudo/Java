package stringHandling;

import java.util.Arrays;

public class StringHandling {

	public static void main(String[] args) {
		
		String string1 = "John is studying ";
		String string2 = "for his computer science class.";
		
		// .length gives the value of the how many characters are in the strings
		System.out.println(string1.length());
		System.out.println(string2.length());
		
		// concat brings both of the strings together
		String concat = string1.concat(string2);
		System.out.println(concat);
		
		// Dynamic place holders . Apply comma and then apply values in sequence
		// %s = String input , %d = integer input , %f = float , etc.
		String dph = String.format("The name of the student is " + "%s, and their age is "
		+ "%d." , "John", 21);
		System.out.println(dph);
		
		// String Index by number
		System.out.println(string1.charAt(5));
		
		// String Index by character (1st character match displays) (-1 = char isn't existing)
		System.out.println(string1.indexOf('i'));
		
		// if statement for Strings
		if(string1.equals(string2)) {
			System.out.println("Do this");
		} else {
			System.out.println("string1 is not equal to string2");
		}
		// .replace swaps characters
		System.out.println(string1.replace('s','r'));
		
		// Split the string into multiple elements
		String[] arr = string1.split(" ");
		Arrays.asList(arr).forEach(s -> System.out.println(s));
		
		//.substring(Start,End) everything in between is the new value.
		String newString1 = string1.substring(1,6);
		System.out.println(newString1);
		
	}
}