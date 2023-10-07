package guiNotes;
/*
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
*/
public class frameMain {
	public static void main(String[] args) {
/*		
  		// JFrame = a GUI Object window to add components too.		
		JFrame frame = new JFrame(); //Creates the Frame
//		frame.setVisible(true); //Makes the Frame Visible (MUST ADD AT END OF CODE!)
		frame.setTitle("Andy's Gui"); //Sets Title of the Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes exit button, exit
		frame.setResizable(true); //Allows or Restricts Frame from being resized
//		frame.setSize(780,420); //Sets the x & y Dimensions of the frame (MUST ADD AT END OF CODE!)
		frame.getContentPane().setBackground(new Color(255,255,255)); //Change Background Color (RGB 0-255)
//		frame.getContentPane().setBackground(new Color(0xFFFFFF)); //Change Background Color (Hex)
//	 	frame.getContentPane().setBackground(Color.GRAY); //Change Background Color (.Name of color)
 
  		// ImageIcon = Creates icon on the frame	 	
		ImageIcon skullLogo = new ImageIcon("SkullLogo.png"); //Creates Image Icon and saves image under skullLogo
		frame.setIconImage(skullLogo.getImage()); //Changes/Adds Icon to the Frame

		// JLabel = an Object that displays text and images on the panel		
		JLabel usrLabel = new JLabel("Username:"); // The JLabel Object adds text and images
		JLabel passwLabel = new JLabel("Password:");
		JLabel skull = new JLabel(skullLogo); // Displays skullLogo 
		
		// JTextField = User-Input Object 		
		JTextField usrField = new JTextField(20);
		
		// JPasswordField = Password UserInput Object		
		JPasswordField passwField = new JPasswordField(20);
		
		// JButton Create a submit button object		
		JButton submitButton = new JButton("Submit");
		
		// JPanel = GUI's Canvas (Adds Object Components to the GUI, ORDER MATTERS!)		
	 	JPanel panel = new JPanel(); //Creates the panel object (panel = inside frame)
//	 	frame.getContentPane().add(panel); // Adds Panel Object to the gui (MUST ADD AT END OF CODE!)
	 	panel.add(usrLabel); // Adds Object components(...); to the panel
	 	panel.add(usrField);
	 	panel.add(passwLabel);
	 	panel.add(passwField);
	 	panel.add(submitButton);
	 	panel.add(skull);
	 	
	 	// MUST GO LAST OR ELSE... BUG!
		frame.setVisible(true); //Makes the Frame Visible (MUST ADD AT END OF CODE!)
		frame.setSize(780,420); //Sets the x & y Dimensions of the frame (MUST ADD AT END OF CODE!)
	 	frame.getContentPane().add(panel); // Adds Panel Object to the gui (MUST ADD AT END OF CODE!)
*/ 
		
	 	// Instead of all that ^^ we called it from the subclass Framework.java and named it frame
		@SuppressWarnings("unused")
		frame frameWork = new frame();	
	}

}
