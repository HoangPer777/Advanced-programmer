package bai3;


import javax.swing.*;
public class PrimeNumberCheck extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Isprime model;
	public  PrimeNumberCheck(Isprime model) {
		this.model = model;
		setTitle("Prime Number Checker");
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		panel.add(new JLabel("Nhập một số nguyên"));
		
		JTextField inputTxt = new JTextField(20);
		
		JButton checkBtn = new JButton("Kiểm tra");
		
		JLabel resultLbl = new JLabel("");
		
		panel.add(inputTxt);
		panel.add(checkBtn);
		panel.add(resultLbl);
		checkBtn.addActionListener(e->{
			String text = inputTxt.getText().trim();
			try {
				int num = Integer.parseInt(text);
				if (Isprime.laNguyenTo(num)) {
					resultLbl.setText("Số " + num + " là số nguyên tố");
				} else {
					resultLbl.setText("Số " + num + " không phải là số nguyên tố");
				}
			} catch (NumberFormatException ex) {
				resultLbl.setText("LỖI! " + text + "không phải là số");
			}
		});
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PrimeNumberCheck(new Isprime());
	}
}
