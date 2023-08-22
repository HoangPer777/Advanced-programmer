
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	JTextArea textArea; // trong cái panel3
	JTextField nameTF, mssvTF, yearTF, pointTF;
	StudentManagement stm = new StudentManagement();

	public MainFrame() {
		setTitle("Quản lý sinh viên");
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 2));
		panel1.setBorder(BorderFactory.createTitledBorder("Thông tin sinh viên"));

		panel1.add(new JLabel("Họ và tên"));
		nameTF = new JTextField(20);
		panel1.add(nameTF);

		panel1.add(new JLabel("MSSV"));
		mssvTF = new JTextField(20);
		panel1.add(mssvTF);

		panel1.add(new JLabel("Năm sinh"));
		yearTF = new JTextField(20);
		panel1.add(yearTF);

		panel1.add(new JLabel("Điểm trung bình"));
		pointTF = new JTextField(20);
		panel1.add(pointTF);

		JPanel panel2 = new JPanel();
		ActionListener action = createAtion();

		JButton button1 = new JButton("Tìm theo MSSV");
		button1.setActionCommand("Find");
		button1.addActionListener(action);

		JButton button2 = new JButton("Thêm sinh viên");
		button2.setActionCommand("Add");
		button2.addActionListener(action);

		JButton button3 = new JButton("sort theo năm");
		button3.setActionCommand("Year");
		button3.addActionListener(action);

		JButton button4 = new JButton("sort theo tên");
		button4.setActionCommand("Name");
		button4.addActionListener(action);

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);

//		JPanel panel3 = new JPanel();

		textArea = new JTextArea();
		String string = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình";
		textArea.setText(string);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(400, 100));
		scrollPane.setBorder(BorderFactory.createTitledBorder("Danh sách sinh viên"));

//		panel3.add(crollPane);

		MainPanel.add(panel1);
		MainPanel.add(panel2);
		MainPanel.add(scrollPane);
		getContentPane().add(MainPanel, BorderLayout.NORTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		stm.addStudent(22130023, "Lê Phi Hùng", 2001, 9.0);
		stm.addStudent(22120073, "Nguyễn Văn An", 2004, 9.0);
		stm.addStudent(22100033, "Lý Thái Tổ", 2001, 9.0);
		stm.addStudent(22130203, "Trần Văn Trà", 2003, 9.0);
		stm.addStudent(22140103, "Thị Nhi", 2004, 9.0);
		stm.addStudent(22090023, "Đỗ Tiến Sĩ", 2000, 9.0);
		stm.addStudent(22090123, "Lê Thạc Sĩ", 2006, 9.0);
		updatetextArea();

	}

	private void updatetextArea() {
		// TODO Auto-generated method stub
		String text = "MSSV\t Họ và tên\t Năm sinh\t Điểm trung bình\n";
		for (Student st : stm.getStudents()) {
			text += st.getId() + "\t" + st.getName() + "\t" + st.getbYear() + "\t" + st.getGrade() + "\n";
		}
		textArea.setText(text);
		invalidate();
	}
	
	private ActionListener createAtion() {
		// TODO Auto-generated method stub
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String types = e.getActionCommand();
				switch (types) {
				case "Find":
					find();
					break;
				case "Add":
					add();
					break;
				case "Year":
					
					stm.sortbyYear();
					updatetextArea();
					break;

				case "Name":
					
					stm.sortbyName();
					updatetextArea();
					break;

				}
			}

			

			
			private void add() {
				// TODO Auto-generated method stub
				int id = Integer.parseInt(mssvTF.getText());
				String name = nameTF.getText();
				int year = Integer.parseInt(yearTF.getText());
				double grade = Double.parseDouble(pointTF.getText());
				stm.addStudent(id, name, year, grade);
				updatetextArea();
						
				
			}

			private void find() {
				// TODO Auto-generated method stub
				int id = Integer.parseInt(mssvTF.getText());
				Student st = stm.findById(id);
				String mess;
				if (st != null) {
					nameTF.setText(st.getName());
					yearTF.setText("" + st.getbYear());
					pointTF.setText("" + st.getGrade());

				} else {
					mess = "Không tìm thấy sinh viên có MSSV: " + id;
					JOptionPane.showConfirmDialog(null, mess, "Lỗi", JOptionPane.CLOSED_OPTION);
					
				}

			}
		};
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
