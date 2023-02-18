package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import event.CanvasEvent;


public class Frame extends JFrame{
	Menubar menubar = new Menubar();
	Canvas canvas = new CanvasEvent();
	Toolbar toolbar = new Toolbar();
	public void panel() {
		setTitle("그림판");
		setSize(1200,800);
		setJMenuBar(menubar.menuBar1);
		add(canvas.getPanel(),BorderLayout.CENTER);
		add(toolbar,BorderLayout.NORTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

}
