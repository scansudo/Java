package guiNotes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class comboBox extends JFrame implements ActionListener{

	@SuppressWarnings("rawtypes")
	JComboBox comboBox;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	comboBox(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// If Storing int Data In [] You Must Use Wrapper Class's.
		// Wrapper Class's = Integer & Double... instead of int & double.
		String[] Countrys = {"US", "Mexico", "Canada", "Japan"};
		comboBox = new JComboBox(Countrys);
		comboBox.addActionListener(this);
		comboBox.addItem("France");
		comboBox.insertItemAt("Germany", 0); // (Adds Item, places it in said index)
		comboBox.setSelectedIndex(0); // This makes sure index 0 is set as default.
		comboBox.removeItem("Germany");
		            // or
//		comboBox.removeItemAt(0);
//		comboBox.removeAllItems(); // Clears All Items
//		comboBox.setEditable(true); // Allows use to type inside comboBox.
//		System.out.println(comboBox.getItemCount()); // Prints how many items are in comboBox		
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()); // Prints Array Item Name
//			System.out.println(comboBox.getSelectedIndex()); // Prints the Index #
		}
	}

}