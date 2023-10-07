package guiNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gridLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
// Layout manager = Defines the natural layout for components within a container (frame,panel).
// GridLayout = places components in a grid of cells. Each component takes up all available space within
// its cell and each cell is the same size.	
		frame.setLayout(new GridLayout(3,3,0,0)); // (# of rows, # of columns, h-spacing, v-spacing)); (h,v) NOT WORKING!
		
		frame.setTitle("Grid Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true); 
		frame.setSize(new Dimension(1000,420));
		frame.getContentPane().setBackground(new Color(255,255,255));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
	}

}
