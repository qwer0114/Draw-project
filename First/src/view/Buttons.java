package view;

import java.awt.Color;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Buttons implements MouseListener{
	JButton[] toolButtons = new JButton[5];
	Canvas canvas = new Canvas();
//	JButton newPaperBtn = new JButton("새 종이"); 
//	JButton tryBtn = new JButton("삼각형"); 
//	JButton recBtn = new JButton("사각형"); 
//	JButton cirBtn = new JButton("원"); 
//	JButton eraseBtn = new JButton("지우기"); 

	public Buttons() {
		toolButtons[0] = new JButton("새 종이");
		toolButtons[1] = new JButton("삼각형");
		toolButtons[2] = new JButton("사각형");
		toolButtons[3] = new JButton("원");
		toolButtons[4] = new JButton("지우기");
		
		for(int i = 0; i<toolButtons.length; i++) {
			toolButtons[i].addMouseListener(this);
		}

	}

@Override
public void mouseClicked(MouseEvent e) {
	if(e.getSource()== toolButtons[0]) {
		System.out.println("새 종이");
		System.out.println(e.getX());
		System.out.println(e.getY());
	}
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
