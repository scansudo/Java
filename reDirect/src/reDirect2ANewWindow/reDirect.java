package reDirect2ANewWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class reDirect implements ActionListener{
	JFrame frame = new JFrame("reDirect Page");
	JButton button = new JButton("Go to Endpage");
		reDirect(){
			button.setBounds(100, 160, 200, 40);
			button.setFocusable(false); // Makes sure button is not highlighted
			button.addActionListener(this);
			
			frame.add(button);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setLayout(null);
			frame.setVisible(true);			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button){
				frame.dispose(); // Redirects + Disposes of reDirect Page, so the button cannot be clicked multiple
								// times and also so multiple endPage's do not keep appearing every time button is clicked.
				@SuppressWarnings("unused")
				endPage EndPage = new endPage(); // Once button is clicked it will Launch a new window (endPage.java)
			}
			
		}
}
