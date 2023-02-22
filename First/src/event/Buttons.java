package event;

import java.awt.Color;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import view.Canvas;

public class Buttons implements MouseListener{
	public JButton[] toolButtons = new JButton[7];
	Canvas canvas = new Canvas();
	
	static String buttonValue;

	
	 public Buttons() {
		super();
		Buttons.buttonValue = "펜";
		toolButtons[0] = new JButton("새 종이");
		toolButtons[1] = new JButton("펜");
		toolButtons[2] = new JButton("직선");
		toolButtons[3] = new JButton("사각형");
		toolButtons[4] = new JButton("원");
		toolButtons[5] = new JButton("지우개");
		toolButtons[6] = new JButton("색상");
		ImageIcon imageIcon;
		for(int i = 0; i<toolButtons.length; i++) {
			imageIcon = new ImageIcon("icon/icon"+i+".png");
			toolButtons[i].setIcon(imageIcon); //= new JButton(new ImageIcon("icon/icon"+i+".png"));
			toolButtons[i].setBorderPainted(false);
			toolButtons[i].addMouseListener(this);
		}

	}


@Override
public void mouseClicked(MouseEvent e) {
	if(e.getSource()==toolButtons[0]) {
		Canvas canvas = new Canvas();
		canvas.getPanel();
	}else if(e.getSource() == toolButtons[1]) { //펜 일때 
		Buttons.buttonValue = toolButtons[1].getText();
	}else if(e.getSource() == toolButtons[2]) { // 직선일때 
		Buttons.buttonValue = toolButtons[2].getText();
	}else if(e.getSource() == toolButtons[3]) {
		Buttons.buttonValue = toolButtons[3].getText();
	}else if(e.getSource() == toolButtons[4]) {
		Buttons.buttonValue = toolButtons[4].getText();
	}else if(e.getSource() == toolButtons[5]) {
		Buttons.buttonValue = toolButtons[5].getText();
	}else if(e.getSource() == toolButtons[6]) {
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
