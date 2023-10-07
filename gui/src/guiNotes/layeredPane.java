package guiNotes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class layeredPane {

	public static void main(String[] args) {
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.MAGENTA);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.DARK_GRAY);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLACK);
		label3.setBounds(150, 150, 200, 200);
		
		// JLayeredPane = 3rd dimension container that provides positioning for components (Stack on top of each other)
		// Integer.valueof(x) , x is the order of what goes on top (Not mandatory). Higher the number closer to the user .
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(1));
		layeredPane.add(label3, Integer.valueOf(2));
		
		JFrame frame = new JFrame("LayeredPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setResizable(true); 
		frame.add(layeredPane);
		
		frame.setVisible(true);
	}

}
