import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JFrame{
	
	public MyWindow() {
		this.setTitle("Hoang por");
		this.setSize(600, 300);
		
		JPanel jpanel = new JPanel();
		JButton jbutton = new JButton();
		
		jpanel.add(jbutton);
		this.add(jpanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {

		MyWindow m3 = new MyWindow();
		
	}
}