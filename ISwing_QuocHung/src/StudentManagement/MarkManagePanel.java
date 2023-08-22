package StudentManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MarkManagePanel extends JPanel {
	private JLabel mssv, hoten, monhoc, diem;
	private JTextField mssvf, hotenf, tenmhf;
	private JButton thembtn, timbtn;
	private JTextArea area;

	MarkManagePanel() {
		setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		Border bd = BorderFactory.createLineBorder(Color.GRAY);
		topPanel.setBorder(BorderFactory.createTitledBorder(bd, "Them Mon Hoc"));

		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
		this.mssv = new JLabel("MSSV");
		hoten = new JLabel("Ho va ten");
		monhoc = new JLabel("Mon Hoc");
		diem = new JLabel("Diem");

		mssvf = new JTextField();
		hotenf = new JTextField();
		tenmhf = new JTextField();

		String[] mhArr = { "1111  Lập trình nâng cao", "2222  Lý thuyết đồ thị", "3333  Lập trình cơ bản",
				"4444  Thiết kế hướng đối tượng" };
		JComboBox<String> mhCombo = new JComboBox<String>(mhArr);
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
		panelItem.add(monhoc);
		mhCombo.setPreferredSize(new Dimension(200, 30));
		panelItem.add(mhCombo);
		topPanel.add(panelItem);

		panelItem = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelItem.add(diem);
		tenmhf.setPreferredSize(new Dimension(200, 30));
		panelItem.add(tenmhf);
		topPanel.add(panelItem);

		add(topPanel, BorderLayout.NORTH);

		JPanel midPanel = new JPanel();
		Border bd1 = BorderFactory.createLineBorder(Color.GRAY);
		midPanel.setBorder(BorderFactory.createTitledBorder(bd, "Thao tac"));
		midPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		thembtn = new JButton("Them Diem");
		timbtn = new JButton("Tim Sinh Vien");
		midPanel.add(thembtn);
		midPanel.add(timbtn);

		add(midPanel, BorderLayout.CENTER);

		area = new JTextArea(10, 35);
		area.setEditable(false);
		String areastt = "STT";
		String areaten = "Ten Mon Hoc";
		String areadiem = "Diem";

		area.append(MyPanel.fomatData(areastt, areaten, areadiem));
//		area.append(MyPanel.fomatData("1234", "Nguyen Van A B C D E F", "10.0"));
		JScrollPane pane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setPreferredSize(new Dimension(0, 150));
		add(pane, BorderLayout.SOUTH);
	}

}
