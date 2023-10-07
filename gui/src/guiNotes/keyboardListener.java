package guiNotes;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class keyboardListener extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	keyboardListener(){
		
		icon = new ImageIcon("football.png"); // Declare before label.setIcon
		
		label = new JLabel();
		label.setBounds(0, 0, 200, 200); // Since we are using no layout manager
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		label.setIcon(icon);

		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.addKeyListener(this); // Responds to key events
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750,750);
		this.setLayout(null); // Set to null bc we are going to be manually moving components using key stroke.
		this.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is TYPED. 
		// Uses KeyChar, give us a character output depending on which key is pressed
		switch(e.getKeyChar()){
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			 break;
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed = Invoked when a key is PRESSED DOWN. 
		// Uses KeyCode, gives us a int output. Each key on the keyboard has an associate number and KeyCode gives us that number.
		switch(e.getKeyCode()){
		case 37: label.setLocation(label.getX()-10, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10);
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());
			 break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = Called whenever a keyboard button is REALEASED 
		System.out.println("You Realeased Key Character " + e.getKeyChar());
		System.out.println("You Realeased Key Character " + e.getKeyCode());

		}
}