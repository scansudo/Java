package guiNotes;

//import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class mouseListener extends JFrame implements MouseListener {
	// The listener interface for receiving "interesting" mouse events (press, release, click, enter, and exit) on a component. (To track mouse moves and mouse drags, use the MouseMotionListener.)
	 JLabel label;
	 ImageIcon factory;
	 ImageIcon radioactive;
	 ImageIcon cleaning;
	 ImageIcon clean;
	 
	mouseListener(){
		
		factory = new ImageIcon("factory.png");
		radioactive = new ImageIcon("radioactive.png");
		cleaning = new ImageIcon("cleaning.png");
		clean = new ImageIcon("clean.png");
		
		label = new JLabel();
//		label.setBounds(0,0,500,500);
//		label.setBackground(Color.BLACK);
//		label.setOpaque(true);
		label.addMouseListener(this);
//		this.addMouseListener(this); // Instead of label the frame would be mouseListened
		label.setIcon(factory);
		
		
		
		
		
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
//		this.setLayout(null);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setLocationRelativeTo(null); // This will have frame set to middle of computer screen
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// mouseClicked = Invokes when mouse button is clicked (pressed + released) on a component
//		System.out.println("You clicked the mouse");
//		label.setBackground(Color.magenta);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// mousePressed = Invokes when a mouse button is pressed on a component
//		System.out.println("You pressed the mouse");
//		label.setBackground(Color.white);
		label.setIcon(cleaning);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// mouseReleased = Invokes when a mouse button is released from a component
//		System.out.println("You released the mouse");
//		label.setBackground(Color.BLUE);
		label.setIcon(clean);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// mouseEntered = Invokes when a mouse enters the area of a component
//		System.out.println("You entered the component");
//		label.setBackground(Color.YELLOW);
		label.setIcon(radioactive);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// mouseExited = Invokes when a mouse has exited the area of a component
//		System.out.println("You exited the component");
//		label.setBackground(Color.red);
		label.setIcon(factory);

	}
}
