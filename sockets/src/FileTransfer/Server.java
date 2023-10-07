package FileTransfer;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Server {
	
	static ArrayList<MyFile> myFiles = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		int fileId = 0;
		
		JFrame frame = new JFrame("Server");

		frame.setSize(500,500);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane(panel);
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		JLabel title = new JLabel("File Receiver");
		
		title.setFont(new Font("Times New Roman", Font.BOLD, 25));
		title.setBorder(new EmptyBorder(20,0,10,0));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		frame.add(title);
		frame.add(scrollPane);
		frame.setVisible(true);
		
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(3784);
		
		while(true) {
			try {
				Socket socket = ss.accept();
				
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				
				int fileNameLength = dataInputStream.readInt();
				
				if(fileNameLength > 0) {
					
					byte[] fileNameBytes = new byte[fileNameLength];
					
					dataInputStream.readFully(fileNameBytes, 0, fileNameBytes.length);
					
					String fileName = new String(fileNameBytes);
					
					int fileContentLength = dataInputStream.readInt();
					
					if(fileContentLength > 0) {
						
						byte[] fileContentBytes = new byte[fileContentLength];
						
						dataInputStream.readFully(fileContentBytes, 0, fileContentLength);
						
						JPanel jpFileRow = new JPanel();
						jpFileRow.setLayout(new BoxLayout(jpFileRow, BoxLayout.Y_AXIS));
						
						JLabel jlFileName = new JLabel(fileName);
						jlFileName.setFont(new Font("Times New Roman", Font.BOLD, 20));
						jlFileName.setBorder(new EmptyBorder(10,0,10,0));
						
						if(getFileExtension(fileName).equalsIgnoreCase("txt")) {
							
							jpFileRow.setName(String.valueOf(fileId));
							jpFileRow.addMouseListener(getMyMouseListener(getFileExtension(fileName)));
							jpFileRow.add(jlFileName);
							panel.add(jpFileRow);
							frame.validate();
						}else {
							jpFileRow.setName(String.valueOf(fileId));
							jpFileRow.addMouseListener(getMyMouseListener(getFileExtension(fileName)));
							jpFileRow.add(jlFileName);
							panel.add(jpFileRow);
							frame.validate();
						}
						myFiles.add(new MyFile(fileId, fileName, fileContentBytes, getFileExtension(fileName)));
						fileId++;
					}
				}
					
				
				
			}catch(IOException error) {
			error.printStackTrace();
			}
		}
	}
	
		public static String getFileExtension(String fileName) {
			int i = fileName.lastIndexOf('.');
			if(i > 0) {
				return fileName.substring(i + 1);
			}else {
				return "Extension does not exist";
		}
	}
	
		public static MouseListener getMyMouseListener(String fileExtension){
			return new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JPanel jPanel = (JPanel) e.getSource();
					
					int fileId = Integer.parseInt(jPanel.getName());
					
					for(MyFile myFile: myFiles) {
						if(myFile.getId() == fileId) {
							JFrame jfPreview = createFrame(myFile.getName(),myFile.getData(),myFile.getFileExtension());
							jfPreview.setVisible(true);
						}
					}
				}
				@Override
				public void mousePressed(MouseEvent e) {
					
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					
				}
				@Override
				public void mouseExited(MouseEvent e) {
					
				}
			};	
		}
		public static JFrame createFrame(String fileName, byte[] fileData, String fileExtension) {
			
			JFrame jframe = new JFrame("File Downloader");
			jframe.setSize(400,400);
			
			JPanel jpanel = new JPanel();
			jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
			
			JLabel jtitle = new JLabel("GUI File Downloader");
			jtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
			jtitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
			jtitle.setBorder(new EmptyBorder(20,0,10,0));
			
			
			JLabel jprompt = new JLabel("Are you sure you want to download ? " + fileName);
			jprompt.setFont(new Font("Times New Roman", Font.BOLD,25));
			jprompt.setBorder(new EmptyBorder(20,0,10,0));
			jprompt.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			JButton jbYes = new JButton("Yes");
			jbYes.setPreferredSize(new Dimension(150,75));
			jbYes.setFont(new Font("Times New Roman", Font.BOLD, 20));
			
			JButton jbNo = new JButton("No");
			jbNo.setPreferredSize(new Dimension(150,75));
			jbNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
			
			JLabel jFileContent = new JLabel();
			jFileContent.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			JPanel jpButtons = new JPanel();
			jpButtons.setBorder(new EmptyBorder(20,0,10,0));
			jpButtons.add(jbYes);
			jpButtons.add(jbNo);
			
			if (fileExtension.equalsIgnoreCase("txt")) {
				jFileContent.setText("<html>" + new String(fileData) + "</html>");
			} else {
				jFileContent.setIcon(new ImageIcon(fileData));
				
			}
			
			jbYes.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					File fileDownload = new File(fileName);
					
					try {
						FileOutputStream fileOutputStream = new FileOutputStream(fileDownload);
						fileOutputStream.write(fileData);
						fileOutputStream.close();
						
						jframe.dispose();
						
					}catch (IOException error) {
						error.printStackTrace();
					}
				}
			});
			jbNo.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					jframe.dispose();
				}
		});
		
		jpanel.add(jtitle);
		jpanel.add(jprompt);
		jpanel.add(jFileContent);
		jpanel.add(jpButtons);
		jframe.add(jpanel);
		
		return jframe;
	}
}