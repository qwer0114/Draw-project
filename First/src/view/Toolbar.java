package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JToolBar;

import event.Buttons;
import event.CanvasEvent;
import event.Thickness;

public class Toolbar extends JToolBar {
	JToolBar toolBar = new JToolBar();
	Buttons buttons = new Buttons();
	Thickness storke = new Thickness();
	CanvasEvent canvasEvent = new CanvasEvent();

	public Toolbar() {
		setBackground(Color.LIGHT_GRAY);

		for (int i = 0; i < buttons.toolButtons.length; i++) {
			add(buttons.toolButtons[i]);
		}
		add(storke);
		addSeparator(new Dimension(800,1));

	}
	

}
