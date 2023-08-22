package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MainProgram extends JFrame implements ActionListener {
	private JTextArea ja_Nhap, ja_KetQua;
	private JLabel jlb1, jlb2;
	private JButton jbt1, jbt2, jbt3, jbt4, jbt5, jbt6, jbt7, jbt8, jbt9, jbt10, jbt11, jbt12, jbt13, jbt14, jbt15,
			jbt16, jbt17, jbt18, jbt19, jbt20, jbt_Exit;

	public MainProgram() {

		this.setTitle("My Swing App");
		this.setSize(500, 590);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Border bor = BorderFactory.createLineBorder(Color.lightGray);
		Font font = new Font("Times News Roman", Font.ROMAN_BASELINE, 20);
		// p1
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBorder(bor);
		jlb1 = new JLabel("Nhập chuỗi");
		jlb1.setFont(font);
		ja_Nhap = new JTextArea(12, 12);

		add(p1);
		p1.add(jlb1);
		p1.add(ja_Nhap);
		// p2
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		jlb2 = new JLabel("  Kết quả    ");
		jlb2.setFont(font);
		ja_KetQua = new JTextArea(12, 12);

		add(p2);
		p2.add(jlb2);
		p2.add(ja_KetQua);
		JPanel p3 = new JPanel();
		p3.setBorder(bor);
		p3.setLayout(new GridLayout(4, 4));
		jbt1 = new JButton("1");
		p3.add(jbt1);
		jbt2 = new JButton("2");
		p3.add(jbt2);
		jbt3 = new JButton("3");
		p3.add(jbt3);
		jbt4 = new JButton("4");
		p3.add(jbt4);
		jbt5 = new JButton("5");
		p3.add(jbt5);
		jbt6 = new JButton("6");
		p3.add(jbt6);
		jbt7 = new JButton("7");
		p3.add(jbt7);
		jbt8 = new JButton("8");
		p3.add(jbt8);
		jbt9 = new JButton("9");
		p3.add(jbt9);
		jbt10 = new JButton("10");
		p3.add(jbt10);
		jbt11 = new JButton("11");
		p3.add(jbt11);
		jbt12 = new JButton("12");
		p3.add(jbt12);
		jbt13 = new JButton("13");
		p3.add(jbt13);
		jbt14 = new JButton("14");
		p3.add(jbt14);
		jbt15 = new JButton("15");
		p3.add(jbt15);
		jbt16 = new JButton("16");
		p3.add(jbt16);
		jbt17 = new JButton("17");
		p3.add(jbt17);
		jbt18 = new JButton("18");
		p3.add(jbt18);
		jbt19 = new JButton("19");
		p3.add(jbt19);
		jbt20 = new JButton("20");
		p3.add(jbt20);
		add(p3);

		JPanel p4 = new JPanel(new GridLayout(1, 2));
		p4.setBorder(bor);
		p4.setFont(font);
		jbt_Exit = new JButton("Exit");
		jbt_Exit.setFont(font);
		p4.add(jbt_Exit);
		add(p4);

		this.setLayout(new BorderLayout());
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.WEST);
		this.add(p3, BorderLayout.SOUTH);
		this.add(p4, BorderLayout.EAST);

		this.setVisible(true);

		jbt_Exit.addActionListener(this);
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		jbt5.addActionListener(this);
		jbt6.addActionListener(this);
		jbt7.addActionListener(this);
		jbt8.addActionListener(this);
		jbt9.addActionListener(this);
		jbt10.addActionListener(this);
		jbt11.addActionListener(this);
		jbt12.addActionListener(this);
		jbt13.addActionListener(this);
		jbt14.addActionListener(this);
		jbt15.addActionListener(this);
		jbt16.addActionListener(this);
		jbt17.addActionListener(this);
		jbt18.addActionListener(this);
		jbt19.addActionListener(this);
		jbt20.addActionListener(this);

	}

	public static void main(String[] args) {
		new MainProgram();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt_Exit) {
			System.exit(0);
		} else if (e.getSource() == jbt1) {
			String input1 = ja_Nhap.getText();
			String output = Ex1.reverseString(input1);
			ja_KetQua.setText(output);
		} else if (e.getSource() == jbt2) {
			String input1 = ja_Nhap.getText();
			boolean output = Ex2.isPalindrome(input1);
			ja_KetQua.setText(String.valueOf(output));

		} else if (e.getSource() == jbt3) {
			String input1 = ja_Nhap.getText();
			int[] output = Ex3.countTheNumber(input1);
			ja_KetQua.setText("Số nguyên âm : " + output[0] + "\nSố phụ âm : " + output[1]);
		} else if (e.getSource() == jbt4) {
			String input1 = ja_Nhap.getText();
			String output = Ex4.findLargestWord(input1);
			ja_KetQua.setText("the largest word is :" + output);
		} else if (e.getSource() == jbt5) {
			String input1 = ja_Nhap.getText();
			// lớp JOptionPane của Java Swing để hiển thị một hộp thoại và trả về chuỗi được
			// nhập.
			String input2 = JOptionPane.showInputDialog("Enter second string:");
			boolean isAnagram = Ex5.isAnagram(input1, input2);
			if (isAnagram) {
				ja_KetQua.setText("Input strings are anagrams.");
			} else {
				ja_KetQua.setText("Input strings are not anagrams.");
			}
		} else if (e.getSource() == jbt6) {
			String input1 = ja_Nhap.getText();
			String output = Ex6.removeSpaces(input1);
			ja_KetQua.setText(String.valueOf(output));
		} else if (e.getSource() == jbt7) {
			String input1 = ja_Nhap.getText();
			char output2 = Ex7.findTheSecondMostFrequentCharacter(input1);
			ja_KetQua.setText(String.valueOf(output2));

		} else if (e.getSource() == jbt8) {
			String input1 = ja_Nhap.getText();
			String output = Ex8.removeFirstAndLastChar(input1);
			ja_KetQua.setText(String.valueOf(output));
		} else if (e.getSource() == jbt9) {
			String input1 = ja_Nhap.getText();
			int output = Ex9.countWord(input1);
			ja_KetQua.setText(" Number of Word is : \n" + String.valueOf(output));
		} else if (e.getSource() == jbt10) {
			String input1 = ja_Nhap.getText();
			boolean checkOfString = Ex10.checkStringOnlyDigits(input1);
			ja_KetQua.setText("Check Of String is Only Digits : \n" + checkOfString);
		} else if (e.getSource() == jbt11) {
			String input1 = ja_Nhap.getText();
			int[] output = Ex3.countTheNumber(input1);
			ja_KetQua.setText("Số phụ âm : " + output[1]);

		} else if (e.getSource() == jbt12) {
			String input1 = ja_Nhap.getText();
			String output = Ex12.reverseString(input1);
			ja_KetQua.setText(String.valueOf(output));
		} else if (e.getSource() == jbt13) {
			String input1 = ja_Nhap.getText();
			String input2 = JOptionPane.showInputDialog("Enter second string:");
			boolean isAnagramOfEachOver = Ex13.isAnagramOfEachOver(input1, input2);
			if (isAnagramOfEachOver) {
				ja_KetQua.setText("Input strings are anagrams.");
			} else {
				ja_KetQua.setText("Input strings are not anagrams.");
			}
		} else if (e.getSource() == jbt14) {
			String input1 = ja_Nhap.getText();
			String output = Ex14.removeAllSpaces(input1);
			ja_KetQua.setText("A new String is : \\n" + String.valueOf(output));
		} else if (e.getSource() == jbt15) {
			String input1 = ja_Nhap.getText();
			String output = Ex15.capitalizeWords(input1);
			ja_KetQua.setText("A new String is : \n" + String.valueOf(output));
		} else if (e.getSource() == jbt16) {
			String input1 = ja_Nhap.getText();
			boolean isPalindrome = Ex16.isPalindrome(input1);
			if (isPalindrome) {
				ja_KetQua.setText("it is a palindrome : \n" + isPalindrome);
			} else {
				ja_KetQua.setText("it is not a palindrome : \n" + isPalindrome);
			}
		} else if (e.getSource() == jbt17) {
			String input1 = ja_Nhap.getText();
			List<String> output = Ex17.getAllSubstrings(input1);
			ja_KetQua.setText("List is : \n" + String.valueOf(output));
		} else if (e.getSource() == jbt18) {
			String input1 = ja_Nhap.getText();
			String output = Ex18.reverseString(input1);
			ja_KetQua.setText("List is : \n" + String.valueOf(output));
		} else if (e.getSource() == jbt19) {
			String input1 = ja_Nhap.getText();
			String input2 = ja_Nhap.getText();
			String output = Ex19.concatenateStrings(input1, input2);
			ja_KetQua.setText("List is : \n" + String.valueOf(output));
		} else if (e.getSource() == jbt20) {
			String input1 = ja_Nhap.getText();
			String output = Ex20.removeSpecialChars(input1);
			ja_KetQua.setText("List is : \n" + String.valueOf(output));
		}
	}

}
