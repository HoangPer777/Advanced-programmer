import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingApplication extends JFrame {

	public SwingApplication() {
		setTitle("HoangPro");
		JPanel jpanel = new JPanel();
		
		
		
		
		setSize(600, 300);
		setVisible(true);
	  };
	  
	  public void setVerticalTextPosition(int textPosition) {
		  System.out.println("Hoang");
		  setVisible(true);
	  }
	public static void main(String[] args) {
		new SwingApplication();
	}
}