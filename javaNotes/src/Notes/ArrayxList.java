package Notes;
// Array List is used for easy access to data
import java.util.ArrayList;
// import java.util.Collections;
public class ArrayxList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Purple");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Red");
		colors.remove("Orange");
		colors.remove(1);           // "Green" because "Orange" was already removed
		
		colors.contains("Purple");// returns true 
		colors.size();			 // returns the size of the array list
//		colors.clear();         // This will clear the whole array list
//      Collections.sort(colors);  // Sorts Strings alphabetically &/or Numbers 1-...
//      Collections.max(colors);   // Returns the max element, determined by natural order
//      Collections.min(colors);   // Returns the min element, determined by natural order
//      Collections.reverse(colors);   // Reverses the sequence
//      Collection.shuffle(colors);   // Shuffle/randomizes the list
		
		System.out.println(colors);
	}

}