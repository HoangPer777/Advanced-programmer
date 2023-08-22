import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame {
	
//	String data = "0";
	
	public calculator() {
		setTitle("Calculator");
		setSize(300, 400);
		
		JPanel jpanel_top = new JPanel();
		
		JLabel screen = new JLabel("0", JLabel.RIGHT );
		jpanel_top.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpanel_top.add(screen);
		jpanel_top.setBackground(Color.green);
		
		JPanel Jpanel_button = new JPanel();
		Jpanel_button.setLayout(new GridLayout(4 , 4, 10 , 10));
		
		JButton chin_btn = new JButton("9");
		JButton tam_btn = new JButton("8");
		JButton bay_btn = new JButton("7");
		JButton CE_btn = new JButton("CE");
		
		JButton sau_btn = new JButton("6");
		JButton nam_btn = new JButton("5");
		JButton bon_btn = new JButton("4");
		JButton cong_btn = new JButton("+");
		
		JButton ba_btn = new JButton("3");
		JButton hai_btn = new JButton("2");
		JButton mot_btn = new JButton("1");
		JButton tru_btn = new JButton("-");
		
		JButton khong_btn = new JButton("0");
		JButton cham_btn = new JButton(".");
		JButton bang_btn = new JButton("=");
		JButton nhan_btn = new JButton("*");
		
		Jpanel_button.add(chin_btn);
		Jpanel_button.add(tam_btn);
		Jpanel_button.add(bay_btn);
		Jpanel_button.add(CE_btn);
		
		Jpanel_button.add(sau_btn);
		Jpanel_button.add(nam_btn);
		Jpanel_button.add(bon_btn);
		Jpanel_button.add(cong_btn);
		
		Jpanel_button.add(ba_btn);
		Jpanel_button.add(hai_btn);
		Jpanel_button.add(mot_btn);
		Jpanel_button.add(tru_btn);
		
		Jpanel_button.add(khong_btn);
		Jpanel_button.add(cham_btn);
		Jpanel_button.add(bang_btn);
		Jpanel_button.add(nhan_btn);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_top , BorderLayout.NORTH);
		this.add(Jpanel_button , BorderLayout.CENTER);
		
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		
//		setPreferredSize( new Dimension());  // set kich thước của các ô 
//		pack(); // dùng song song với hàm pack để co giản 
//		tam_btn.addActionListener( e -> {
//			screen.setText(data +"8");
//		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		
		
		chin_btn.addActionListener( e -> {
			screen.setText("9");
		});
		
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new calculator();
	}
}
