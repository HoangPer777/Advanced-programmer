import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator extends JFrame {
	String string = "";
	JLabel displayLbl;

	public calculator() {
		setTitle("my calculator");
		setSize(400, 300);

		JPanel screen = createScreenJPanel();
		JPanel key = createKeyJPanel();
		this.setLayout(new BorderLayout());
		this.add(screen, BorderLayout.NORTH);
		this.add(key, BorderLayout.CENTER);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JPanel createScreenJPanel() {
		JPanel jpanel = new JPanel();
		displayLbl = new JLabel("0", JLabel.RIGHT);
		jpanel.add(displayLbl);
		jpanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpanel.setBackground(Color.magenta);
		return jpanel;
	}

	private JPanel createKeyJPanel() {
		ActionListener numAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = e.getActionCommand();
				if (string.equals(".") && string.indexOf(".") > -1) {
					return;
				}

				string += s;
				if (s.equals("0") && string.length() > 1) {
					if (!(string.charAt(0) == '0' && string.charAt(1) == '.')) {
						string = string.substring(1);
					}
				}

				displayLbl.setText(string);
			}
		};
		ActionListener funAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				
				if (s.equals("+")) {
					string.indexOf("+");
					
				}
				
				
				if (s.equals("CE")) {
					string = "0";
					displayLbl.setText(string);
				}			
			}
		};

		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(4, 4, 10, 10));

		jpanel.add(createKeyButton("9", numAction));
		jpanel.add(createKeyButton("8", numAction));
		jpanel.add(createKeyButton("7", numAction));
		jpanel.add(createKeyButton("CE", funAction));

		jpanel.add(createKeyButton("6", numAction));
		jpanel.add(createKeyButton("5", numAction));
		jpanel.add(createKeyButton("4", numAction));
		jpanel.add(createKeyButton("+", funAction));

		jpanel.add(createKeyButton("3", numAction));
		jpanel.add(createKeyButton("2", numAction));
		jpanel.add(createKeyButton("1", numAction));
		jpanel.add(createKeyButton("-", funAction));

		jpanel.add(createKeyButton("0", numAction));
		jpanel.add(createKeyButton(".", numAction));
		jpanel.add(createKeyButton("=", funAction));
		jpanel.add(createKeyButton("*", funAction));
		return jpanel;
	}

	private JButton createKeyButton(String text, ActionListener action) {
		JButton jbutton = new JButton(text);
		jbutton.setActionCommand(text);
		jbutton.addActionListener(action);
		return jbutton;
	}

	public static void main(String[] args) {
		new calculator();
	}
}
