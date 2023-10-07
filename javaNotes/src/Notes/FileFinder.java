package Notes;
import java.io.File;
public class FileFinder {

	public static void main(String[] args) {
		File x = new File("C:\\example\\test.txt");
		
		if(x.exists()) {
			System.out.println(x.getName() + " exists!");
		}else 
			System.out.println("Error... File doesnt exist");
	}

}