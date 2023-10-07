package Scanner;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client..."); // Display that the server is up and running
            ServerSocket ss = new ServerSocket(9806); // Establish the ability to connect to the server
            Socket soc = ss.accept(); // .accept returns a socket object that enables communication 
            System.out.println("Connection Established"); // Display once the connection is made

            Scanner clientOutput = new Scanner(soc.getInputStream()); // Ability to receive the the client output
//            String string = clientOutput.nextLine(); // Ability for a string to be receive a string
//            System.out.println("Client says: " + string);

            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
//            out.println("Server says: " + string);
            
            while(true) {
            	if(clientOutput.hasNextLine()) {
            	String string = clientOutput.nextLine();
            	System.out.println("Client Says: " + string);
            	
            	out.println("Server Says: " + string);
            	
            	if(string.equalsIgnoreCase("BYE")) {
            		break;
            	}
            }
            }

            // Close the connections
            out.close();
            clientOutput.close();
            soc.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
