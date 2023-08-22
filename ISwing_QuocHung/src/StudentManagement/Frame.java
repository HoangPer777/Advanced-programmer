package StudentManagement;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	Frame() {
		setTitle("Student Management");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanel myPanel = new MyPanel();
		getContentPane().add(myPanel);
		setJMenuBar(myMenuBar(myPanel));
		setSize(600, 500);
		setVisible(true);

	}

	private JMenuBar myMenuBar(MyPanel myPanel) {
		JMenuBar menubar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		fileMenu.setFont(new Font(null, 0, 15));

		JMenu manageMenu = new JMenu("Manage");
		manageMenu.setFont(new Font(null, 0, 15));
		// add
		menubar.add(fileMenu);
		menubar.add(manageMenu);

		JMenuItem item = null;
//		// File menu
		item = new JMenuItem("Exit");
		item.setFont(new Font(null, 3, 15));
		item.setMnemonic(KeyEvent.VK_E);
		item.setPreferredSize(new Dimension(50, 25));
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(item);

		ActionListener manageAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.change(e.getActionCommand());
			}
		};

		// ManageMenu
		item = new JMenuItem("Subject Management");
		item.setFont(new Font(null, 3, 15));
		item.setMnemonic(KeyEvent.VK_S);
		item.setPreferredSize(new Dimension(200, 25));
		item.addActionListener(manageAction);
		item.setActionCommand("Subject");
		manageMenu.add(item);

		item = new JMenuItem("Grade Management");
		item.setFont(new Font(null, 3, 15));
		item.setMnemonic(KeyEvent.VK_G);
		item.setPreferredSize(new Dimension(200, 25));
		item.addActionListener(manageAction);
		item.setActionCommand("Grade");
		manageMenu.add(item);

		return menubar;
	}

	public static void main(String[] args) {
		new Frame();
	}
}
