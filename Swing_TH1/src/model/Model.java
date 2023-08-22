package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view;

public class Model {
	
int dem = 0;
	
	public Model(view hoang, int dem) {
		super();
		this.dem = dem;
	}
	public int getDem() {
		return dem;
	}
	public void setDem(int dem) {
		this.dem = dem;
	}
	public static int Click() {
		int dem = 0;
		dem++;
		return dem;
	}
	
	public static int reset() {
		return 0;
	}
	
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("click me")) {
			this.getDem();
		}
	}
}	
	

