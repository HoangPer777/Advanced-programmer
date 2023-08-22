package MCV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller implements ActionListener {

	
	private view view;

	public controller(view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String src = e.getActionCommand();
		if(src.equals("UP")) {
//			this.view
		}
		
	}
	

}
