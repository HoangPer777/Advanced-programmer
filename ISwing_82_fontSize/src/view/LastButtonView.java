package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame{
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;
	public LastButtonView() { // constructor
		this.lastButtonModel = new LastButtonModel();
		
		this.init();
	}
	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		JPanel jpanel_Center = new JPanel(); // chưa 4 cái nút
		jpanel_Center.setLayout(new GridLayout(2,2)); // 4 cái nút dạng lưới 
		
		// Tao listener
		LastButtonListener lastButtonListener = new LastButtonListener(this);
		
		// Tao font chữ
		Font font = new Font("Arial", Font.BOLD, 40);
		
		// tạo các button
		JButton jButton_1 = new JButton("1");
		// Gan font chu
		jButton_1.setFont(font);
		jButton_1.addActionListener(lastButtonListener);
		
		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(lastButtonListener);
		
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(lastButtonListener);
		
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(lastButtonListener);
		
		//thêm các button vào center
		jpanel_Center.add(jButton_1);
		jpanel_Center.add(jButton_2);
		jpanel_Center.add(jButton_3);
		jpanel_Center.add(jButton_4);
		
		JPanel jpanel_Footer = new JPanel(); // tạo footer
		jLabel = new JLabel("------");
		jLabel.setFont(font);
		jpanel_Footer.add(jLabel);
		
		
		this.setLayout(new BorderLayout());// set layout cho cửa sổ
		this.add(jpanel_Center, BorderLayout.CENTER); // thêm cái center vào layout
		this.add(jpanel_Footer, BorderLayout.SOUTH); // thêm cái footer vào trong layout
		this.setVisible(true); // chạy chương trình.
	} 
	
	public void changeTo_1() {
		this.lastButtonModel.setValue_1(); // để biến giá trị của button value về giá trị là 1
		jLabel.setText("Last button: "+this.lastButtonModel.getValue()); // gọi cái value hiện tại của nó ra để xuất ra
	}
	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
}