package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener{
	private LastButtonView lastButtonView; //
	
	// constructor
	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nguonSuKien = e.getActionCommand(); 
		if (nguonSuKien.equals("1")) { // nhấn vào nút số 1 thì
			this.lastButtonView.changeTo_1(); // lastButtonView gọi changeTo để thay đổi giá trị
		}else if (nguonSuKien.equals("2")) {
			this.lastButtonView.changeTo_2();
		}else if (nguonSuKien.equals("3")) {
			this.lastButtonView.changeTo_3();
		}else if (nguonSuKien.equals("4")) {
			this.lastButtonView.changeTo_4();
		}
	}
}