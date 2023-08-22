import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VD2 extends JFrame {

	String mons[][] = { { "Nhập môn tin học", "Lập trình cơ bản", "Toán cao cấp" },
			{ "Lập trình nâng cao", "Nhập môn hệ điều hành" },
			{ "Mạng máy tính", "Cấu trúc dữ liệu", "Cấu trúc máy tính" }, { "Lập trình mạng" } };
	String kys[][] = { { "Học Kỳ 1" ,  "Học Kỳ 2" }, { "Học Kỳ 3" ,  "Học Kỳ 4" } };
	
	int selectYear = 1;
	
	JComboBox<String> ky, mon;

	public VD2() {
		setTitle("Khảo sát sinh thông tin sinh viên");
		setLocationRelativeTo(null);

		JPanel mainPnl = new JPanel();
		mainPnl.setLayout(new BoxLayout(mainPnl, BoxLayout.Y_AXIS));
		JPanel jpanel1 = new JPanel();
		jpanel1.setLayout(new GridLayout(2, 2, 5, 5));
		jpanel1.add(new JLabel("Họ và tên"));
		jpanel1.add(new JTextField(20));
		jpanel1.add(new JLabel("Mã số sinh viên"));
		jpanel1.add(new JTextField(20));

		JPanel jpanel2 = new JPanel();
		jpanel2.setLayout(new GridLayout(1, 2, 5, 5));
		JPanel panelL = new JPanel();
		
		ActionListener action = createYear();
		panelL.setLayout(new BoxLayout(panelL, BoxLayout.Y_AXIS));
		panelL.setBorder(BorderFactory.createTitledBorder("Chọn năm học"));
		ButtonGroup gr = new ButtonGroup();
		JRadioButton nam;
//		JRadioButton nam1 = new JRadioButton("Năm 1");
//		nam1.setActionCommand("1");
//		JRadioButton nam2 = new JRadioButton("Năm 2");
//		nam2.setActionCommand("2");
//		nam1.addActionListener(action);
//		nam1.setSelected(true);
//		nam2.addActionListener(action);
		nam = new JRadioButton("Năm 1");
		nam.setActionCommand("1");
		nam.addActionListener(action);
		gr.add(nam);
		nam.setSelected(true);
		panelL.add(nam);
		
		
		nam = new JRadioButton("Năm 2");
		nam.setActionCommand("2");
		nam.addActionListener(action);
		gr.add(nam);
		panelL.add(nam);
		
		
//		gr.add(nam1);
//		gr.add(nam2);
//		panelL.add(nam1);
//		panelL.add(nam2);
		jpanel2.add(panelL);

		JPanel panelR = new JPanel();
		panelR.setBorder(BorderFactory.createTitledBorder("sở thích"));
		panelR.setLayout(new BoxLayout(panelR, BoxLayout.Y_AXIS));
		JCheckBox sport = new JCheckBox("Thể thao");
		JCheckBox music = new JCheckBox("Âm nhạc");
		panelR.add(sport);
		panelR.add(music);
		jpanel2.add(panelR);

		JPanel jpanel3 = new JPanel();
		jpanel3.setLayout(new GridLayout(1, 2, 5, 5));
		JComboBox<String> mon = new JComboBox<>(mons[0]);
		JComboBox<String> ky = new JComboBox<>(kys[0]);
		
		ky.addActionListener(e -> {
			int index = ky.getSelectedIndex();
			if(index == -1 ) {
				return;
			}
			mon.removeAllItems();
			int si = (selectYear - 1) * 0 + index;
			String items[] = mons[si]; 
			for (String item : items) {
				mon.addItem(item);
			}
		});
		
		jpanel3.add(ky);
		jpanel3.add(mon);
		
		JPanel jpanel4 = new JPanel();
		jpanel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton check = new JButton("Khảo sát");
		JButton exit = new JButton("Thoát");
		exit.addActionListener(e -> {
			String mess = "Bạn thật sự muốn thoát ";
			int results = JOptionPane.showConfirmDialog(null, mess, mess, JOptionPane.OK_CANCEL_OPTION);
			if(results == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		});
		
		jpanel4.add(check);
		jpanel4.add(exit);
		
		

		mainPnl.add(jpanel1);
		mainPnl.add(jpanel2);
		mainPnl.add(jpanel3);
		mainPnl.add(jpanel4);

		this.add(mainPnl);

		pack();
		setVisible(true);
	}

	private ActionListener createYear() {
		
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int year = Integer.parseInt(e.getActionCommand());
				System.out.println(year);
				if(year != selectYear) {
					selectYear = year;
					ky.removeAllItems();
					String items[] = kys[year -1];
					for (String item : items) {
						ky.addItem(item);
					}
				}
				
			}
		};
	}

	public static void main(String[] args) {
		new VD2();
	}
}
