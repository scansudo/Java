package guiNotes;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class frame extends JFrame{
	
	private static final long serialVersionUID = 1L;

		frame(){
		
				// JFrame = a GUI Object window to add components to
			
				this.setTitle("Andys Gui"); //Sets Title of the this
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes exit button, exit
				this.setResizable(true); //Allows or Restricts the frame from being resized
				this.setSize(780,420); //Sets the x & y Dimensions of the this (MUST ADD LAST!)
				this.getContentPane().setBackground(new Color(255,255,255)); //Change Background Color (RGB 0-255)
				
				// Different ways on setting colors
				
//				this.getContentPane().setBackground(new Color(0xFFFFFF)); //Change Background Color (Hex)
//			 	this.getContentPane().setBackground(Color.GRAY); //Change Background Color (.Name of color)
				
				// JPanel = GUI's Canvas 
				
			 	JPanel panel = new JPanel(); //Creates the panel object (panel = inside frame)

				// ImageIcon = Creates icon on the frame and also store image files
				
				ImageIcon skullLogo = new ImageIcon("SkullLogo.png"); //Creates Image Icon
				this.setIconImage(skullLogo.getImage()); //Changes/Adds Icon to the Frame

				// JLabel = an Object that displays text and images on the panel
				
				JLabel usrLabel = new JLabel("Username:");
				JLabel passwLabel = new JLabel("Password:");
				JLabel skull = new JLabel(skullLogo); // Display's (skullLogo) and saves under component name (skull)
				
				skull.setHorizontalAlignment(JLabel.CENTER);
				skull.setVerticalAlignment(JLabel.CENTER);

				// JTextField = A User-Input Object that is visible to the interface
				JTextField usrField = new JTextField(20);
				
				// JPasswordField = A Password UserInput Object that is INvisible to the interface				
				JPasswordField passwField = new JPasswordField(20);
				
				// JButton Create a submit button object				
				JButton submitButton = new JButton("Submit");

			 	// Adds Object components(...); to the panel
//			 	panel.setLayout(null);
			 	panel.add(usrLabel); 
			 	panel.add(usrField);
			 	panel.add(passwLabel);
			 	panel.add(passwField);
			 	panel.add(submitButton);
			 	skull.setBounds(0, 0, this.getWidth(), this.getHeight());
			 	panel.add(skull);
			 	
/*			 	panel.setLayout(null); // Allows you to manually place everything
			 	usrLabel.setBounds(200, 100, 100, 30);
				panel.add(usrLabel); 
				
				usrField.setBounds(300, 100, 200, 30);
				panel.add(usrField);
				
				passwLabel.setBounds(200, 150, 100, 30);
				panel.add(passwLabel);
				
				passwField.setBounds(300, 150, 200, 30);
				panel.add(passwField);
				
				submitButton.setBounds(300, 200, 100, 30);
				panel.add(submitButton);
				
				skull.setBounds(0, 0, this.getWidth(), this.getHeight());
				panel.add(skull);
*/
			 	// MUST ADD THESE LAST OR ELSE... BUG!
			 	this.getContentPane().add(panel); // Adds Panel Object to the gui
				this.setVisible(true); //Makes the this Visible (MUST ADD LAST!)

		}

}
