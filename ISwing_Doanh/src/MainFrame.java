import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
	JTextField idTField, nameTfield, yearTfield, gradeTfield;
	JTextArea textArea;
	StudentManagement stm = new StudentManagement();
	public MainFrame () {
		setTitle("Quản lí sinh viên");
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Thông tin sinh viên"));
		panel1.setLayout(new GridLayout(4, 2, 10, 10));
		panel1.add(new JLabel("MSSV", JLabel.RIGHT));
		panel1.add(idTField = new JTextField(20));
		panel1.add(new JLabel("Họ và tên", JLabel.RIGHT));
		panel1.add(nameTfield = new JTextField(20));
		panel1.add(new JLabel("Năm sinh", JLabel.RIGHT));
		panel1.add(yearTfield = new JTextField(20));
		panel1.add(new JLabel("Điểm trung bình", JLabel.RIGHT));
		panel1.add(gradeTfield = new JTextField(20));
		mainPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		ActionListener action = createAction();
		JButton button;
		button = new JButton("Tìm theo MSSV");
		button.setActionCommand("FIND");
		button.addActionListener(action);
		panel2.add(button);
		button = new JButton("Thêm sinh viên");
		button.setActionCommand("ADD");
		button.addActionListener(action);
		panel2.add(button);
		button = new JButton("Theo năm");
		button.setActionCommand("BY_YEAR");
		button.addActionListener(action);
		panel2.add(button);
		button = new JButton("Theo tên");
		button.setActionCommand("BY_NAME");
		button.addActionListener(action);
		panel2.add(button);
		mainPane.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createTitledBorder("Danh sách sinh viên"));
		textArea = new JTextArea();
		String text = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình\t";
		textArea.setText(text);
//		panel3.setPreferredSize(new Dimension(400, 100));
		JScrollPane scPane = new JScrollPane(textArea);
		scPane.setPreferredSize(new Dimension(400, 100));
		scPane.setBorder(BorderFactory.createTitledBorder("Danh sách sinh viên"));
//		panel3.add(scPane);
//		panel3.add(textArea);
//		panel3.setPreferredSize(new Dimension(400, 100));
//		mainPane.add(panel3);
		
		getContentPane().add(scPane);
		getContentPane().add(mainPane, BorderLayout.NORTH);
		
//		mainPane.add(scPane);
//		getContentPane().add(mainPane);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		stm.addStudent(111, "Lucifer", 1999, 9.9);
		stm.addStudent(112, "Michael", 2000, 9.8);
		stm.addStudent(113, "Uriel", 2001, 9.7);
		stm.addStudent(114, "Selaphiel", 2002, 9.6);
		stm.addStudent(115, "Jegudiel", 2003, 9.5);
		stm.addStudent(116, "Barachiel", 2004, 9.4);
		stm.addStudent(117, "Gabriel", 2005, 9.3);
		stm.addStudent(118, "Raphael", 2006, 9.2);
		stm.addStudent(119, "Angel", 2007, 9.1);
		updateTextArea();
	}
	public void add() {
		int id = Integer.parseInt(idTField.getText());
		String name = nameTfield.getText();
		int bYear = Integer.parseInt(yearTfield.getText());
		double grade = Double.parseDouble(gradeTfield.getText());
		stm.addStudent(id, name, bYear, grade);
		updateTextArea();
	}
	public void updateTextArea() {
		String text = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình\n";
		for (STUDENT st: stm.getStudent()) {
			text += st.getId()+ "\t" +st.getName() +"\t"+st.getbYear()+"\t"+st.getGrade()+"\n";
		}
		textArea.setText(text);
		invalidate();
	}
	public void find() {
		int id = Integer.parseInt(idTField.getText());
		STUDENT st = stm.findById(id);
		String mess;
		if (st != null) {
			nameTfield.setText(st.getName());
			yearTfield.setText(""+st.getbYear());
			gradeTfield.setText(""+st.getGrade());
		}else {
			mess = "Không tìm thấy sinh viên có MSSV: "+id;
			JOptionPane.showConfirmDialog(null, mess, "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public ActionListener createAction() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String com = e.getActionCommand();
				switch (com) {
				case "FIND": find();
					break;
				case "ADD": add();
					break;
				case "BY_NAME": 
					stm.sortByName();
					updateTextArea();
					break;
				case "BY_YEAR": 
					stm.sortByYear();
					updateTextArea();
					break;
				}
			}

		};
	}
	public static void main(String[] args) {
		new MainFrame();
	}
}
