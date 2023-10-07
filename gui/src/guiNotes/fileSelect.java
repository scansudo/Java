package guiNotes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class fileSelect extends JFrame implements ActionListener{

	// JFileChooser = GUI mechanism that let's the user choose a file.
	// Helpful for opening / saving files to the computers files.
	
		JButton button;
	fileSelect(){
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	 }
	 @Override
	public void actionPerformed(ActionEvent e) {

		 if(e.getSource()==button) {
			 
		 JFileChooser fileChooser = new JFileChooser(); // Declares the JFileChooser API
		 
		 fileChooser.setCurrentDirectory(new File("/Users/Yudzilla/Desktop")); // Sets a Default Path for fileChooser API
		 
		 // .showOpenDialog = Attempts to open a selected file		
		 int response = fileChooser.showOpenDialog(null);
		 
		 // .showSaveDialog = Attempts to save a file to a specific path
//		 int response = fileChooser.showSaveDialog(null);
		 
		 if(response == JFileChooser.APPROVE_OPTION) { // If user successfully selects a file then we can create a new file and do something{}
			 File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); // Gets selected file and Gets that files path.
			 System.out.println(file); // Displays the file path on the console.
			 
		 	}
		 } 
	}
}