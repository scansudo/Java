package Notes;
// HashSet follows alphabetical order
// LinkedHashSet follows order it was set in
import java.util.HashSet;
public class HashxSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("E");
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("C");
		set.remove("E");
		System.out.println(set);
	}

}