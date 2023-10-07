package Comms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CommsServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		InputStreamReader inputStreamReader = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		ServerSocket serverSocket = null;
		
		serverSocket = new ServerSocket(3785);
		
		while(true) {
		
		try {
			System.out.println("Waiting for client...");
			socket = serverSocket.accept();
			System.out.println("Connection Established!");
			
			inputStreamReader = new InputStreamReader(socket.getInputStream());
			outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
			
			bufferedReader = new BufferedReader(inputStreamReader);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			String msgFromClient;
			while((msgFromClient = bufferedReader.readLine())!= null){
//				msgFromClient = bufferedReader.readLine();
				System.out.println("Client: " + msgFromClient);
				
				bufferedWriter.write("Message Delivered.");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				if(msgFromClient.equalsIgnoreCase("BYE"))
					break;
				
			}
			socket.close();
			inputStreamReader.close();
			outputStreamWriter.close();
			bufferedReader.close();
			bufferedWriter.close();
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
            if (socket != null)
                socket.close();
            if (inputStreamReader != null)
                inputStreamReader.close();
            if (outputStreamWriter != null)
                outputStreamWriter.close();
            if (bufferedReader != null)
                bufferedReader.close();
            if (bufferedWriter != null)
                bufferedWriter.close();
				}	
			
		}
	}
}
