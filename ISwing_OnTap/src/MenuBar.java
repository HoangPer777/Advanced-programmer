import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JFrame{
	public MenuBar() {
		setTitle("menu bar đó");
		setSize(600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		fileMenu.addActionListener(e -> {
			System.out.println("ban da nhan file");
		});
		
		JMenuItem openItem = new JMenuItem("Open", KeyEvent.VK_O);
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		openItem.addActionListener(e -> {
			System.out.println("Bạn đã nhấn open");
		});

		
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		JMenuItem saveAsItem = new JMenuItem("Save as");
		saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		saveAsItem.addActionListener(e -> {
			System.out.println("save as");
		});
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
				
		JMenu exitMenu = new JMenu("Exit");
		menuBar.add(exitMenu);
		
		JMenu aboutMenu = new JMenu("About");
		menuBar.add(aboutMenu);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MenuBar();
	}
}
