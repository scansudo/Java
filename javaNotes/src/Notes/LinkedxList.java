package Notes;
// Named "Linked"List because each element inside the array shares a link w/ its neighbor element
// Used when a lot of add & remove values are needed
import java.util.LinkedList;
public class LinkedxList {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		name.add("Tom");
		name.add("Jerry");
		name.add("Mickey");
		name.add("Scooby");
		name.add("Spongebob");
		name.remove("Spongebob");
		name.remove(2);
		
		for(String n: name) {
		System.out.println(n);
		}
	}

}