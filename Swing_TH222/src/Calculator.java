import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame {
	String text = "";
	JLabel displayLbl;

	 double operand = 0;
	 String operator = "";
	    
	public Calculator() {
		setTitle("Calculator");

		JPanel displayPanel = createDisplayPanel();
		JPanel keyPanel = createKeyPanel();

		getContentPane().add(displayPanel, BorderLayout.NORTH);
		getContentPane().add(keyPanel, BorderLayout.CENTER);

//		setSize(600,400);
		pack();
		setResizable(false); // ngăn chặn thay đổi kích thước của cửa sổ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JPanel createDisplayPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		displayLbl = new JLabel("0", JLabel.RIGHT); // ko có tác dụng đối với dạng layout này
		panel.setBackground(Color.GREEN);
		panel.add(displayLbl);
		return panel;
	}

	private JPanel createKeyPanel() {
		ActionListener numAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// nhiều dấu chấm
				String s = e.getActionCommand();
				if (s.equals(".") && (text.indexOf(".") > -1)) {
					return;	
				}
				
				// số 0 vô nghĩa ở đầu tiên
				text += s;
				if (s.equals("0") && text.length() > 1) {
					if (!(text.charAt(0) == '0' && text.charAt(1) == '.')) {
						text = text.substring(1);
					}
				}
				displayLbl.setText(text);
			}
		};
		ActionListener funAction = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String s = e.getActionCommand();
//		        text += s;
		        if (s.equals("CE")) {
//		        	text = "0";
					displayLbl.setText(text);
					text = " ";
				}
		        
		        switch (s) {
		            case "+":
		            case "-":
		            case "*":
		                operand = Double.parseDouble(text);
		                operator = s;
		                text = " ";
//		                text += s;
		                break;
		            case "=":
		                double secondOperand = Double.parseDouble(text);
		                switch (operator) {
		                    case "+":
		                        operand += secondOperand;
		                        break;
		                    case "-":
		                        operand -= secondOperand;
		                        break;
		                    case "*":
		                        operand *= secondOperand;
		                        break;
		                }
		                text = Double.toString(operand);
		                break;
		        }
		        displayLbl.setText(text);
		    }
		};

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4, 10, 10));

		panel.add(createKeyButton("9", numAction));
		panel.add(createKeyButton("8", numAction));
		panel.add(createKeyButton("7", numAction));
		panel.add(createKeyButton("CE", funAction));

		panel.add(createKeyButton("6", numAction));
		panel.add(createKeyButton("5", numAction));
		panel.add(createKeyButton("4", numAction));
		panel.add(createKeyButton("+", funAction));

		panel.add(createKeyButton("3", numAction));
		panel.add(createKeyButton("2", numAction));
		panel.add(createKeyButton("1", numAction));
		panel.add(createKeyButton("-", funAction));

		panel.add(createKeyButton("0", numAction));
		panel.add(createKeyButton(".", numAction));
		panel.add(createKeyButton("=", funAction));
		panel.add(createKeyButton("*", funAction));

		return panel;
	}

	// method tạo ra nút gồm tên nút và hành động
	private JButton createKeyButton(String text, ActionListener action) {
		JButton button = new JButton(text);
		button.setActionCommand(text); // nhận biết vừa mới nhấn nút nào
		button.addActionListener(action); // sử lý hành động của cái nút đó
		button.setPreferredSize(new Dimension(70, 50)); // kích thước của cái nút
		return button;
	}

	public static void main(String[] args) {
		new Calculator();

	}

}