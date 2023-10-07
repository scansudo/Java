package guiNotes;

//import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel{

	public static void main(String[] args) {
		ImageIcon thumbsUp = new ImageIcon("thumbsUp.png");
		JLabel labelGoodJob = new JLabel(); 
		labelGoodJob.setText("Good Job!");
		labelGoodJob.setIcon(thumbsUp);
//		labelGoodJob.setVerticalAlignment(JLabel.BOTTOM); // Whichever panel you want to add the label too you must...
//		labelGoodJob.setHorizontalAlignment(JLabel.CENTER); // (continued)^^          .setLayout(new BorderLayout());
 		
//		If you want to use .setBounds(x,y,w,h); you must change the panel's .setLayout(new BorderLayout()); to .setLayout(null)
		labelGoodJob.setBounds(25, 25, 180, 160); // Determines the bounds of the label; within the panel we are going to put it in.
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250); // Determines the position (bounds) and dimension of the panel
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setBounds(500,0,250,250);
//		pinkPanel.setLayout(null);
		
		JPanel orangePanel = new JPanel();
		orangePanel.setBackground(Color.orange);
		orangePanel.setBounds(0,250,250,250);
		orangePanel.setLayout(null);
		
		JPanel cyanPanel = new JPanel();
		cyanPanel.setBackground(Color.cyan);
		cyanPanel.setBounds(250,250,250,250); // Dead-Centered-Square
		
		JPanel magentaPanel = new JPanel();
		magentaPanel.setBackground(Color.magenta);
		magentaPanel.setBounds(500,250,250,250);
		
		JPanel grayPanel = new JPanel();
		grayPanel.setBackground(Color.darkGray);
		grayPanel.setBounds(0,500,750,250);
		
		// Add frame after panel because we need to add panel components to frame
		JFrame frame = new JFrame();
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(pinkPanel);
		frame.add(orangePanel);
		frame.add(cyanPanel);
		frame.add(magentaPanel);
		frame.add(grayPanel);
//		pinkPanel.add(labelGoodJob);
		orangePanel.add(labelGoodJob);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // Allows you to manually place everything
		frame.setSize(750,750);
		
		// NO MATTER WHAT THIS GOES LAST!!!
		frame.setVisible(true);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
