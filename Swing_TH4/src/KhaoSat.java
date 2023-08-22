import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class KhaoSat extends JFrame {
	public KhaoSat() {
		
		
		
		setTitle("Khảo sát sinh viên");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
//		setSize(300, 200);
		
		
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2 , 2, 5, 5));
		JLabel fullName = new JLabel("Họ và tên ");
		JTextField name = new JTextField(10);

		JLabel MSSV = new JLabel("MSSV");
		JTextField mssv = new JTextField(10);
		panel1.add(fullName);
		panel1.add(name);
		panel1.add(MSSV);
		panel1.add(mssv);
		

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 2));
		
		JPanel panelSV = new JPanel();
		panelSV.setBorder(BorderFactory.createTitledBorder("Sinh viên năm"));
		panelSV.setLayout(new GridLayout(2, 1));
		ButtonGroup gr = new ButtonGroup();
//		Checkbox checkbox1 = new Checkbox();
//		JLabel nam1 = new JLabel("nam1");
//		Checkbox checkbox2 = new Checkbox();
//		JLabel nam2 = new JLabel("nam2");
		JRadioButton nam1 = new JRadioButton("nam1");
		JRadioButton nam2 = new JRadioButton("nam2");
		gr.add(nam1);
		gr.add(nam2);
	
		
//		panelSV.add(checkbox1);
		panelSV.add(nam1);
//		panelSV.add(checkbox2);
		panelSV.add(nam2);
		
		
		JPanel panelST = new JPanel();
		
		panelST.setBorder(BorderFactory.createTitledBorder("Sở thích"));
		panelST.setLayout(new GridLayout(2, 2));
		Checkbox checkbox3 = new Checkbox();
		JLabel theThao = new JLabel("Thể Thao");
		Checkbox checkbox4 = new Checkbox();
		JLabel AmNhac = new JLabel("Âm Nhạc");
	
		panelST.add(checkbox3);
		panelST.add(theThao);
		panelST.add(checkbox4);
		panelST.add(AmNhac);
		
		panel2.add(panelSV);
		panel2.add(panelST);
		
		JPanel panel3 = new JPanel();
//		JComboBox<E> box = new JComboBox<>();

		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton KhaoSat = new JButton("khảo sát");
		JButton Thoat = new JButton("thoát");
		panel4.add(KhaoSat);
		panel4.add(Thoat);
		
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		
		getContentPane().add(mainPanel);
		pack();
		setVisible(true);

	}


	
	
	public static void main(String[] args) {
		new KhaoSat();
	}

}
