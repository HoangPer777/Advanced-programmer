package PlayMusic;


import javax.swing.*;
public class Player extends JFrame{
	String[]names = {"Play", "Pause"};
	int status
	;
	public Player() {
		super("Player");
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		JButton stopBtn = new JButton("Stop");
		JButton playBtn = new JButton(names[status]);
		JLabel statusLbl = new JLabel();
		panel.add(stopBtn);
		panel.add(playBtn);
		panel.add(statusLbl);
		
//		playBtn.addActionListener(e->{
//			JButton btn = (JButton)e.getSource();
//			if (status == 0) {
//				status = 1;
////				playBtn.setText(names[status]);
//				btn.setText(names[status]);
//				statusLbl.setText("Playing");
//			}else {
//				status = 0;
////				playBtn.setText(names[status]);
//				btn.setText(names[status]);
//				statusLbl.setText("Pausing");
//			}
//		});
		playBtn.addActionListener(e->{
//			JButton btn = (JButton)e.getSource();
			if (status == 0) {
				status = 1;
				playBtn.setText(names[status]);
//				btn.setText(names[status]);
				statusLbl.setText("Playing");
			}else {
				status = 0;
				playBtn.setText(names[status]);
//				btn.setText(names[status]);
				statusLbl.setText("Pausing");
			}
		});
		
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		Player pl = new Player();
	}
}
