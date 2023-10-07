package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		
		// Declare i/o
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			// Reading file to this program
			input = new FileInputStream("/Users/Yudzilla/Documents/test.txt"); 
			// Writing to the destination file from this program
			output = new FileOutputStream("/Users/Yudzilla/Documents/xtest.txt");
			
			// Read the bytes; one byte at a time, byte by byte. Using a while loop.
			// Java determines there are no more bytes to read by returning -1.
			// Once the loop returns -1, write those bytes to the xtest.txt file (output).
			int content;
			while((content = input.read()) != -1) {
				output.write((byte) content); // cast content from int into a byte so it can travel
			}								 // and be written into the output file.
		
		}catch(Exception e) {
			System.out.println(e);
			
		// DO NOT FORGET TO CLOSE THE STREAM RESOURCES!
		// or else they will remain open until java does a garbage collection.
		}finally {
			if(input != null) {
				input.close();
			}
			if(output != null) {
				output.close();
			}
		}
		
	}

}
