package FileTransfer;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Client {

	public static void main(String[] args) {
		
		final File[] fileToSend = new File[1];
		
		JFrame frame = new JFrame("File 2 Send");
		frame.setSize(500,500);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("File Sender GUI");
		title.setFont(new Font("Times New Roman",Font.BOLD,25));
		title.setBorder(new EmptyBorder(20,0,10,0)); // Applies space between elements inside the frame (top,left,bottom,right)
		title.setAlignmentX(Component.CENTER_ALIGNMENT); // sets in the center
		
		JLabel fileName = new JLabel("Choose File to Send");
		fileName.setFont(new Font("Times New Roman",Font.BOLD,17));
		fileName.setBorder(new EmptyBorder(50,0,0,0));
		fileName.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel jpButtons = new JPanel();
		jpButtons.setBorder(new EmptyBorder(75,0,0,0));
		
		JButton sendFile = new JButton("Send File");
		sendFile.setPreferredSize(new Dimension(150,75));
		sendFile.setFont(new Font("Times New Roman", Font.PLAIN,17));
		
		JButton chooseFile = new JButton("Choose File");
		chooseFile.setPreferredSize(new Dimension(150,75));
		chooseFile.setFont(new Font("Times New Roman", Font.PLAIN,17));
		
		jpButtons.add(chooseFile);
		jpButtons.add(sendFile);
		
		
		chooseFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Choose a File to Send");
				
				if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					fileToSend[0] = fileChooser.getSelectedFile();
					fileName.setText("The File You Want To Send Is: " + fileToSend[0].getName());
					}
				}
			});
			
		sendFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {		
				if(fileToSend[0] == null) {
					fileName.setText("Choose a file first");
				}else {
					try {
					FileInputStream fileInputStream = new FileInputStream(fileToSend[0].getAbsolutePath());
					@SuppressWarnings("resource")
					Socket socket = new Socket("192.168.10.122", 3784);
					
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
					
					String fileName = fileToSend[0].getName();
					byte[] fileNameBytes = fileName.getBytes();
					
					byte[] contentBytes = new byte[(int) fileToSend[0].length()];
					fileInputStream.read(contentBytes);
					
					dataOutputStream.writeInt(fileNameBytes.length);
					dataOutputStream.write(fileNameBytes);
					
					dataOutputStream.writeInt(contentBytes.length);
					dataOutputStream.write(contentBytes);
						}	
					catch (IOException error) {
						error.printStackTrace();
					}
				}
			}
		});
		
		frame.add(title); // Title Label
		frame.add(fileName); // Choose A File Label
		frame.add(jpButtons);
		frame.setVisible(true);
	}

}
