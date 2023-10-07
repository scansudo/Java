package Notes;
import java.util.Formatter;
public class FileFormatter {

	public static void main(String[] args) {
// Creating a file
		try {
			@SuppressWarnings({ "unused", "resource" })
			Formatter f1 = new Formatter("C:\\example\\test.txt");
		}catch(Exception e) {
			System.out.println("Error");
		}
// Writing in a file
		try {
			Formatter f2 = new Formatter("test.txt");
			f2.format("%s %s %s", "1", "John", "Smith \r\n");
			f2.format("%s %s %s", "2", "Amy", "Stark");
			f2.close();
		}catch(Exception e) {
			System.out.println("Error");
		}
	}

}