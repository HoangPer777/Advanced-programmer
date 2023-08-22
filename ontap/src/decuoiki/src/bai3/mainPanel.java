package decuoiki.src.bai3;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


class mainPanel extends JPanel {
	CardLayout card;
	// defausePanel
	JPanel defausePanel;
	//  Checking;
	JPanel Checking;
	
	// Saving
	JPanel Saving;
	JButton butSave;
	JButton clearSave;
	// Certificate
	JPanel Certificate;
	JButton butCertificate;
	JButton clearCertificate;

	JMenuBar menubar;
	JMenu menu1;
	JMenu menu2;
	JMenuItem item1;
	JMenuItem item2;
	JMenuItem item3;

	public mainPanel() {
		card = new CardLayout();
		setLayout(card);
		add(defausePanel = new defausePanel(), "Bank Management");
		add(Checking=new Checking(), "Checking Account");
		add(Saving=new Saving(), "Saving Account");
		add(Certificate=new Certificate(), "Certificate of Account");

		card.show(mainPanel.this, "Bank Management");

	}

	class defausePanel extends JPanel {
		JPanel bot;
		JLabel pic;

		public defausePanel() {
			setLayout(new BorderLayout());
			menubar = new JMenuBar();
			menu1 = new JMenu("Account Management");
			menu1.setMnemonic('A');
			menu2 = new JMenu("Exit");
			menu2.setMnemonic('E');
			item1 = new JMenuItem("Checking Account");
			item1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					card.show(mainPanel.this,"Checking Account" );
					mainFrame.window.setTitle("Checking Account");
                    ImageIcon icon1=new ImageIcon("src/picture/king.gif");
                    mainFrame.window.setIconImage(icon1.getImage());
				}
			});
			item2 = new JMenuItem("Saving Account");
			item2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					card.show(mainPanel.this, "Saving Account");
					mainFrame.window.setTitle("Saving Account");
					ImageIcon icon2=new ImageIcon("src/picture/queen.gif");
					mainFrame.window.setIconImage(icon2.getImage());
				}
			});
			item3 = new JMenuItem("Certificate of Account");
			item3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					card.show(mainPanel.this, "Certificate of Account");
					mainFrame.window.setTitle("Certificate of Deposit");
					ImageIcon icon3=new ImageIcon("src/picture/jack.gif");
					mainFrame.window.setIconImage(icon3.getImage());
				}
			});

			menu1.add(item1);
			menu1.add(item2);
			menu1.add(item3);

			menubar.add(menu1);
			menubar.add(menu2);
			pic = new JLabel();
			pic.setIcon(new ImageIcon("src/picture/ace.gif"));
			bot = new JPanel();
			bot.add(pic);
			add(bot, BorderLayout.CENTER);
			add(menubar, BorderLayout.NORTH);

		}
	}
	

}
