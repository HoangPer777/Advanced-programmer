import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 * A program for viewing images.
 */
class ImageViewerFrame extends JFrame {

	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 300;

	public ImageViewerFrame() {
		setTitle("ImageViewer");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// use a label to display the images
		label = new JLabel();
		add(label);

		// set up the file chooser
		chooser = new JFileChooser(); //cho phép người dùng chọn tệp từ hệ thống tệp của máy tính.
		chooser.setCurrentDirectory(new File(".")); // chọn mặc định thư mục hiện tại sẽ là thư mục đc chọn khi cửa sổ mở lên 
		
		// set up the menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("File");
		menuBar.add(menu);

		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		// show file chooser dialog
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int result = chooser.showOpenDialog(null); // null để cho hộp thoại hiển thị ở trung tâm màng hình 

				// if file selected, set it as icon of the label
				if (result == JFileChooser.APPROVE_OPTION) { // kiểm tra người dùng có chọn tệp hay không bắt sự kiện người dùng chọn tệp và nhấn vào nút open
					String name = chooser.getSelectedFile().getPath(); // lấy ra đường dẫn của tệp mà người dùng đã chọn và getPath() để trả về đường dẫn tuyệt đối
					label.setIcon(new ImageIcon(name)); // new ImageIcon(name) để tạo đối tượng icon với name là đường dẫn tuyệt đối tới icon
					// cho đường đẫn tới icon image thành dạng label để hiển thị
				}
			}
		});

		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0); // thoát khỏi chương trình
			}
		});

	}
}

public class ImageViewer {
	public static void main(String[] args) {
		JFrame frame = new ImageViewerFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
