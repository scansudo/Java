import javax.swing.JFrame;

@SuppressWarnings("serial")
public class frameWork extends JFrame{
	
	dragPanel panel = new dragPanel();
	
	frameWork(){
		
		this.add(panel);
		
		this.setTitle("Drag & Drop Demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}