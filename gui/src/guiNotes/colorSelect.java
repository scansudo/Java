package guiNotes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class colorSelect extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	colorSelect(){
		
		button = new JButton("Pick A Color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.setText("This is some text");
		label.setFont(new Font("Times New Roman",Font.PLAIN,100));
		
		
		this.add(button);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button){
			
			// Then Declare JColorChooser
			@SuppressWarnings("unused")
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Colors:", Color.black);
			
			label.setBackground(color);
			
		}
	}

}
