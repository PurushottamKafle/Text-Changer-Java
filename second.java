package pksoft;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public  class second extends JFrame {
private JTextField x;
private JCheckBox y;
private JCheckBox z;

// now creating 
second(){
	super("Text Managers");
	x = new JTextField("Purushottam Kafle - I am Kidpk", 30);
	x.setFont(new Font("Serif", Font.PLAIN, 14));
	add(x);
	y = new JCheckBox("Cursive");
	add(y);
	z = new JCheckBox("Italic");
	add(z);
	setLayout(new FlowLayout());
	// end of object declaring of components
	
	// Now creating class and object
	MyListener i = new MyListener();
	y.addItemListener(i);
	z.addItemListener(i);
}

private class MyListener implements ItemListener {
	public void itemStateChanged(ItemEvent e) {
		Font f = null;
		if(y.isSelected()&&z.isSelected()) {
			// here
			f = new Font("Serif", Font.BOLD +Font.ITALIC, 14);
		}else if(y.isSelected()) {
			f = new Font("Serif", Font.BOLD, 14);
		} else if(z.isSelected()) {
			f = new Font("Serif", Font.ITALIC, 14);
		}
		else {
			f = new Font("Serif", Font.PLAIN,14);
		}
		x.setFont(f);
	}
}

	
}
