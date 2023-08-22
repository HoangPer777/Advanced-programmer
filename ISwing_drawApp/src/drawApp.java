import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drawApp extends JFrame {

	public final int Line = 1;
	public final int Rectangle = 2;
	public final int Circle = 3;

	int shapeType = Line;
	int colorIndex = 0;

	private JLabel statuss;
	private String[] statusText = { "", "Vẽ đường thẳng", "Vẽ hình chữ nhật", "Vẽ hình tròn" };

	Color colors[] = { Color.black, Color.BLUE, Color.CYAN, Color.gray, Color.green, Color.PINK };

	public drawApp() {
		this.add(new ToolBar(), BorderLayout.NORTH);
		this.add(new WorkSpace(), BorderLayout.CENTER);
		this.add(new Status(), BorderLayout.SOUTH);

		setTitle("draw app");
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	class customIcon extends JButton {
		int padding = 10;
		int shapeType = Line;

		public customIcon(int shapeType, ActionListener action) {
			this.shapeType = shapeType;
			addActionListener(action);
			setActionCommand("" + shapeType);
			setPreferredSize(new Dimension(50, 50));
		}

		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.black);
			super.paintComponent(g);
			switch (shapeType) {
			case Line: {
				g.drawLine(padding, padding, getWidth() - padding, getHeight() - padding);
				break;
			}
			case Rectangle: {
				g.drawRect(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
				break;
			}
			case Circle: {
				g.drawOval(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
				break;
			}

			}
		}
	}

	class customColor extends JButton {
		int colorIndex;

		public customColor(int colorIndex, ActionListener action) {
			this.colorIndex = colorIndex;
			addActionListener(action);
			setActionCommand("" + colorIndex);
			setPreferredSize(new Dimension(50, 25));
		}

		@Override
		public void paintComponent(Graphics g) {
			setBackground(colors[colorIndex]);
			super.paintComponent(g);
		}
	}

	class ToolBar extends JPanel {
		public ToolBar() {
			ActionListener iconAction = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					shapeType = Integer.parseInt(e.getActionCommand());

				}
			};

			ActionListener colorAction = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					colorIndex = Integer.parseInt(e.getActionCommand());
				}
			};

			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(new customIcon(Line, iconAction));
			add(new customIcon(Rectangle, iconAction));
			add(new customIcon(Circle, iconAction));

			JPanel jpanel = new JPanel();
			jpanel.setLayout(new GridLayout(2, 3));
			for (int i = 0; i < 6; i++) {
				jpanel.add(new customColor(i, colorAction));
			}
			add(jpanel);
		}

	}

	class WorkSpace extends JPanel {
		List<AShape> shapes = new ArrayList<>();
		AShape lastShape = null;
		boolean isStarted = false;

		public WorkSpace() {
			MouseAdapter ma = new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseClicked(e);
					if (isStarted) {
						isStarted = false;
						statuss.setText(" ");
						lastShape = null;
					} else {
						isStarted = true;
						statuss.setText(statusText[shapeType]);
						switch (shapeType) {
						case Line: {
							lastShape = new Line(new Point(getX(), getY()), colors[colorIndex]);
							shapes.add(lastShape); 
							break;
						}

						case Rectangle: {
							lastShape = new Rectangle(new Point(getX(), getY()), colors[colorIndex]);
							shapes.add(lastShape); 
							break;
						}

						case Circle: {
							lastShape = new Circle(new Point(getX(), getY()), colors[colorIndex]);
							shapes.add(lastShape); 
							break;
						}

						}

					}

				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseMoved(e);
					if(isStarted) {
						lastShape.reSize(new Point(e.getX(), e.getY()));
						repaint();
					}
					
				}
			};
			addMouseListener(ma);
			addMouseMotionListener(ma);

		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			setBackground(Color.WHITE);
			for (AShape shape : shapes) {
				shape.draw(g);
			}
			
		}
	}

	class Status extends JPanel {
		public Status() {
			setLayout(new FlowLayout(FlowLayout.LEFT));
			statuss = new JLabel("Chưa vẽ gì! ");
			add(statuss);
			setBackground(Color.lightGray);
		}

	}

	public static void main(String[] args) {
		new drawApp();
	}

}