package guiNotes;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent; // (Advanced Syntax)
import java.awt.event.ActionListener; // (Advanced Syntax)
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// Radio Buttons (Multiple choice buttons) can be found in checkBox.java
/*
//Action Listener Shortcut Syntax
@SuppressWarnings("serial")
public class buttonWork extends JFrame{
	JButton button;
	buttonWork(){
		ImageIcon icon = new ImageIcon("button.png");
		
		button = new JButton();
		button.setBounds(200, 100, 200, 100);
		button.addActionListener(e -> System.out.println("click"));
		button.setText("I'm a button! (:");
		button.setFocusable(false); // Gets rid of the button border
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setIconTextGap(17);
		button.setForeground(Color.blue);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false); // Disable Button
		
		this.setTitle("Andy's Button"); //Sets Title of the this(frame)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes exit button, exit
		this.setResizable(true); //Allows or Restricts the frame from being resized
		this.getContentPane().setBackground(new Color(255,255,255)); //Change Background Color (RGB 0-255)
		this.setLayout(null);
		this.setSize(780,420); //Sets the x & y Dimensions of the this (MUST ADD LAST!)
		this.setVisible(true); //Makes the this Visible (MUST ADD LAST!)
		this.add(button);
	}		
}
*/

// Action Listener Advanced Syntax
@SuppressWarnings("serial")
public class button extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	button(){
		ImageIcon icon = new ImageIcon("button.png");
		ImageIcon icon2 = new ImageIcon("thumbsUp.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(0,0,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(200, 100, 200, 100);
//		button.addActionListener(e -> System.out.println("click"));
		button.setText("I'm a button! (:");
		button.setFocusable(false); // Gets rid of the button border
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setIconTextGap(17);
		button.setForeground(Color.blue);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.addActionListener(this);
//		button.setEnabled(false); // Disable Button
  
 		this.setTitle("Andy's Button"); //Sets Title of the this(frame)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes exit button, exit
		this.setResizable(true); //Allows or Restricts the frame from being resized
		this.getContentPane().setBackground(new Color(255,255,255)); //Change Background Color (RGB 0-255)
		this.setLayout(null);
		this.setSize(780,420); //Sets the x & y Dimensions of the this (MUST ADD LAST!)
		this.setVisible(true); //Makes the this Visible (MUST ADD LAST!)
		this.add(button);
		this.add(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
//			System.out.println("click");
//			button.setEnabled(false); // allows button to only be clicked once
			label.setVisible(true);
		}	
	}	
}
