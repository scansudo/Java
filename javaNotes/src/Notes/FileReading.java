package Notes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileReading {

	public static void main(String[] args) {
		try {
			File x = new File("C\\example\\test.txt");
			@SuppressWarnings({ "unused", "resource" })
			Scanner sc = new Scanner(x);
		}catch (FileNotFoundException e) {
			System.out.println("Error");
		}
//Iterator ... Word by Word
		try {
			File v = new File("C:\\example\\test.txt");
			Scanner sc2 = new Scanner(v);
			while(sc2.hasNext()) {
				System.out.println(sc2.next());
			}
			sc2.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error");
		}
		
	}

}