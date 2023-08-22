import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drawApp extends JFrame{
	String status = "status: ";
	public drawApp() {
		setTitle("Shapes drawing App");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jpanel_N = new JPanel();
		JPanel jpanel_C = new JPanel();
		JPanel jpanel_S = new JPanel();
		
		JLabel status_lbl = new JLabel(status , JLabel.LEFT);
		jpanel_S.setLayout(new FlowLayout(FlowLayout.LEFT));
		jpanel_S.add(status_lbl);
		
		JButton road_btn = new JButton();
		JButton square_btn = new JButton();
		JButton circle_btn = new JButton();
		
		JButton color_btn = new JButton();
		color_btn.setLayout(new GridLayout(2, 3) );
		JButton R = new JButton();
		R.setBackground(Color.red);
		JButton G = new JButton();
		G.setBackground(Color.GREEN);
		JButton B = new JButton();
		B.setBackground(Color.BLUE);
		JButton BK = new JButton();
		BK.setBackground(Color.BLACK);
		JButton W = new JButton();
		W.setBackground(Color.WHITE);
		JButton Y = new JButton();
		Y.setBackground(Color.YELLOW);
		
		class draw extends JButton{
//			public Mouse
			public void painComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLACK);
				g.drawLine(0, 0, getWidth(), getHeight());
			}
		}
		
		
		jpanel_N.add(road_btn);
		jpanel_N.add(square_btn);
		jpanel_N.add(circle_btn);
		jpanel_N.add(color_btn);
		
		color_btn.add(R);
		color_btn.add(G);
		color_btn.add(B);
		color_btn.add(BK);
		color_btn.add(W);
		color_btn.add(Y);
		
		setLayout(new BorderLayout());
		this.add(jpanel_N , BorderLayout.NORTH);
		this.add(jpanel_C, BorderLayout.CENTER);
		this.add(jpanel_S, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new drawApp();
	}
	
}
