package guiNotes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class borderLayouts {

	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container
		// 3 common managers ...
		// BorderLayout = places components in 5 areas: NORTH,SOUTH,WEST,EAST,& CENTER
		// All extra space is placed in the center area
		
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout(10,10)); // Adds margin between panels
		
		JPanel bluePanel = new JPanel();
		JPanel redPanel = new JPanel();
		JPanel blackPanel = new JPanel();
		JPanel purplePanel = new JPanel();
		JPanel grayPanel = new JPanel();
		
		bluePanel.setBackground(Color.BLUE);
		redPanel.setBackground(Color.RED);
		blackPanel.setBackground(Color.BLACK);
		purplePanel.setBackground(Color.MAGENTA);
		grayPanel.setBackground(Color.DARK_GRAY);
	
		bluePanel.setPreferredSize(new Dimension(100,50));
		redPanel.setPreferredSize(new Dimension(100,50));
		blackPanel.setPreferredSize(new Dimension(100,100));
		purplePanel.setPreferredSize(new Dimension(50,100));
		grayPanel.setPreferredSize(new Dimension(50 ,100));
		
		frame.add(bluePanel,BorderLayout.NORTH);
		frame.add(redPanel,BorderLayout.SOUTH);
		frame.add(blackPanel,BorderLayout.CENTER);
		frame.add(purplePanel,BorderLayout.WEST);
		frame.add(grayPanel,BorderLayout.EAST);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}

}