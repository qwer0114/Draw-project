package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas {
	protected JPanel panel = new JPanel();  
	
	
	
	public Canvas(){
		getPanel();
	}
	public JPanel getPanel() {
		panel.setBackground(Color.white);
		return panel;
	}
	
}
