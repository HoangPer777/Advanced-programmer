package test;

import javax.swing.UIManager;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			new TimKiemView();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}