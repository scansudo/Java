package guiNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class textField extends JFrame implements ActionListener {
	
		// JTextField = A component that can be used to add, set, or, or get text.
		JTextField usrInput;
		JButton button;
		
		textField(){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			button = new JButton("Submit");
			button.addActionListener(this);
			
			usrInput = new JTextField();
			usrInput.setPreferredSize(new Dimension(250,40));
			usrInput.setFont(new Font("Times New Roman",Font.PLAIN,19));
			usrInput.setForeground(Color.GREEN);
			usrInput.setBackground(Color.black);
			usrInput.setCaretColor(Color.RED); // Caret = Blinking line inside text field
			
			this.add(button);
			this.add(usrInput);
			this.pack();
			this.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				System.out.println("Hello " + usrInput.getText() + "!");
				button.setEnabled(false); // Disables button after clicked but does not get rid of window
				usrInput.setEditable(false); // Disables text field after submitted
			}
		}
}