package event;

import java.awt.Color;
import java.awt.Graphics;

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
		g.setColor(ColorChooser.color);
		g.drawLine(x, y, x1, y1);
		g.dispose();
	}
	
	public void paintRect(Graphics g) {
		g.setColor(ColorChooser.color);
		g.drawRect(x, y, x1, y1);
		g.dispose();
	}
	
	
}
