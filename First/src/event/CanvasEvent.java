package event;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.Canvas;

public class CanvasEvent extends Canvas implements MouseListener{
	
	 
	Draw draw = new Draw();
	
	int x;
	int y;
	int x1;
	int y1;

	public CanvasEvent() {
		super();
//		toolButtons[0] = new JButton("새 종이");
//		toolButtons[1] = new JButton("직선");
//		toolButtons[2] = new JButton("삼각형");
//		toolButtons[3] = new JButton("사각형");
//		toolButtons[4] = new JButton("원");
//		toolButtons[5] = new JButton("지우기");
//		for(int i = 0; i<toolButtons.length; i++) {
//			toolButtons[i].addMouseListener(this);
//		}
		panel.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {	
		System.out.println(Buttons.buttonValue);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.x1 = e.getX();
		this.y1 = e.getY();
		draw.drawInfo(x, y,x1,y1);
		Graphics graphics  = panel.getGraphics(); //그래픽 객체 얻어오는 방법
		if(Buttons.buttonValue.equals("직선")) {
			draw.paint(graphics);
		}
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
