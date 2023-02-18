package view;

import java.awt.Button;
import java.awt.Color;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JToolBar;

import event.Buttons;
import event.CanvasEvent;

public class Toolbar extends JToolBar {
	JToolBar toolBar = new JToolBar();
	Buttons buttons = new Buttons();
	CanvasEvent canvasEvent = new CanvasEvent();

	public Toolbar() {
		setBackground(Color.LIGHT_GRAY);

		for (int i = 0; i < buttons.toolButtons.length; i++) {
			add(buttons.toolButtons[i]);
		}

	}
	

}
