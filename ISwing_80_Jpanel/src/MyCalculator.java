import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator"); // tiêu đề
		this.setSize(300, 300); // kích thước cửa sổ
		this.setLocationRelativeTo(null); // căn giữa layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dừng chương trình khi đóng cửa sổ

		/*
		 * chia layout làm 2 phần phần một là head phần hai là botton 
		 * 
		 */
		JTextField jTextField = new JTextField(50); // ra cái ô màng hình của máy tính
		JPanel jPanel_head = new JPanel(); // tạo ra phần một: head
		jPanel_head.setLayout(new BorderLayout()); // thiết lập layout là border
		jPanel_head.add(jTextField, BorderLayout.CENTER); // thêm head vào chương trình với định dạng là border

		// tạo ra các button
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");
		JPanel jPanel_buttons = new JPanel();
		
		jPanel_buttons.setLayout(new GridLayout(5, 3)); // set các button kiểu grid(dạng lưới) kích thước 5x3
		//thêm các buttons vào cửa sổ
		jPanel_buttons.add(jButton_0);
		jPanel_buttons.add(jButton_1);
		jPanel_buttons.add(jButton_2);
		jPanel_buttons.add(jButton_3);
		jPanel_buttons.add(jButton_4);
		jPanel_buttons.add(jButton_5);
		jPanel_buttons.add(jButton_6);
		jPanel_buttons.add(jButton_7);
		jPanel_buttons.add(jButton_8);
		jPanel_buttons.add(jButton_9);
		jPanel_buttons.add(jButton_cong);
		jPanel_buttons.add(jButton_tru);
		jPanel_buttons.add(jButton_nhan);
		jPanel_buttons.add(jButton_chia);
		jPanel_buttons.add(jButton_bang);

		this.setLayout(new BorderLayout()); // tạo cửa sổ dạng border gồm 2 phần 
		this.add(jPanel_head, BorderLayout.NORTH); // thêm phần thứ nhất head vào phía bắc của layOut
		this.add(jPanel_buttons, BorderLayout.CENTER); // thêm phần thứ hai buttons vào phía nam của layOut

		this.setVisible(true); // xuất cửa số ra màng hình
	}

	public static void main(String[] args) {
		try {
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

			// các look and feel khác
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}