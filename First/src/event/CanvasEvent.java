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
		Graphics graphics  = panel.getGraphics(); //그래픽 객체 얻어오는 방법
		
		switch (Buttons.buttonValue){
		case "직선":
			draw.drawInfo(x, y,x1,y1);
			draw.paint(graphics); //직선일때 그려지는 그림
			break;
		case "사각형":
			draw.drawInfo(minx,miny,width,heigth);
			draw.paint(graphics); //사각형 그리기 
			break;
		case "원":
			draw.drawInfo(minx,miny,width,heigth);
			draw.paint(graphics); //사각형 그리기 
			break;
		default:
			break;
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
		width = Math.abs(x1-x); // 아래에서 위로 드래그 할때 음의 값이 나올 수 있으므로 절댓값 붙임 
		heigth = Math.abs(y1-y); // 높이는 경우에 따라 음의 값이 나올 수 있으므로 절댓값 붙임 
		minx = Math.min(x, x1); // 사각형 시작점 x 좌표
		miny = Math.min(y, y1); // 사각형 시작  y 좌표
		Graphics graphics  = panel.getGraphics(); //그래픽 객체 얻어오는 방법
		switch (Buttons.buttonValue) {
		case "펜":
			draw.drawInfo(x, y,x1,y1);
			draw.paint(graphics); //직선일때 그려지는 그림
			this.x=this.x1; // 연속적으로 그림이 그려지기 위해서는 초기 x 값과 나중 x 값이 같아야함 
			this.y=this.y1;
			break;
		case "지우개":
			draw.drawInfo(x, y,x1,y1);
			draw.paint(graphics); //직선일때 그려지는 그림
			this.x=this.x1; // 연속적으로 그림이 그려지기 위해서는 초기 x 값과 나중 x 값이 같아야함 
			this.y=this.y1;
			break;
		default:
			break;
		}
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
