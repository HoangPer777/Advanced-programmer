package quanLy2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class view extends JFrame {

	JTextArea textArea;
	JTextField nameTF, mssvTF,  yearTF, pointTF;
	
	StudentManagement stm = new StudentManagement();

	public view() {
		setTitle("Quản lý sinh viên");
		JPanel MainJPanel = new JPanel();
		MainJPanel.setLayout(new BoxLayout(MainJPanel, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 2, 5, 5));
		panel1.setBorder(BorderFactory.createTitledBorder("Thông tin sinh viên"));
		panel1.add(new JLabel("Họ và tên"));
		panel1.add(nameTF = new JTextField(10));

		panel1.add(new JLabel("MSSV"));
		panel1.add(mssvTF = new JTextField(10));

		panel1.add(new JLabel("Năm sinh"));
		panel1.add(yearTF = new JTextField(10));

		panel1.add(new JLabel("Điểm trung bình"));
		panel1.add(pointTF = new JTextField(10));

		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Các tính năng"));
		JButton button;
		ActionListener action = createAction();
		button = new JButton("Tìm theo MSSV");
		button.setActionCommand("FIND");
		button.addActionListener(action);
		panel2.add(button);

		button = new JButton("Thêm sinh viên");
		button.setActionCommand("ADD");
		button.addActionListener(action);
		panel2.add(button);

		button = new JButton("Sort theo năm");
		button.setActionCommand("SortByYear");
		button.addActionListener(action);
		panel2.add(button);

		button = new JButton("Sort theo tên");
		button.setActionCommand("SortByName");
		button.addActionListener(action);
		panel2.add(button);

		textArea = new JTextArea();
		textArea.setBorder(BorderFactory.createTitledBorder("Danh sách sinh viên"));
		textArea.setPreferredSize(new Dimension(400, 100));
		String text = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình";
		textArea.setText(text);
		JScrollPane scrollPE = new JScrollPane(textArea);

		MainJPanel.add(panel1);
		MainJPanel.add(panel2);
		MainJPanel.add(scrollPE);
		this.add(MainJPanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
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

	private void updateTextArea() {
		// TODO Auto-generated method stub
		String text = "MSSV\t Họ và tên \t Năm Sinh \t Điểm trung bình\n";
		
		for (Student st : stm.getStudents()) {
			text += st.getId() + "\t" + st.getName() + "\t" + st.getBirthYear() + "\t" + st.getPoint() + "\n";
		}
		textArea.setText(text);
	}

	private ActionListener createAction() {
	
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String Command = (e.getActionCommand());
				switch (Command) {
				case "FIND": {
					find();
					break;		
				}
				case "ADD": {
					add();
					break;
				}
				case "SortByYear" :{
					stm.sortByYear();
					updateTextArea();
					break;
				}
				case "SortByName" : {
					stm.sortByName();
					updateTextArea();
					break;
				}
				
				
			}
		}

			private void add() {
				// TODO Auto-generated method stub
				int id = Integer.parseInt(mssvTF.getText());
				String name = nameTF.getText();
				int year = Integer.parseInt(yearTF.getText());
				double point = Double.parseDouble(pointTF.getText());
				stm.addStudent(id, name, year, point);
				updateTextArea();
			}

			private void find() {
				// TODO Auto-generated method stub
				int id = Integer.parseInt(mssvTF.getText());
				Student st = stm.findById(id);
				String mess;
				if(st != null) {
					nameTF.setText(st.getName());
					mssvTF.setText("" + st.getId());
					pointTF.setText(""+ st.getPoint());
				}else {
					mess = "Không tìm thây sinh viên";
					JOptionPane.showConfirmDialog(null, mess, mess, JOptionPane.OK_OPTION);
				}
			}
				
				
			};
	}

	public static void main(String[] args) {
		new view();
	}
}
