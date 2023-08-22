package survey2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SurveyFrame extends JFrame {
	String[][] semesters = { // chuỗi học kỳ
			{ "Học kỳ 1", "Học kỳ 2" }, { "Học kỳ 3", "Học kỳ 4" } };
	String[][] subjects = { { "Nhập môn tin học", "Lập trình cơ bản", "Toán cao cấp" },
			{ "Lập trình nâng cao", "Nhập môn hệ điều hành" },
			{ "Mạng máy tính", "Cấu trúc dữ liệu", "Cấu trúc máy tính" }, { "Lập trình mạng" } };
	// Các tham chiếu cần dùng
	JTextField idTfield, nameTfield;
	JCheckBox sportCheckbox, musicCheckbox;
	JComboBox<String> semesterCom, subjectCom;
	// thiết lập giá trị mặc định
	int selectedYear = 1;
	String selectedSem = semesters[0][0];
	String selectedSub = subjects[0][0];

	public SurveyFrame() {
		super("Khảo sát thông tin sinh viên");

		// Panel chính dùng boxlayout
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));

		JPanel pane1 = new JPanel();
		pane1.setLayout(new GridLayout(2, 2, 10, 5));
		pane1.add(new JLabel("Họ và tên", JLabel.RIGHT));
		pane1.add(nameTfield = new JTextField(20));
		pane1.add(new JLabel("Mã số sinh viên", JLabel.RIGHT));
		pane1.add(idTfield = new JTextField(20));

		JPanel temp = new JPanel();
		temp.add(pane1);
		mainPane.add(temp);

		JPanel pane2 = new JPanel();
		pane2.setLayout(new GridLayout(1, 2, 10, 5));
		JPanel lPane, rPane;

		// panel bên trái năm học
		lPane = new JPanel();
		lPane.setBorder(BorderFactory.createTitledBorder("Chọn năm học"));
		lPane.setLayout(new GridLayout(2, 1));
		JRadioButton radio;
		ButtonGroup gr = new ButtonGroup();
//		ActionListener action = createYearAction(); // yearAction ở bên dưới
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int year = Integer.parseInt(e.getActionCommand());
				if (year != selectedYear) {
					selectedYear = year;
					semesterCom.removeAllItems();  // xóa hết tất cả box có sẵn
					String[] items = semesters[year - 1]; // trừ 1 vì nó là giá trị index
					for (String item : items) // thiết lập lại các giá trị của comboBox
						semesterCom.addItem(item);
				}
			}
		};
		radio = new JRadioButton("Năm 1"); // khởi tạo radioBtn với nhãn "nam 1"
		radio.setActionCommand("1"); // đặt lệnh cho hành động nút radio là 1
		radio.addActionListener(action);
		// Chọn mặc định năm 1
		radio.setSelected(true);
		lPane.add(radio);
		gr.add(radio);
		radio = new JRadioButton("Năm 2");
		radio.setActionCommand("2");
		radio.addActionListener(action);
		lPane.add(radio);
		gr.add(radio);

		// panel bên phải - sở thích
		rPane = new JPanel();
		rPane.setBorder(BorderFactory.createTitledBorder("Sở thích"));
		rPane.setLayout(new GridLayout(2, 1));
		rPane.add(sportCheckbox = new JCheckBox("Thể thao"));
		rPane.add(musicCheckbox = new JCheckBox("Âm nhạc"));

		pane2.add(lPane);
		pane2.add(rPane);
		mainPane.add(pane2);

		JPanel pane3 = new JPanel();
		pane3.setLayout(new GridLayout(1, 2));
		semesterCom = new JComboBox<String>(semesters[0]);

		subjectCom = new JComboBox<String>(subjects[0]);
		
		// Bắt sự kiện khi môn học được chọn
		subjectCom.addItemListener(e -> { // phương pháp lambda expression
			// selectedSub mảng môn học
			selectedSub = (String) subjectCom.getSelectedItem(); // lắng nghe sự thay đổi của của subjectCom và gán lại														// cho selectedSub
		});
		pane3.add(semesterCom);
		pane3.add(subjectCom);
		mainPane.add(pane3);
		
		// Khi học kỳ thay đổi => combobox môn học sẽ thay đổi nội dung
		semesterCom.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				int index = semesterCom.getSelectedIndex(); // xác định mục được chọn của semester và gán vào index
				if (index == -1) {
					return;
				}
				
				// Xóa toàn bộ các môn học cũ
				subjectCom.removeAllItems();

				// Thêm các môn học mới theo học kỳ đã chọn
				int si = (selectedYear - 1) * 2 + index; // xác định kì học qua ct này
				String[] items = subjects[si]; // tạo ra mảng với môn học với kì học xác định ở trên 
				for (String item : items) { // thêm vào comboBox các môn học có trên 
					subjectCom.addItem(item);
				}
//				mảng kỳ học 
				selectedSem = (String) semesterCom.getSelectedItem(); // lấy giá trị đc chọn trong comboBox và gán nó cho selectedSem 
			}
		});

		JPanel pane4 = new JPanel();
		pane4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btn;
		btn = new JButton("Khảo sát");
		btn.addActionListener(e -> {
			String title = "Thông tin khảo sát";
			String mess = getSurveyInf(); // getSurveyInf là một cái cửa số thông báo đc định nghĩa bên dưới
			// Người dùng chỉ có 1 lựa chọn đóng dialog
			JOptionPane.showMessageDialog( null , mess, title, JOptionPane.CLOSED_OPTION);
		});
		pane4.add(btn);
		btn = new JButton("Thoát");
		btn.addActionListener(e -> {
			// Người dùng có nhiều lựa chọn YES, NO, CANCEL
			int result = JOptionPane.showConfirmDialog(null, "Bạn thực sự muốn kết thúc chương trình?", "Thoát",
					JOptionPane.YES_NO_OPTION);
			// Kiểm ytra xem người dùng có chọn YES không
			if (result == JOptionPane.YES_OPTION)
				System.exit(0);
		});
		pane4.add(btn);

		mainPane.add(pane4);
		getContentPane().add(mainPane);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	// Tạo nội dung cần hiển thị (thông tin khảo sát)
	private String getSurveyInf() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sinh viên: ");
		sb.append(nameTfield.getText());
		sb.append("\t MSSV:");
		sb.append(idTfield.getText());
		sb.append("\n");
		sb.append("Năm thứ: " + selectedYear);
		sb.append(", " + selectedSem + ", " + selectedSub + "\n"); // kì học, môn học

		if (sportCheckbox.isSelected()) {
			sb.append("Thích " + sportCheckbox.getText());
			
		}
		if (musicCheckbox.isSelected()) {
			sb.append(", Thích " + musicCheckbox.getText());
		}
		return sb.toString();
	}

	// Tạo ACtionListener cho RadioButton Năm học
//	private ActionListener createYearAction() {
//		return new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int year = Integer.parseInt(e.getActionCommand());
//				if (year != selectedYear) {
//					selectedYear = year;
//					semesterCom.removeAllItems();  // xóa hết tất cả box có sẵn
//					String[] items = semesters[year - 1]; // trừ 1 vì nó là giá trị index
//					for (String item : items) // thiết lập lại các giá trị của comboBox
//						semesterCom.addItem(item);
//				}
//
//			}
//		};
//	}

	public static void main(String[] args) {
		new SurveyFrame();
	}

}
