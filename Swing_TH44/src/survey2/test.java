package survey2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class test extends JFrame {

	int selectedYear = 1;
	JComboBox<String> hocky, mon;
	String[][] semesters = { // chuỗi học kỳ
			{ "Học kỳ 1", "Học kỳ 2" }, { "Học kỳ 3", "Học kỳ 4" } };
	String[][] subjects = { { "Nhập môn tin học", "Lập trình cơ bản", "Toán cao cấp" },
			{ "Lập trình nâng cao", "Nhập môn hệ điều hành" },
			{ "Mạng máy tính", "Cấu trúc dữ liệu", "Cấu trúc máy tính" }, { "Lập trình mạng" } };
	String selectedSem = semesters[0][0];
	String selectedSub = subjects[0][0];

	public test() {
		setTitle("khao sat");

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));
		panel1.add(new JLabel("name"));
		JTextField text1 = new JTextField(20);
		panel1.add(text1);
		panel1.add(new JLabel("id"));
		JTextField text2 = new JTextField(20);
		panel1.add(text2);

		JPanel panel2 = new JPanel();
		ActionListener action = createYearAction();
		panel2.setLayout(new GridLayout(1, 2));
		JPanel panelL = new JPanel();
		panelL.setLayout(new BoxLayout(panelL, BoxLayout.Y_AXIS));
		panelL.setBorder(BorderFactory.createTitledBorder("chon nam hoc"));
		JRadioButton nam1 = new JRadioButton("nam1");
		nam1.setActionCommand("1");
		nam1.addActionListener(action);
		nam1.setSelected(true);

		JRadioButton nam2 = new JRadioButton("nam2");
		nam2.setActionCommand("2");
		nam2.addActionListener(action);
		ButtonGroup gr = new ButtonGroup();
		gr.add(nam1);
		gr.add(nam2);
		panelL.add(nam1);
		panelL.add(nam2);

		JPanel panelR = new JPanel();
		panelR.setLayout(new BoxLayout(panelR, BoxLayout.Y_AXIS));
		panelR.setBorder(BorderFactory.createTitledBorder("chon so thich"));
		JCheckBox thethao = new JCheckBox("the thao");
		JCheckBox amnhac = new JCheckBox("am nhac");
		panelR.add(thethao);
		panelR.add(amnhac);
		panel2.add(panelL);
		panel2.add(panelR);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 2));
		hocky = new JComboBox<String>(semesters[0]);
		mon = new JComboBox<String>(subjects[0]);
		hocky.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				int index = hocky.getSelectedIndex();
				if (index == -1) {
					return;
				}
				hocky.removeAllItems();

			}
		});

		panel3.add(hocky);
		panel3.add(mon);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton khaosat = new JButton("khao sat");
		JButton exit = new JButton("thoat");
		exit.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "ban co chan exit", "ban co chan exit",
					JOptionPane.YES_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		});
		panel4.add(khaosat);
		panel4.add(exit);

		this.add(mainPanel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private ActionListener createYearAction() {
		// TODO Auto-generated method stub
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int year = Integer.parseInt(e.getActionCommand());
				if (year != selectedYear) {
					selectedYear = year;
					hocky.removeAllItems();
					String[] items = semesters[year - 1]; // trừ 1 vì nó là giá trị index
					for (String item : items) // thiết lập lại các giá trị của comboBox
						hocky.addItem(item);
				}

			}
		};
	}

	public static void main(String[] args) {
		new test();
	}
}
