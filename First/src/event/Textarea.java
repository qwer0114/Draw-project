package event;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import view.Canvas;

public class Textarea extends JTextArea{	

	
	public Textarea() {
		JScrollPane scrollPane = new JScrollPane(this);
		this.setBackground(Color.white);
		System.out.println("TEXT");
		
	}

}
