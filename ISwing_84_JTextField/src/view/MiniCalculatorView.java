package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel miniCalculatorModel; // tạo ra để gọi model chứa dữ liệu và các phowgn thức tính toans
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;

	public MiniCalculatorView() throws HeadlessException {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Font font = new Font("Arial", Font.BOLD, 40); // tạo cái font

		JLabel jLabel_firstValue = new JLabel("1st Value"); // tạo box 1
		jLabel_firstValue.setFont(font); // add font đã tạo ở trên

		JLabel jLabel_secondValue = new JLabel("2nd Value"); // tạo box 2
		jLabel_secondValue.setFont(font);

		JLabel jLabel_answer = new JLabel("Answer"); // tạo box hiển thị kết quả
		jLabel_answer.setFont(font);

		jTextField_firstValue = new JTextField(50); // tạo một chỗ đễ nhập văn bản độ rộng là 50
		jTextField_firstValue.setFont(font); // gắn font chữ
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);

		JPanel jPanelIO = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 10, 10)); // 3 dòng 2 cột. khoảng cách dòng cột là 10 10
		jPanelIO.add(jLabel_firstValue);
		jPanelIO.add(jTextField_firstValue);
		jPanelIO.add(jLabel_secondValue);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(jTextField_answer);

		MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
		JButton jButton_plus = new JButton("+"); // tạo nút
		jButton_plus.setFont(font); // set font
		jButton_plus.addActionListener(miniCalculatorListener); // tạo hành động

		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(miniCalculatorListener);

		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(miniCalculatorListener);

		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(miniCalculatorListener);

		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(miniCalculatorListener);

		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorListener);

		JPanel jPanelButtons = new JPanel();
		jPanelButtons.setLayout(new GridLayout(2, 3));
		jPanelButtons.add(jButton_plus);
		jPanelButtons.add(jButton_minus);
		jPanelButtons.add(jButton_multiply);
		jPanelButtons.add(jButton_divide);
		jPanelButtons.add(jButton_pow);
		jPanelButtons.add(jButton_mod);

		this.setLayout(new BorderLayout(10, 10));
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanelButtons, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void plus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.plus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void minus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.minus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void multiply() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.multiply();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void divide() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void pow() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.pow();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void mod() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
}