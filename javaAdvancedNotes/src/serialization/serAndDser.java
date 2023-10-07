package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Serializing objects is turning them into bytes so that they can be sent over a network
// Deserializing is putting the object back together from bytes on the client side of the network
// It allows you to make your objects portable and persistent, enabling them to be stored, transmitted, and recreated.

/*
 * Let's say you have an object in your Java program that contains data, like a class representing 
 * a person with attributes such as name, age, and address. Normally, when your program is running, 
 * the object resides in the computer's memory (RAM). However, when you shut down your program or turn off 
 * your computer, the object and its data are lost.
 * 
 * Serialization allows you to save the object's state (its data) into a file or send it over a network. 
 * This way, you can store or transfer the object and later restore it to its original state.
 * 
 * */

public class serAndDser {
	public static void main(String[] args) {
		// create a employee object named Employee that connects to employee.java
		employee Employee1 = new employee("John", 25, "John@Steaksta.com", 1);
		
		// This will store the file to the set path
		String fileName = "/Users/Yudzilla/Documents/Employees.java";
		FileOutputStream fileOut = null; // Declare for writing to the file
		ObjectOutputStream objectOut = null; // Declare for creating object for file
		
		// Serialization - (Writing)
		try {
			fileOut = new FileOutputStream(fileName); // Write to the file fileName
			objectOut = new ObjectOutputStream(fileOut); // Create object for file fileOut
			objectOut.writeObject(Employee1); // Write the Employee1 object to the fileName
			
			objectOut.close();
			fileOut.close();
			System.out.println("Object has been serialized: \n" + Employee1);
			
		}catch(IOException e) {
			System.out.println("IOException is caught aka error in your code");
		}
		
		// Deserialization - (Reading)
		FileInputStream fileIn = null;
		ObjectInputStream objectIn = null;
		try {
			fileIn = new FileInputStream(fileName); // Loads fileName (path) object Employee1 that has already been writin.
			objectIn = new ObjectInputStream(fileIn); // Reads fileName
			
			// cast (employee) class to tell the .readObject that it's reading an object from employee class.
			employee object = (employee) objectIn.readObject(); // Reads the file and returns a general object
			
			System.out.println("Object has been deserialized: \n" + object);
			
			objectIn.close();
			fileIn.close();
			
		}catch(IOException e){
			System.out.println("IOException is caught aka error in your code");
		}catch(ClassNotFoundException e){
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
