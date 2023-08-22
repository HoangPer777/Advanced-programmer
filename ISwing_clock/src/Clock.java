import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Clock extends JFrame{
	public static void main(String[] args) {
		TalkingClock tk = new TalkingClock();
		tk.start(1000, true);
		JOptionPane.showConfirmDialog(null, "Tắt?", "Đồng hồ đang chạy", JOptionPane.OK_OPTION);
		System.exit(0);
	}	
}

class TalkingClock{
	public void start(int TimeLapLai, boolean beep) {
		ActionListener action = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date now = new Date();
				System.out.println("Thoi gian hien tai la " + now);
				if(beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		Timer t = new Timer(TimeLapLai, action); 
		t.start();
	}	
}
