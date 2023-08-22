package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener{
	private MyColorView myColorView; // tạo ra một lớp MyColorView để set class view
	
	
	public MyColorListener(MyColorView myColorView) {
		this.myColorView = myColorView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand(); // lấy nguồn sự kiện ra 
		if(src.equals("Red Text")) { // nếu nhấn vào red text thì
			this.myColorView.changeTextColor(Color.RED); // thì màu chữ gọi hàm changeColor
		}else if(src.equals("Yellow Text")) {
			this.myColorView.changeTextColor(Color.YELLOW);
		}else if(src.equals("Green Text")) {
			this.myColorView.changeTextColor(Color.GREEN);
		}else if(src.equals("Red Background")) {
			this.myColorView.changeBacgroundColor(Color.RED);
		}else if(src.equals("Yellow Background")) {
			this.myColorView.changeBacgroundColor(Color.YELLOW);
		}else if(src.equals("Green Background")) {
			this.myColorView.changeBacgroundColor(Color.GREEN);
		}
	}

}
