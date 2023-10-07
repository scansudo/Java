package guiNotes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class upDown implements ActionListener {

    int x = 0;
    JFrame frame = new JFrame();
    JLabel label = new JLabel(String.valueOf(x));

    public static void main(String[] args) {
        new upDown();
    }

    public upDown() {
        frame.setTitle("Inc and Dec");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true); 
        frame.setSize(1000,420);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setLayout(new FlowLayout());
    
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        
        JButton inc = new JButton();
        JButton dec = new JButton();
        
        inc.setText("Increment");
        inc.addActionListener(this);
    
        dec.setText("Decrement");
        dec.addActionListener(this);
        
        panel.add(inc);
        panel.add(dec);
        
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Increment")) {
            x++;
            label.setText(String.valueOf(x));
        }
        else if (e.getActionCommand().equals("Decrement")) {
            x--;
            label.setText(String.valueOf(x));
        }
    }
}

