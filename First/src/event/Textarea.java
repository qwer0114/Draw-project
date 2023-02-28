package event;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import view.Canvas;

public class Textarea extends JTextArea{	

	
	public Textarea() {
		JScrollPane scrollPane = new JScrollPane(this);
		this.setBackground(Color.WHITE);
		Font f1 = new Font("궁서",Font.BOLD,20);
		this.setFont(f1);
		
		
		
	}

}
