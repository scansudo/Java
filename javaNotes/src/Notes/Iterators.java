package Notes;
import java.util.Iterator;
//Iterator class provides
/* 
 * hasNext() returns true if at least one more element exist; otherwise returns false
 * next() returns the next object and advances the iterator
 * remove() Removes the last object that was returned by next()
 */
import java.util.LinkedList;
public class Iterators {

	public static void main(String[] args) {
		LinkedList<String> animalz = new LinkedList<String>();
		animalz.add("fox");
		animalz.add("cat");
		animalz.add("dog");
		animalz.add("rabbit");
		
		Iterator<String> it = animalz.iterator();
		
		String value = it.next();
		
		System.out.println(value);
		it.next();
		
//		while(it.hasNext()) {
//			String value = it.next();
		System.out.println(value);
		}
	}
