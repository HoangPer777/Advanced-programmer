package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view;

public class Controller implements ActionListener{
	private view Hoang;
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if(button.equals("click me")) {
		
		}
	}

	
	
	
}
