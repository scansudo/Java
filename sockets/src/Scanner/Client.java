package Scanner;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client{

    public static void main(String[] args) {
        try {
 //           System.out.println("Client Started");
            Socket soc = new Socket("192.168.10.122", 9806); // Establish client-to-server connection

            Scanner clientInput = new Scanner(System.in); // Establish Scanner for clients input
            System.out.println("What is your name?");    // Once connection and scanner are established, do this on clients computer
            
            String string = clientInput.nextLine(); // Establish the ability of entering a string; into the scanner ( clientInput )

            PrintWriter outputToServer = new PrintWriter(soc.getOutputStream(), true); // establish ability of sending the string to server
            outputToServer.println(string); // true is flush which is the stream 

            Scanner in = new Scanner(soc.getInputStream()); // Establish the ability to receive the servers response
            String serverResponse = in.nextLine(); // Establish the ability to receive a string from the server
            System.out.println(serverResponse); // Display the string from the server

            // Close the connections
            in.close();
            outputToServer.close();
            clientInput.close();
            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
