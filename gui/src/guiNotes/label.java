package guiNotes;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class label{

	public static void main(String[] args) {	 
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setTitle("Andy's Label Gui");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.getContentPane().setBackground(new Color(255,255,255)); 	 	
		ImageIcon skullLogo = new ImageIcon("SkullLogo.png");
		frame.setIconImage(skullLogo.getImage());
		
		// labelWork is all about customizing the Label on the panel (text and images)
		Border skullborder = BorderFactory.createLineBorder(Color.WHITE,5); // Creates White Border w/ 5 thickness
//		frame.setLayout(null); // Since Layout Manager is set to null we can now manually set the bounds...
//		^^ Contributes to panelsLabel.setBounds (line 43) (puts label wherever you want + dimension of label)
		
		
		
	 	JLabel panelsLabel = new JLabel();
	 	panelsLabel.setText("Here is a string of text!");
	 	panelsLabel.setIcon(skullLogo);
	 	panelsLabel.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT,RIGHT,CENTER of ImageIcon();
	 	panelsLabel.setVerticalTextPosition(JLabel.CENTER); // Set text TOP,BOTTOM,CENTER of ImageIcon();
		panelsLabel.setForeground(Color.PINK); // Set color of the text
//		panelsLabel.setForeground(new Color(255,255,255)); // RGB for a more specific range of color
	 	panelsLabel.setFont(new Font("Times New Roman",Font.BOLD,20 )); // Sets the font, bold/italic/underline, and font size
//		panelsLabel.setIconTextGap(100/-100); // Sets gap between text and image (Doesn't work here bc skull size is too big)
	 	panelsLabel.setBackground(Color.BLACK); // Sets background color but needs to be followed up w (next line)...
	 	panelsLabel.setOpaque(true); // Displays background color ^^
	 	panelsLabel.setBorder(skullborder); // Sets Border to skullLogo
	 	panelsLabel.setVerticalAlignment(JLabel.CENTER); // Sets vertical position of text+image (label is always centered)
	 	panelsLabel.setHorizontalAlignment(JLabel.CENTER); // Sets Horizontal position of text+image (label is always centered)
//	 	panelsLabel.setBounds(100, 100, 550, 550); // Sets x + y position as well as dimensions.(x,y,width,height)(Doesn't Resize image)
	 	
	 	
	 	// Code Conclusion
	 	frame.setVisible(true); 
		frame.setSize(780,420);
	 	frame.getContentPane().add(panel);
		frame.add(panelsLabel);
		// the pack method must go under everything or else it wont work 
//		frame.pack(); // Adjusts the frame the accommodate what's within panelsLabel
	}

}
