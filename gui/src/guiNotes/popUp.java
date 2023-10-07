package guiNotes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class popUp {

	public static void main(String[] args) {
		// JOptionPane = Pop Up Window / Standard Dialog Box that prompts users about something or informs them about something.
		// parentComponent = the Frame in which the dialog is displayed; if null, or if the parentComponent has no Frame then 
		// a default Frame is used.

		// .showMessageDialog(parentComponent, "message", "title", .messageType);
//		JOptionPane.showMessageDialog(null, "This Is A Plain Pop Up Box", "Plain Pop Up", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This Is An Information Pop Up Box", "Info Pop Up", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This Is A Question Pop Up Box", "? Pop Up", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This Is A Warning Pop Up Box", "Warning Pop Up", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This Is An Error Pop Up Box", "Error Pop Up", JOptionPane.ERROR_MESSAGE);
		
		// This will enable the while loop and the dialog box will keep popping up no matter what.
//		while(true) {
//			JOptionPane.showMessageDialog(null, "This Is An Error Pop Up Box", "Error Pop Up", JOptionPane.ERROR_MESSAGE);
//	}
		// Confirm Dialog gives the user button options.
		
		// .showConfirmDialog(parentComponents, "message", "title", .option_messageType);
//		JOptionPane.showConfirmDialog(null, "Hello","Title",JOptionPane.YES_NO_OPTION);
//		System.out.println(JOptionPane.showConfirmDialog(null, "Hello","Title",JOptionPane.YES_NO_OPTION));
		// Also ...
//		int name = JOptionPane.showConfirmDialog(null, "Hello","Title",JOptionPane.YES_NO_OPTION);		
		
		// Input Dialog allows Users to input a value.
		
		// .showInputDialog("message/question");
//		String name = JOptionPane.showInputDialog("What is your name?:");		
//		System.out.println(name);
		
		// Option Dialog is a combination of .option_messageType, .messageType, icon, etc.
		
		// initialValue = represents the default selection for the [] options; only meaningful if array options is used; can be null.
		
		// .showOptionDialog(parentComponent, "message", "title", .option_messageType, .messageType, icon, [] options, int(defaultSelection);
		ImageIcon icon = new ImageIcon("check.png");
		JOptionPane.showOptionDialog(null, "Confirmed", "Check Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, null, 0);	
		String[] responses = {"Activate","Deactivate","Null","Shutdown"};
		JOptionPane.showOptionDialog(null, "Confirmed", "Check Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	}
}
