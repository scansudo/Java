package guiNotes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class checkBox extends JFrame implements ActionListener{
	// JcheckBox = a component that can be selected or deselected
	// JRadioButton = the same thing except instead of check box's they are buttons
	JButton button1;
	JButton button2;
	JCheckBox checkboxS;
	JCheckBox checkboxM;
	JCheckBox checkboxR;
	ButtonGroup group; // Allows only one check box to be selected

	checkBox(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("What Is Your Relationship Status?");
		this.setLayout(new FlowLayout());

		checkboxS = new JCheckBox("Single");
		checkboxM = new JCheckBox("Married");
		checkboxR = new JCheckBox("In A Relationship");
		
		group = new ButtonGroup();
		group.add(checkboxS);
		group.add(checkboxM);
		group.add(checkboxR);

		button1 = new JButton();
		button1.setText("Submit");
		button1.addActionListener(this);
		
		button2 = new JButton();
		button2.setText("Thanks");
		button2.setVisible(false);
		
		this.add(checkboxS);
		this.add(checkboxM);
		this.add(checkboxR);
		this.add(button1);
		this.add(button2);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1){
//			System.out.println(checkboxS.isSelected());
//			System.out.println(checkboxM.isSelected());
//			System.out.println(checkboxR.isSelected());
			if(checkboxS.isSelected()){
				System.out.println("Single");
//				dispose();
				button2.setVisible(true);
				button1.setVisible(false);
				
			}if(checkboxM.isSelected()){
				System.out.println("Married");
//				dispose();
				button2.setVisible(true);
				button1.setVisible(false);
				
			}if(checkboxR.isSelected()){
				System.out.println("In A Relationship");
//				dispose();
				button2.setVisible(true);
				button1.setVisible(false);
			}
		}
	}
}
