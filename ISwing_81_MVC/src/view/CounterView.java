package view;
// hiển thị các giao diện mà người dùng có thể nhần thấy 
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_up; // khai báo nút up
	private JButton jButton_down; // khai báo nút down
	private JLabel jLabel_value; // phần chính giữa để hiển thị dữ liệu

	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter"); // tạo tiêu đề
		this.setSize(300, 300); // size cửa số
		this.setLocationRelativeTo(null); // vị trí căn giữa
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dừng khi đóng

		ActionListener ac = new CounterListener(this);

		jButton_up = new JButton("UP"); // truyền vào chữ up lên cái button
		jButton_up.addActionListener(ac); // khi mà ng dùng nhấn vào nút up thì nó sẽ truyền đến listener 
//		để quán lý thao tác của cái nút này

		jButton_down = new JButton("DOWN");// truyền vào chữ down lên cái button
		jButton_down.addActionListener(ac);

		jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER); // gắn dữ liệu đc lấy từ value,
//		JLabel.center để cái giá trị value đc căn giữa

		JPanel jPanel = new JPanel(); // tạo cửa sổ
		jPanel.setLayout(new BorderLayout()); //set cái cửa sổ dạng border
		jPanel.add(jButton_up, BorderLayout.WEST); // đưa nút up vào phía đông
		jPanel.add(jLabel_value, BorderLayout.CENTER); // đưa value vào chính giữa
		jPanel.add(jButton_down, BorderLayout.EAST);// đưa nút down vào phía tây

		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER); // thêm cửa sổ cho chương trình chính và set kiểu border
	}

	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}

	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
}