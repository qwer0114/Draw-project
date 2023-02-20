package event;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.Canvas;

public class CanvasEvent extends Canvas implements MouseListener,MouseMotionListener{
	
	 
	Draw draw = new Draw();
	
	int x;
	int y;
	int x1;
	int y1;
	int width;
	int heigth;
	int minx;
	int miny;

	public CanvasEvent() {
		super();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.x = e.getX(); // 초기 x 위치값 
		this.y = e.getY(); // 초기 y 위치값 
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(Buttons.buttonValue.equals("직선")) {
			Graphics graphics  = panel.getGraphics(); //그래픽 객체 얻어오는 방법
			draw.drawInfo(x, y,x1,y1);
			draw.paint(graphics); //직선일때 그려지는 그림
		}else if(Buttons.buttonValue.equals("사각형")) {
			Graphics graphics  = panel.getGraphics(); //그래픽 객체 얻어오는 방법
			draw.drawInfo(minx,miny,width,heigth);
			draw.paintRect(graphics); //직선일때 그려지는 그림
			System.out.println("사각");
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

	@Override
	public void mouseDragged(MouseEvent e) {
		this.x1 = e.getX();
		this.y1 = e.getY();
		width = Math.abs(x1-x);
		heigth = Math.abs(y1-y);
		minx = Math.min(x, x1);
		miny = Math.min(y, y1);

		Graphics graphics  = panel.getGraphics(); //그래픽 객체 얻어오는 방법
		if(Buttons.buttonValue.equals("펜")) {
			draw.paint(graphics); //직선일때 그려지는 그림
			draw.drawInfo(x, y,x1,y1);
			this.x=this.x1; // 연속적으로 그림이 그려지기 위해서는 초기 x 값과 나중 x 값이 같아야함 
			this.y=this.y1;
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
