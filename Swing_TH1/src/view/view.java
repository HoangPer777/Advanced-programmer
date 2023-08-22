package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class view extends JFrame{
	private JButton jButton_clickme;
	private JButton JButton_reset;
	
	public view() {
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Điều Khiển");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jButton_clickme = new JButton("click me");
		
		JButton_reset = new JButton("reset");
		
		JLabel label = new JLabel("Đếm");
		
		JPanel jPanel = new JPanel();
//		
		jPanel.add(jButton_clickme);
		jPanel.add(JButton_reset);
		JPanel jPanel2 = new JPanel();
		jPanel2.add(label);
		
		this.setLayout(new FlowLayout());
		this.add(jPanel);
		this.add(jPanel2);
		
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		}
}
