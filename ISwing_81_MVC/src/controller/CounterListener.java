package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;
// để xử lý các sự kiện
public class CounterListener implements ActionListener{
	private CounterView ctv;
	
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Ban da nhan nut!");
		
		String src = e.getActionCommand();
		System.out.println("Ban da nhan nut: "+ src); // bạn đã nhấn nút nào đó 
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}
	}

}