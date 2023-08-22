import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SetFont2 extends JFrame {
//	JTextArea text;
	JComboBox<String> fontCMB, sizeCMB;
	String font_name;
	int typeSize;
	int style = Font.BOLD;
	JTextField doc;
	JCheckBox bold_cb;
	JCheckBox italic_cb;
	String fonts[] = { "Serif", "SansSerif", "Monospaced", "Dialog", "DialogInput" };
	String sizes[] = { "8", "10", "12", "15", "18", "24", "36", "48" };

	public SetFont2() {
		setTitle("Chương trình cài đặt về font chữ: ");

		ActionListener action = new fontAction();

		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		JPanel panel1_top = new JPanel();
		panel1_top.setLayout(new GridLayout(2, 2, 5, 5));
		JLabel font = new JLabel("Font face: ");
		fontCMB = new JComboBox<String>(fonts);
		fontCMB.addActionListener(action);
		JLabel size = new JLabel("Size: ");
		sizeCMB = new JComboBox<String>(sizes);
		sizeCMB.addActionListener(action);
		panel1_top.add(font);
		panel1_top.add(fontCMB);
		panel1_top.add(size);
		panel1_top.add(sizeCMB);
		font_name = (String) fontCMB.getSelectedItem();
		typeSize = Integer.parseInt((String) sizeCMB.getSelectedItem());

//		ActionListener action = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			
//				if(bold_cb.isSelected()) {
//					int style = Font.BOLD;
//				}else {
//					int style = 0;
//				}
//				if(italic_cb.isSelected()) {
//					int style = Font.ITALIC;
//				}else {
//					int style = 0;
//				}
//				doc.setFont(new Font(font_name, style , typeSize));
//			}
//		};

		JPanel panel1_button = new JPanel();
		bold_cb = new JCheckBox("Bold");
		bold_cb.setActionCommand("Bold");
		bold_cb.addActionListener(action);

		italic_cb = new JCheckBox("Italic");
		italic_cb.addActionListener(action);
		italic_cb.setActionCommand("Italic");
		ButtonGroup gr = new ButtonGroup();
		gr.add(bold_cb);
		gr.add(italic_cb);

		panel1_button.add(bold_cb);
		panel1_button.add(italic_cb);

		panel1_button.setLayout(new BoxLayout(panel1_button, BoxLayout.Y_AXIS));

		panel1.add(panel1_top);
		panel1.add(panel1_button);

		JPanel panel2 = new JPanel();

		doc = new JTextField("Phan Văn Hoàng");
		doc.setSize(20, 10);
		panel2.add(doc);

		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(panel1);
		this.add(panel2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}

	private class fontAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (bold_cb.isSelected()) {
				int style = Font.BOLD;
			} else {
				int style = 0;
			}
			if (italic_cb.isSelected()) {
				int style = Font.ITALIC;
			} else {
				int style = 0;
			}
			Font font = new Font(font_name, style, typeSize);
			doc.setFont(font);
			doc.setFont(font);
			doc.repaint();
		}

	}

	public static void main(String[] args) {
		new SetFont2();
	}

}
