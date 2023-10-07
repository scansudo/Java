package guiNotes;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class slider implements ChangeListener{
		// JSlider = Slider scale like a vertical thermostat , allows users to enter
		// a value by using an adjustable slider knob on a track.	
	
		JFrame frame;
		JPanel panel;
		JLabel label;
		JSlider slider;
	slider(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // Sliders (min value, max value, starting point)
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true); // Pointer that allows slider to pick one of the range of #'s
		slider.setMinorTickSpacing(10); // Displays small notches every 10 units
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25); // Displays larger notches every 25 units
		slider.setPaintLabels(true); // Displays the range of values.
		slider.setFont(new Font("Times New Roman",Font.PLAIN,14));
		slider.setOrientation(SwingConstants.VERTICAL); // Modifies slider into a vertical slider
		slider.addChangeListener(this); // Add ChangeListener to the slider

		label.setFont(new Font("Times New Roman",Font.PLAIN,22));
		label.setText("°F = " + slider.getValue());
				
		panel.add(slider); // First add slider to the panel.
		panel.add(label);
		frame.add(panel); // Then add panel to the frame.
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°F = " + slider.getValue());
	}
}