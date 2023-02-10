package view;

import java.awt.Button;
import java.awt.Color;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	JToolBar toolBar = new JToolBar();
	Buttons buttons = new Buttons();

	public Toolbar() {
		setBackground(Color.LIGHT_GRAY);

		for (int i = 0; i < buttons.toolButtons.length; i++) {
			add(buttons.toolButtons[i]);
		}

	}

}
