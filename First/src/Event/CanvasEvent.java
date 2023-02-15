package Event;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import view.Canvas;

public class CanvasEvent extends Canvas implements MouseListener{
	
	 
	Draw draw = new Draw();
	
	int x;
	int y;
	int x1;
	int y1;

	private String value;
	public CanvasEvent() {
		super();
		panel.addMouseListener(this);
	}

	public void buttonValue(String buttonValue) {
		buttonValue = this.value;
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(this.value);
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
		draw.paint(graphics);
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
