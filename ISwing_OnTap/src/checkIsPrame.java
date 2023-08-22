import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class checkIsPrame extends JFrame{
	public checkIsPrame() {
		setTitle("check is prame");
		setSize(600, 300);
		setLocationRelativeTo(null);
		
		JPanel jpanel_head = new JPanel();
		jpanel_head.setLayout(new BorderLayout());
		
		JPanel Jpanel_button = new JPanel();
		Jpanel_button.setLayout(new GridLayout(1,1));
		JLabel label = new JLabel("Nhap so can check!");
		JTextField text = new JTextField(50);
		JButton checkbtn = new JButton("Check please!");
		JLabel resultbl = new JLabel("Ket qua");
		
		jpanel_head.add(label, BorderLayout.NORTH);
		jpanel_head.add(text, BorderLayout.CENTER);
		Jpanel_button.add(checkbtn);
		Jpanel_button.add(resultbl);

		this.setLayout(new BorderLayout());
		this.add(jpanel_head , BorderLayout.NORTH);
		this.add(Jpanel_button , BorderLayout.CENTER);
		
		checkbtn.addActionListener(e -> {
			String text_ = text.getText().trim();
			
			try {
				int num = Integer.parseInt(text_);
				if(Isprime.laNguyenTo(num)) {
					resultbl.setText("La so nguyen to!");
				}else {
					resultbl.setText("ko la so NT");
				}
			} catch (Exception e2) {
				resultbl.setText("Loi!!!!!!!! cu phap "+"Nhap lai so: ");
			}
			
			
		});
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new checkIsPrame();
	}
}
