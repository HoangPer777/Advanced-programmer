package StudentManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SubjectManagePanel extends JPanel {
	JLabel mssv, hoten, mamh, tenmh;
	JTextField mssvf, hotenf, mamhf, tenmhf;
	JButton thembtn, timbtn;
	ActionListener timAction, themAction;
	JTextArea area;

	SubjectManagePanel() {

		String stt = "STT";
		String ten = "Ten Mon Hoc";
		String diem = "Diem";

		timAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String mssv = mssvf.getText().trim();
				if (!mssv.equals("")) {
					Student stu = MyPanel.listStudent.findStudent(mssv);
					if (stu != null) {
						hotenf.setText(stu.getName());
						List<Subject> subjects = stu.getLitSubject();
						area.setText(MyPanel.fomatData(stt, ten, diem));
						for (int i = 0; i < subjects.size(); i++) {
							area.append(MyPanel.fomatData(i + 1 + "", subjects.get(i).getName(),
									String.valueOf(subjects.get(i).getAveragePoint())));
						}
					}
					// Thong bao neu sv khong ton tai
					else {
						JOptionPane.showMessageDialog(null, "Không tồn tại sinh viên có MSSV là: " + mssv, "Error...",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập MSSV");
				}
			}
		};

		themAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String mssv = mssvf.getText().trim();
				if (!mssv.equals("")) {
					Student stu = MyPanel.listStudent.findStudent(mssv);
					if (stu != null) {
						String mamh = mamhf.getText().trim();
						String tenmh = tenmhf.getText().trim();

						if (!mamh.equals("") && !tenmh.equals("")) {
							Subject sub = new Subject(Integer.parseInt(mamh), tenmh);
							if (stu.addSubject(sub)) {
								area.append(MyPanel.fomatData(stu.getLitSubject().size() + "", tenmh,
										sub.getAveragePoint() + ""));
							} else {
								JOptionPane.showMessageDialog(null, "Mã môn học và tên môn học không được trùng",
										"Warning...", JOptionPane.WARNING_MESSAGE);
							}
						}
					}
					// Thong bao neu sv khong ton tai
					else {
						JOptionPane.showMessageDialog(null, "Không tồn tại sinh viên có MSSV là: " + mssv, "Error...",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập MSSV");
				}
			}
		};

		setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		Border bd = BorderFactory.createLineBorder(Color.GRAY);
		topPanel.setBorder(BorderFactory.createTitledBorder(bd, "Them Mon Hoc"));

		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
		mssv = new JLabel("MSSV");
		hoten = new JLabel("Ho va ten");
		mamh = new JLabel("Ma Mon Hoc");
		tenmh = new JLabel("Ten Mon Hoc");

		mssvf = new JTextField();
		hotenf = new JTextField();
		mamhf = new JTextField();
		tenmhf = new JTextField();

		JPanel panelItem = null;

		panelItem = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelItem.add(mssv);
		mssvf.setPreferredSize(new Dimension(200, 30));
		panelItem.add(mssvf);
		topPanel.add(panelItem);

		panelItem = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelItem.add(hoten);
		hotenf.setPreferredSize(new Dimension(200, 30));
		hotenf.setEditable(false);
		panelItem.add(hotenf);
		topPanel.add(panelItem);

		panelItem = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelItem.add(mamh);
		mamhf.setPreferredSize(new Dimension(200, 30));
		panelItem.add(mamhf);
		topPanel.add(panelItem);

		panelItem = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelItem.add(tenmh);
		tenmhf.setPreferredSize(new Dimension(200, 30));
		panelItem.add(tenmhf);
		topPanel.add(panelItem);

		add(topPanel, BorderLayout.NORTH);

		JPanel midPanel = new JPanel();
		Border bd1 = BorderFactory.createLineBorder(Color.GRAY);
		midPanel.setBorder(BorderFactory.createTitledBorder(bd, "Thao tac"));
		midPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		// them
		thembtn = new JButton("Them Mon Hoc");
		thembtn.addActionListener(themAction);

		// tim
		timbtn = new JButton("Tim Sinh Vien");
		timbtn.addActionListener(timAction);
		midPanel.add(thembtn);
		midPanel.add(timbtn);

		add(midPanel, BorderLayout.CENTER);

		area = new JTextArea(10, 35);
		area.setEditable(false);
		area.append(MyPanel.fomatData(stt, ten, diem));
//		area.append(MyPanel.fomatData("1234", "Nguyen Van A B C D E F", "10.0"));
		JScrollPane pane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setPreferredSize(new Dimension(0, 150));
		add(pane, BorderLayout.SOUTH);
	}

}
