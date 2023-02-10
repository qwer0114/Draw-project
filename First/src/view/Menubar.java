package view;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menubar extends JMenuBar{
	JMenuBar menuBar1;
	
	public Menubar() {
		// TODO Auto-generated constructor stub
		menuBar1 = new JMenuBar();
		menuBar1.setBackground(Color.CYAN);
		JMenu file = new JMenu("파일");
		JMenu save = new JMenu("저장");
		JMenu see = new JMenu("보기");

		JMenuItem biggerItem = new JMenuItem("확대");
		
		
		
		menuBar1.add(file);
		menuBar1.add(save);
		menuBar1.add(see);
		see.add(biggerItem);
	}

}
