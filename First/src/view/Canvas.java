package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{
	
	
	public Canvas(){
		setBackground(Color.BLUE);	
	}

public void paint(Graphics g) {
		g.drawLine(0, 0, 10, 10);
	}
}
