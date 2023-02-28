package view;

import javax.swing.JTabbedPane;

import event.CanvasEvent;
import event.Textarea;

public class CanvasGroup extends JTabbedPane{
	public CanvasGroup() {
		Canvas canvas = new CanvasEvent(); 	//CanvaseEvent가 Canvas를 상속하기 때문에 다형성을 이용하여 객체 생성 
		Textarea textarea = new Textarea();
		
		this.add("그림판",canvas.getPanel());
		this.add("텍스트",textarea);
	}
}
