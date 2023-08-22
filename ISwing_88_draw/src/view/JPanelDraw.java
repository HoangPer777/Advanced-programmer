package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel{

	public JPanelDraw() {
		this.setBackground(Color.white);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawLine(15, 15, 50, 150); // đường thẳng
 // x1 x2 y1 y2 lần lượt là tọa đồ của điểm bắt đầu bà kết thúc 
		
		g.setColor(Color.blue);
		g.drawOval(255, 255, 50, 50);
// lll tọa độ tâm và kích thước cạnh lớn cạnh bé của đường elip
		
		g.setColor(Color.green);
		g.drawRect(45, 150, 30, 90); // hình chữ nhật lll tọa độ tâm và kích thước chiều dài và chiều rộng
		
		g.setColor(Color.pink);
		g.fillOval(400, 300, 50, 50); // hình elip có đầy ở bên trong
		
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(100, 100, 150, 150); // hình chữ nhật đầy ở bên trong
		
		g.setColor(Color.CYAN);
		g.drawString("HELLO TITV", 250, 250); // nội dung và tọa độ
		
	}
}