import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * gồm 3 cách tạo actionListener 
 */

public class SetFont extends JFrame {

	JRadioButton font1, font2;

	public SetFont() {
		setTitle("Chuyển đổi font chữ");
		setSize(600, 400);

		Font font11 = new Font("arial", Font.BOLD, 40);
		Font font22 = new Font("time new roman", Font.ITALIC, 40);

		this.setLayout(new BorderLayout());
		JLabel text = new JLabel("Front chữ bạn mong muốn");
		this.add(text, BorderLayout.CENTER);

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (font1.isSelected()) {
					text.setFont(font11);
				}
				if (font2.isSelected()) {
					text.setFont(font22);
				}

			}
		};
		
		font1 = new JRadioButton("font 1");	
		font1.addActionListener(action);
		font2 = new JRadioButton("font 2");
		font2.addActionListener(action);

//		font1.addActionListener( e ->  {
//			text.setFont(font11);
//		});
//		font2.addActionListener( e ->  {
//			text.setFont(font22);
//		});

		ButtonGroup gr = new ButtonGroup();
		gr.add(font1);
		gr.add(font2);
		JPanel panel = new JPanel();

		

//		ActionListener action = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				String command = e.getActionCommand();
//				if (command.equals("font1")) {
//					text.setFont(font11);
//				}
//				if (command.equals("font2")) {
//					text.setFont(font22);
//				}
//			}
//		};

		panel.add(font1);
		
		panel.add(font2);
//		panel.add(radion("font1", action));
//		panel.add(radion("font2", action));
		this.add(panel, BorderLayout.SOUTH);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

//	public JRadioButton radion(String name, ActionListener action) {
//		JRadioButton radiobutton = new JRadioButton();
//		radiobutton.setActionCommand(name);
//		radiobutton.addActionListener(action);
//
//		return radiobutton;
//
//	}

	public static void main(String[] args) {
		new SetFont();
	}
}
