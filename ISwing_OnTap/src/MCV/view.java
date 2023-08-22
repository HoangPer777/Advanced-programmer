package MCV;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import controller.CounterListener;

public class view extends JFrame{
	private model model; 
	
	private JButton up_btn;
	private JButton down_btn;
	private JButton reset_btn;
	
	public view () {
		this.model = new model();
		this.init();
		
		
		
		this.setVisible(true);
	}
	public view(MCV.model model, JButton up_btn, JButton down_btn, JButton reset_btn) throws HeadlessException {
		super();
		this.model = model;
		this.up_btn = up_btn;
		this.down_btn = down_btn;
		this.reset_btn = reset_btn;
	}
	public void init() {
		ActionListener ac = new controller(this);

		this.setTitle("My Windown");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		up_btn = new JButton("up");
		up_btn.addActionListener(ac);
		down_btn = new JButton("down");
		reset_btn = new JButton("reset");
		JLabel result = new JLabel("Ket qua: " + this.model.getCouter());
		
		jpanel.add(up_btn , BorderLayout.WEST); 
		jpanel.add(down_btn , BorderLayout.EAST);
		jpanel.add(result , BorderLayout.CENTER);
		jpanel.add(reset_btn, BorderLayout.SOUTH);
		this.add(jpanel);
		
//		up_btn.addActionListener( e -> {
//			this.model.increment();
//			result.setText("Ket qua: " + this.model.getCouter());
//		});
//		
//		down_btn.addActionListener( e -> {
//			this.model.decrement();
//			result.setText("Ket qua: " + this.model.getCouter());
//		});
//		reset_btn.addActionListener( e -> {
//			this.model.reset();
//			result.setText("Ket qua: " + this.model.getCouter());
//		});
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
