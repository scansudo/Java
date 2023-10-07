package guiNotes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class menuBar extends JFrame implements ActionListener{
	// Menu Bar = File, Edit, View, History, Window, Help, etc.
	
	// Declare (Outside for ActionListener)
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem newItem ;
	JMenuItem loadItem; 
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	menuBar(){
		// Declare
		menuBar = new JMenuBar();
		
		// Declare
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		// In This Case We Will Only Be Working On fileMenu 
		
		// Declare items for Menu Tab
		newItem = new JMenuItem("New");
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		// Set Keyboard shortcuts
		
		// File Menu Items
		newItem.setMnemonic(KeyEvent.VK_N);
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		// Menu Bars (Control + Option + KeyEvent)
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		// Add Everything Accordingly
		
		// Add the action listener to each of the Menu Items (That are going inside File)
		newItem.addActionListener(this);
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		// Add Menu Items to a Menu Tab
		fileMenu.add(newItem);
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		// Add the Menu Tabs to the MenuBar 
		menuBar.add(fileMenu); 
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		// Set Up Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setJMenuBar(menuBar); // Adds Menu Bar to the frame
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newItem) {
			System.out.println("New");
		}
		if(e.getSource()==loadItem) {
			System.out.println("Load");
		}
		if(e.getSource()==saveItem) {
			System.out.println("Save");
		}
		if(e.getSource()==exitItem) {
			System.exit(0); // This is how to exit after exit trigger is pulled.
		}
	}
}
