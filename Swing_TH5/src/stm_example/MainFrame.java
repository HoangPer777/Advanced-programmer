package stm_example;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
	JTextField idTfield, nameTfield, yearTfield, gradeTfield;
	JTextArea textArea;
	StudentManagement stm = new StudentManagement();

	public MainFrame() {
		super("Quản lý sinh viên");
		setLocationRelativeTo(null);
		Image icon = Toolkit.getDefaultToolkit().getImage("main.png");
		setIconImage(icon);

		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Thông tin SV"));
		panel1.setLayout(new GridLayout(4, 2, 10, 5));

		panel1.add(new JLabel("MSSV", JLabel.RIGHT));
		panel1.add(idTfield = new JTextField(20));

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

		button = new JButton("Theo Năm");
		button.setActionCommand("BY_YEAR");
		button.addActionListener(action);
		panel2.add(button);

		button = new JButton("Theo tên");
		button.setActionCommand("BY_NAME");
		button.addActionListener(action);
		panel2.add(button);
		mainPane.add(panel2);

		textArea = new JTextArea();
		String text = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình";
		textArea.setText(text);
		JScrollPane scPane = new JScrollPane(textArea);
		scPane.setPreferredSize(new Dimension(400, 200));
		scPane.setBorder(BorderFactory.createTitledBorder("Danh sách sinh viên"));

		getContentPane().add(scPane);
		getContentPane().add(mainPane, BorderLayout.NORTH);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		stm.addStudent(22130023, "Lê Phi Hùng", 2001, 9.0);
		stm.addStudent(22120073, "Nguyễn Văn An", 2004, 9.0);
		stm.addStudent(22100033, "Lý Thái Tổ", 2001, 9.0);
		stm.addStudent(22130203, "Trần Văn Trà", 2003, 9.0);
		stm.addStudent(22140103, "Thị Nhi", 2004, 9.0);
		stm.addStudent(22090023, "Đỗ Tiến Sĩ", 2000, 9.0);
		stm.addStudent(22090123, "Lê Thạc Sĩ", 2006, 9.0);
		updateTextArea();
	}

	private void add() {
		int id = Integer.parseInt(idTfield.getText());
		String name = nameTfield.getText();
		int year = Integer.parseInt(yearTfield.getText());
		double grade = Double.parseDouble(gradeTfield.getText());
		stm.addStudent(id, name, year, grade);
		updateTextArea();
	}

	private void updateTextArea() {
		String text = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình\n";
		for (Student st : stm.getStudents()) {
			text += st.getId() + "\t" + st.getName() + "\t" + st.getbYear() + "\t" + st.getGrade() + "\n";
		}
		textArea.setText(text);
//		invalidate();
	}

	private void find() {
		int id = Integer.parseInt(idTfield.getText());
		Student st = stm.findById(id);
		String mess;
		if (st != null) {
			nameTfield.setText(st.getName());
			yearTfield.setText("" + st.getbYear());
			gradeTfield.setText("" + st.getGrade());
		} else { // không tìm thấy
			mess = "Không tìm thấy sinh viên có MSSV: " + id;
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, mess, "Lỗi", JOptionPane.CLOSED_OPTION);

		}

	}

	private ActionListener createAction() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
				switch (com) {
				case "FIND":
					find();
					break;
				case "ADD":
					add();
					break;
				case "BY_YEAR":
					stm.sortByYear();
					updateTextArea();
					break;
				case "BY_NAME":
					stm.sortByName();
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
