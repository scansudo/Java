package guiNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
// Layout manager = Defines the natural layout for components within a container (frame,panels,etc).
// FlowLayout = Places components (button,label,text field,etc.) in a row. If the horizontal space in the container 
// is resized too small for the row, then FlowLayout class will uses the next available row. dynamically changing.
		frame.setLayout(new FlowLayout());
		// Flow Layout Options (FlowLayout.POSITION,int's(HORIZONTAL SPACING),int's(VERTICAL SPACING))
//		frame.setLayout(new FlowLayout(FlowLayout.TRAILING,0,0)); // --COULDN'T GET int's TO WORK--
		
		frame.setTitle("Flow Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(true); 
		frame.setSize(new Dimension(1000,420));
		frame.getContentPane().setBackground(new Color(255,255,255));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,200));
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(new FlowLayout());
		
// Here is a shortcut way to adding an component to the container frame.
//		frame.add(new JButton("name of button"));
/*		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
*/		
		// Instead of adding the buttons to the frame here is how we can add them to a panel. Then after we have to
		// add the panel to the frame, (frame.add(panel);
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);		
		frame.setVisible(true);
	}

}
