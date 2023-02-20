package event;

import java.awt.Color;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import view.Canvas;

public class Buttons implements MouseListener{
	public JButton[] toolButtons = new JButton[8];
	Canvas canvas = new Canvas();
	
	static String buttonValue;

	

//	JButton newPaperBtn = new JButton("새 종이"); 
//	JButton tryBtn = new JButton("삼각형"); 
//	JButton recBtn = new JButton("사각형"); 
//	JButton cirBtn = new JButton("원"); 
//	JButton eraseBtn = new JButton("지우기"); 

	 public Buttons() {
		super();
		Buttons.buttonValue = "펜";
		toolButtons[0] = new JButton("새 종이");
		toolButtons[1] = new JButton("펜");
		toolButtons[2] = new JButton("직선");
		toolButtons[3] = new JButton("삼각형");
		toolButtons[4] = new JButton("사각형");
		toolButtons[5] = new JButton("원");
		toolButtons[6] = new JButton("지우기");
		toolButtons[7] = new JButton("색상");
		
		for(int i = 0; i<toolButtons.length; i++) {
			toolButtons[i].addMouseListener(this);
		}

	}


@Override
public void mouseClicked(MouseEvent e) {
	if(e.getSource() == toolButtons[1]) { //펜 일때 
		Buttons.buttonValue = toolButtons[1].getText();
	}else if(e.getSource() == toolButtons[2]) { // 직선일때 
		Buttons.buttonValue = toolButtons[2].getText();
	}else if(e.getSource() == toolButtons[4]) {
		Buttons.buttonValue = toolButtons[4].getText();
	}else if(e.getSource() == toolButtons[7]) {
		ColorChooser colorChooser = new ColorChooser();
	}
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	
	
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
