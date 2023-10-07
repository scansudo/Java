package reDirect2ANewWindow;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class endPage {
	JFrame frame = new JFrame("End Page");
	JLabel label = new JLabel("You Have Succeded in reDirection");
	endPage(){
		label.setBounds(0, 0, 500, 100);
		label.setFont(new Font(null,Font.PLAIN,12));
		
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);			
		
		
		
	}
}
