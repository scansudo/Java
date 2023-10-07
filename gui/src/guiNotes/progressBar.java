package guiNotes;
import java.awt.*;
import javax.swing.*;

public class progressBar {
	// Progress Bar = Visual aid that lets the user know an operation is in session. 
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	progressBar(){
		bar.setValue(10); // Sets Initial Value
		bar.setBounds(0,0,500,50);
		bar.setFont(new Font("Times New Roman",Font.BOLD,22));
		bar.setForeground(Color.GREEN);
		bar.setBackground(Color.GREEN);
		bar.setOpaque(true); // MANDATORY for Color
		bar.setStringPainted(true); // Adds a % to the progressBar
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill(); // Method needs to be implemented last.
	}
	public void fill() {
 
		int count = 0; // count is going to be the thing that counts up/down. Which in this case will start at 0.
		
		// while(will continue this loop as long as, count < or = 100) . Count down (count >= 0).
		while(count<=100) { 
			bar.setValue(count); // Take the bar and set the value to whatever count is.
			try {
				Thread.sleep(50); // Simulates the progressBar increasing overtime, (less amount of time in ms) = faster.
								  // try and catch block of code after (Will add automatically after Thread.sleep();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count += 1; // How much percent the counter is increased by. If decreasing (-=1).
		}
		bar.setString("Complete");
	}
}
