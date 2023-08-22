package decuoiki.src.bai3;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.Border;

public class mainFrame extends JFrame {
	static JFrame window;

	public mainFrame() {
		setTitle("Bank Management");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// tạo ra tên trong stack để gọi vào vùng nhớ trong heap => liên kết stack sang
		// heap
		// nếu ko tạo ra tên thì vùng nhớ trong heap chỉ đc sử dụng JFrame.this vì nó
		// chưa có tên
		ImageIcon icon = new ImageIcon("src/picture/ace.gif");
		this.setIconImage(icon.getImage());
		window = this;
		getContentPane().add(new mainPanel());
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new mainFrame();
	}
}
