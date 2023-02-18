package event;

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
		
	public void drawInfo(int x, int y, int x1, int y1) {
		this.x =x ;
		this.y =y;
		this.x1 =x1;
		this.y1  =y1;
//		System.out.println("전달값:"+this.x);
//		System.out.println("전달값:"+this.y);
	}
		
	public void paint(Graphics g) {
		g.drawLine(x, y, x1, y1);
	}
	
	
}
