import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyWindow extends JFrame {
	
	public MyWindow() {
		this.setTitle("HoangPer");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
			
		JButton jbutton = new JButton("Hoang pro");
		JButton jbutton2 = new JButton("Hoang ne ae 1");
		JButton jbutton3 = new JButton("Hoang ne ae 2");
		JButton jbutton4 = new JButton("Hoang ne ae 3");
		JButton jbutton5 = new JButton("Hoang ne ae 4");
		
//		jbutton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		jbutton.addActionListener(e ->{
			jbutton.setText("hello");
		});

		

		jpanel.add(jbutton , BorderLayout.CENTER);
		jpanel.add(jbutton2, BorderLayout.NORTH);
		jpanel.add(jbutton3, BorderLayout.SOUTH);
		jpanel.add(jbutton4, BorderLayout.EAST);
		jpanel.add(jbutton5, BorderLayout.WEST);
		
		
		JPanel jpanel2 = new JPanel();
		jpanel2.setLayout(new GridLayout(2, 2));
		JButton jlaber = new JButton("ok");
		JButton jlaber2 = new JButton("ok");
		JButton jlaber3 = new JButton("ok");
		JButton jlaber4 = new JButton("ok");
		
		
		jpanel2.add(jlaber);
		jpanel2.add(jlaber2);
		jpanel2.add(jlaber3);
		jpanel2.add(jlaber4);
		
		
		
		JTextField jt = new JTextField(50);

		this.setLayout(new BorderLayout());
		this.add(jpanel, BorderLayout.SOUTH);
		this.add(jpanel2, BorderLayout.CENTER);
		this.add(jt, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWindow();
	}
	
}
