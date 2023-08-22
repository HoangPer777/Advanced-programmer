package Bai1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Counter extends JFrame {
	private static String message = "Số lần click là";
	private int counter;

	public Counter(String title) {
		super(title);
		//
		JButton clickBtn = new JButton("Click me!!");
		JLabel resultLbl = new JLabel(message + " " + counter);
		JButton resetBtn = new JButton("Reset");
		JPanel panel = new JPanel();
		panel.add(clickBtn);
		panel.add(resetBtn);
		panel.add(resultLbl);
		
		clickBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				counter++;
				resultLbl.setText(message +" "+ counter);
			}
		});
		
		resetBtn.addActionListener(e -> {
			counter = 0;
			resultLbl.setText(message + " " + counter);
		});
		getContentPane().add(panel);

		// always like under lines
		setSize(400, 600);
//		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);// setVisible always the last line
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Counter("CounterWindows");
	}

}
