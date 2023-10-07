package Notes;
// A HashMap can NOT contain duplicate keys 
// Adding a new value overwrites the previous one
import java.util.HashMap;
public class HashxMap {

	public static void main(String[] args) {
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("David", 32);
		points.put("Robbert", 22);
		points.put("Ashley", 20);
		points.put("Paul", 10);
		points.remove("Robbert");
		
		System.out.println(points.get("David"));
	}

}