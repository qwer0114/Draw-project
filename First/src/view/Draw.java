package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Draw extends Canvas implements MouseListener{
	int x;
	int y;
	int x1;
	int y1;
	public Draw() {
		super();
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
		
	//	System.out.println("Click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.x = e.getX();
		this.y = e.getY();
		
		System.out.println("초기 값 X:"+this.x);
		System.out.println("초기 값 Y:"+this.y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.x1 = e.getX();
		this.y1 = e.getY();
		
		System.out.println("초기 값 X:"+this.x1);
		System.out.println("초기 값 Y:"+this.y1);
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
