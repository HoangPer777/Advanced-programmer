package decuoiki.de2017.bai2;

import javax.swing.JFrame;

public class frame extends JFrame{
	public frame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(new mainPanel());
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new frame();
	}

}
