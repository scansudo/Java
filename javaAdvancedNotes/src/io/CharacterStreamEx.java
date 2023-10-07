package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Example for a simple file holding only character strings, but other than that just use byte 
// stream or if you do not know what kind of data the file is going to hold or then just use
// byte streams because it is universal. CharacterStream still uses byte stream but it is a
// simple alternative.

public class CharacterStreamEx {

	public static void main(String[] args) throws IOException{

		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("/Users/Yudzilla/Documents/test.txt");
			writer = new FileWriter("/Users/Yudzilla/Documents/xtest.txt");
			
			int content;
			while((content = reader.read()) != -1) {
				writer.append((char) content);
			}
			
		}catch(Exception e){
			
		}finally{
			if(reader != null){
			reader.close();
			}
			if(writer != null) {
				writer.close();
			}
		}
	}
}