package event;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import view.Canvas;

public class Draw extends Canvas{
	public Draw() {
		super();
		// TODO Auto-generated constructor stub
	}

	int x;
	int y;
	int x1;
	int y1;
		
	public void drawInfo(int x, int y, int x1, int y1) { //그림 그리기 위한 위치값들 저장
		this.x =x ;
		this.y =y;
		this.x1 =x1;
		this.y1  =y1;
//		System.out.println("전달값:"+this.x);
//		System.out.println("전달값:"+this.y);
	}
		
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(ColorChooser.color);
		g2.setStroke(new BasicStroke(Thickness.num));
		
		switch (Buttons.buttonValue) {
		case "펜":
			g2.drawLine(x, y, x1, y1);			
			break;
		case "직선":
			g2.drawLine(x, y, x1, y1);			
			break;
		case "사각형":
			g2.drawRect(x, y, x1, y1);
			break;
		case "원":
			g2.drawOval(x, y, x1, y1);
			break;
		case "지우개":
			g2.setColor(Color.white);
			g2.drawLine(x, y, x1, y1);
		
		default:
			break;
		}
		g2.dispose();
	}
	

	
}
