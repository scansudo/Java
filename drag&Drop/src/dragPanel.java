import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class dragPanel extends JPanel{

	ImageIcon flag = new ImageIcon("pirateFlag.png");
	final int WIDTH = flag.getIconWidth();
	final int HEIGHT = flag.getIconHeight();
	Point flagCorner; // Declares the top right corner of the imageIcon
	Point prevPoint;
	
	dragPanel(){
		 
		flagCorner = new Point(250,200); // Sets the default point/position of the flag top right corner
		ClickListener cl = new ClickListener(); // Declares the listener from when you click the mouse
		DragListener dl = new DragListener(); // Declares the listener from when you drag the mouse
		
		this.addMouseListener(cl); // Adds the Mouse Listener to the frame with the click listener involved with it
		this.addMouseMotionListener(dl); // Adds the Mouse's Motion Listener to the frame with the drag listener associated with it.
		}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		flag.paintIcon(this, g, (int)flagCorner.getX(), (int)flagCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			
			prevPoint = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			
			Point currentPoint = e.getPoint();
			flagCorner.translate(
					
					(int)(currentPoint.getX() - prevPoint.getX()),
					(int)(currentPoint.getY() - prevPoint.getY())

					);
			prevPoint = currentPoint;
			repaint();
		}
	}
}