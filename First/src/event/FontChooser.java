package event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class FontChooser extends JFrame implements MouseListener{
	public String[] fonts = {"궁서","돋음","이텔릭"}; //폰트 목록들
	public JList fontJList = new JList(fonts); // 폰특 목록들 만든 리스트
	public JLabel fontJLabel = new JLabel(); // 폰트 적용 예시를 보여줄 텍스트 값
	Font font = new Font("궁서",Font.BOLD,20); // 궁서체 폰트
	public FontChooser() {
		Font bold = new Font("궁서",Font.BOLD,20);
		
		fontJList.addMouseListener(this);
		
		fontJLabel.setText("가나다라마바사");
		
		this.setLayout(new FlowLayout());
		this.add(fontJList);
		this.getContentPane().add(fontJLabel);
		
		this.setVisible(true);
		this.setSize(600,300);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(fontJList.getSelectedValue().equals("궁서")) {
			fontJLabel.setFont(font);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
