package StudentManagement;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private JPanel panel;
	private CardLayout cardLayout;
	public static StudentManagement listStudent;

	public MyPanel() {
		listStudent = new StudentManagement();
		cardLayout = new CardLayout();
		panel = new JPanel(cardLayout);
		setLayout(new BorderLayout());

		panel.add("tab1", new Tab1());
		panel.add("Grade", new MarkManagePanel());
		panel.add("Subject", new SubjectManagePanel());

		add(panel, BorderLayout.CENTER);

		change("tab1");
	}

	public static String fomatData(String stt, String ten, String diem) {
		while (stt.length() < 5 || ten.length() < 50 || diem.length() < 5) {
			if (stt.length() < 5) {
				stt += " ";
			}
			if (ten.length() < 255) {
				ten += " ";
			}
			if (diem.length() < 5) {
				diem += " ";
			}
		}
		return stt + "\t" + ten + "\t\t\t" + diem + "\n";
	}

	public void change(String string) {
		cardLayout.show(panel, string);
	}

	class Tab1 extends JPanel {
		Tab1() {
			setLayout(new BorderLayout());
			JLabel label = new JLabel("Quản lý sinh vien K.CNTT");
			label.setHorizontalAlignment(JLabel.CENTER);
			add(label, BorderLayout.CENTER);
		}
	}


}
