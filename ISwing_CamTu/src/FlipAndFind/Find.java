package FlipAndFind;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Find extends JFrame {
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem menuItem;
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 600;
	public static final int X = 4;
	public static final int Y = 6;
	private ButtonGame2 img1;
	private ButtonGame2 img2;
	private ActionListener actionListener;
	private int status;
	private int point = 0;
	private int attempt = 0;
	private String text = " Point: ";
	private String atp = " Attempts: ";
	JPanel jPanel;
	JLabel jpoint, Attempts;

	public Find() {
		try {
			UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedLookAndFeelException e) {
			throw new RuntimeException(e);
		}

		status = 0;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		actionListener = actionListener();
		matrix();

//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });

		// tao menuBar
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// tao menu dau tien
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		// a submenu
		fileMenu.addSeparator();
		menuItem = new JMenuItem("Exit", KeyEvent.VK_E);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		// status
		JPanel status = new JPanel();
		JLabel st = new JLabel("NOTE: Flip right plus 50 points, wrong minus 20 points. GOOD LUCK!");
		status.setLayout(new FlowLayout(FlowLayout.CENTER));
		status.setBackground(Color.yellow);
		status.add(st);

		// panel chua point
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setBackground(Color.PINK);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));

		jpoint = new JLabel(text + "0");
		jpoint.setOpaque(true);// set background cho label
		jpoint.setBackground(Color.WHITE);
		jpoint.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		jpoint.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(jpoint);

		// attempts
		Attempts = new JLabel(atp + "0");
		Attempts.setOpaque(true);// set background cho label
		Attempts.setBackground(Color.WHITE);
		Attempts.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		Attempts.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(Attempts);
		add(panel, BorderLayout.NORTH);
		add(jPanel, BorderLayout.CENTER);
		add(status, BorderLayout.SOUTH);
		fileMenu.add(menuItem);
		pack();
		setTitle("Flip and Find");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void matrix() {
		jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(X, Y));
		ArrayList<Integer> arrayList = createMatrix();
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				ButtonGame2 button = new ButtonGame2(arrayList.get(Y * i + j),
						new ImageIcon(".//src//image//" + arrayList.get(Y * i + j) + ".png"));
				button.addActionListener(actionListener);
				jPanel.setBackground(Color.PINK);
				jPanel.add(button);
			}
		}
	}

	private ArrayList<Integer> createMatrix() {
		ArrayList<Integer> result = new ArrayList<>();
		int count = 0;
		while (count < X * Y / 2) {
			Random random = new Random();
			int a = random.nextInt(25);
			if (!result.contains(a)) {
				result.add(a);
				count++;
			}
		}
		result.addAll(result);
		Collections.shuffle(result);
		return result;
	}

	private ActionListener actionListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					@Override
					public void run() {
						if (status == 0) {
							img1 = (ButtonGame2) e.getSource();
							if (img1.getValid() != -1) {
								try {
									img1.open();
									Thread.sleep(200);
									status++;
								} catch (InterruptedException ex) {
									throw new RuntimeException(ex);
								}
							}
							return;
						} else {
							if (status == 1) {
								img2 = (ButtonGame2) e.getSource();
								if (img2.getValid() != -1) {
									img2.open();
									if (check()) {
										try {
											actionTrue();

										} catch (InterruptedException ex) {
											throw new RuntimeException(ex);
										}
									} else {
										try {
											actionFalse();
										} catch (InterruptedException ex) {
											throw new RuntimeException(ex);
										}
									}
									status = 0;
								}
							}
						}
					}
				}.start();

			}
		};
	}

	public boolean check() {
		return img1.getValid() != -1 && img2.getValid() != -1 && img1 != img2 && img1.getValid() == img2.getValid();
	}

	public void actionTrue() throws InterruptedException {
		for (int i = 0; i < 6; i++) {
			img1.open();
			img2.open();
		}
		Thread.sleep(500);
		img1.True();
		img2.True();
		point += 50;
		jpoint.setText(text + point);

		attempt += 1;
		Attempts.setText(atp + attempt);
	}

	public void actionFalse() throws InterruptedException {
		for (int i = 0; i < 6; i++) {
			img1.open();
			img2.open();
		}
		Thread.sleep(500);
		img1.close();
		img2.close();
		point -= 20;
		jpoint.setText(text + point);

		attempt += 1;
		Attempts.setText(atp + attempt);
	}

	public static void main(String[] args) {
		new Find();
	}
}
