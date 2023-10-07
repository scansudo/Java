package guiNotes;
import javax.swing.*;

public class loginForm{ 
	public static void main(String[] args) {
	 // Create a JFrame object
    JFrame frame = new JFrame("Login Form Example");
    
    // Create a JPanel object
    JPanel panel = new JPanel();
    
    // Create a JLabel object for username
    JLabel userLabel = new JLabel("Username:");
    
    // Create a JTextField object for username
    JTextField userField = new JTextField(20);
    
    // Create a JLabel object for password
    JLabel passLabel = new JLabel("Password:");
    
    // Create a JPasswordField object for password
    JPasswordField passField = new JPasswordField(20);
    
    // Create a JButton object for submit button
    JButton submitButton = new JButton("Submit");
    
    // Add the components to the panel
    panel.add(userLabel);
    panel.add(userField);
    panel.add(passLabel);
    panel.add(passField);
    panel.add(submitButton);
    
    // Add the panel to the frame
    frame.getContentPane().add(panel);
    
    // Set the size of the frame
    frame.setSize(300, 200);
    
    // Make the frame visible
    frame.setVisible(true);
    
  }
}
