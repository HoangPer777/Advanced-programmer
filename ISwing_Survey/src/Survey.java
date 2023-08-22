import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.BorderFactory;
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

public class Survey extends JFrame{
	String[][] semesters = { // chuỗi học kỳ 
			{"Học kỳ 1", "Học kỳ 2"},
			{"Học kỳ 3", "Học kỳ 4"}
	};
	String[][] subjects = {
			{"Nhập môn tin học", "Lập trình cơ bản", "Toán cao cấp"},
			{"Lập trình nâng cao", "Nhập môn hệ điều hành"},
			{"Mạng máy tính", "Cấu trúc dữ liệu", "Cấu trúc máy tính"},
			{"Lập trình mạng"}
	};
	
	public Survey() {
		setTitle("Đăng kí môn học");
		
		
		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS ));
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2 ,2, 5, 5));
		JLabel nameJlb = new JLabel("Họ và tên");
		JTextField tfld1 = new JTextField(10);
		JLabel MSSVJlb = new JLabel("MSSV");
		JTextField tfld2 = new JTextField(10);
		panel1.add(nameJlb);
		panel1.add(tfld1);
		panel1.add(MSSVJlb);
		panel1.add(tfld2);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 2, 5, 5));
		JPanel lPanel = new JPanel();
		lPanel.setLayout(new BoxLayout(lPanel, BoxLayout.Y_AXIS));
		lPanel.setBorder(BorderFactory.createTitledBorder("Năm học"));
		ButtonGroup gr = new ButtonGroup();
		JRadioButton nam1 = new JRadioButton("Năm 1");
		JRadioButton nam2 = new JRadioButton("Năm 2");
		gr.add(nam1);
		gr.add(nam2);
		lPanel.add(nam1);
		lPanel.add(nam2);
		
		
		JPanel rPanel = new JPanel();
		rPanel.setBorder(BorderFactory.createTitledBorder("Sở thích"));
		rPanel.setLayout(new BoxLayout(rPanel, BoxLayout.Y_AXIS));
		JCheckBox sportCB = new JCheckBox("Thể thao");
		JCheckBox interestCB = new JCheckBox("Sở thích");
		rPanel.add(sportCB);
		rPanel.add(interestCB);
		
		panel2.add(lPanel);
		panel2.add(rPanel);
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 2));
		JComboBox<String> semester = new JComboBox<>(semesters[0]);
		JComboBox<String> subject = new JComboBox<>(subjects[0]);
		panel3.add(semester);
		panel3.add(subject);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton KSbtn = new JButton("Khảo sát");
		JButton exitBtn = new JButton("Thoát");
		panel4.add(KSbtn);
		panel4.add(exitBtn);
		
		exitBtn.addActionListener(e -> {
			int results = JOptionPane.showConfirmDialog(null, "Bạn thực sự muốn thoát", "Thoát",JOptionPane.YES_NO_OPTION );
		
			if(results == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		});
		
		
		panelMain.add(panel1);
		panelMain.add(panel2);
		panelMain.add(panel3);
		panelMain.add(panel4);
		this.add(panelMain);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Survey();
	}
}
