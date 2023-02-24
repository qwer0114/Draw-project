package view;

import javax.swing.JTabbedPane;

import event.CanvasEvent;
import event.Textarea;

public class CanvasGroup extends JTabbedPane{
	public CanvasGroup() {
		Canvas canvas = new CanvasEvent();
		Textarea textarea = new Textarea();
		
		this.add(canvas.getPanel());
		this.add(textarea);
	}
}
