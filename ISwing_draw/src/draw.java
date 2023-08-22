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

import model.AShape;
import model.Circle;
import model.Line;
import model.Rectangle;

public class draw extends JFrame {
	public JLabel status;
	public static final int lineShape = 1;
	public static final int rectangleShape = 2;
	public static final int circleShape = 3;

	private Color[] colors = { Color.pink, Color.blue, Color.lightGray, Color.black, Color.cyan, Color.GREEN };
	private String[] statusText = { "", "Vẽ đường thẳng", "Vẽ hình chữ nhật", "Vẽ hình tròn" };

	private int shapeType = lineShape;
	private int colorIndex = 3;

	public draw() {
		this.add(new ToolBarPane(), BorderLayout.NORTH);
		this.add(new DrawingPane(), BorderLayout.CENTER);
		this.add(new StatusPane(), BorderLayout.SOUTH);

		setTitle("draw app");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class ShapeButton extends JButton {
		static int padding = 10;
		int shapetype;

		public ShapeButton(int shapetype, ActionListener action) {
			this.shapetype = shapetype;
			addActionListener(action);
			setActionCommand("" + shapetype);
			setPreferredSize(new Dimension(50, 50));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);

			switch (shapeType) {
			case lineShape:
				g.drawLine(padding, padding, getWidth() - padding, getHeight() - padding);
				break;
			case rectangleShape:
				g.drawRect(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
				break;
			case circleShape:
				g.drawOval(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
				break;

			}
		}

	}

	class ColorButton extends JButton {
		int colorIndex;

		public ColorButton(int colorIndex, ActionListener action) {
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

	class ToolBarPane extends JPanel {

		public ToolBarPane() {
			setLayout(new FlowLayout(FlowLayout.LEFT));

			ActionListener shapeAction = new ActionListener() {

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

			add(new ShapeButton(lineShape, shapeAction));
			add(new ShapeButton(rectangleShape, shapeAction));
			add(new ShapeButton(circleShape, shapeAction));

			JPanel jpanel = new JPanel();
			jpanel.setLayout(new GridLayout(2, 3));
			for (int i = 0; i < 6; i++) {
				jpanel.add(new ColorButton(i, colorAction));
			}
			add(jpanel);
		}
	}

	class DrawingPane extends JPanel {
		List<AShape> shapes = new ArrayList<>();
		AShape lastshape = null;
		boolean isStarted = false;

		public DrawingPane() {
			MouseAdapter ma = new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (isStarted) {
						isStarted = false;
						status.setText(" ");
						lastshape = null;
					} else {
						isStarted = true;
						status.setText(statusText[shapeType]);
						switch (shapeType) {
						case lineShape:
							lastshape = new Line(new Point(e.getX(), e.getY()), colors[colorIndex]);
							shapes.add(lastshape);
							break;
						case rectangleShape:
							lastshape = new Rectangle(new Point(e.getX(), e.getY()), colors[colorIndex]);
							shapes.add(lastshape);
							break;
						case circleShape:
							lastshape = new Circle(new Point(e.getX(), e.getY()), colors[colorIndex]);
							shapes.add(lastshape);
							break;
						}

					}
				}

				public void mouseMoved(MouseEvent e) {
					if (isStarted) {
						lastshape.resize(new Point(e.getX(), e.getY()));
						repaint();
					}
				}
			};

			addMouseListener(ma);
			addMouseMotionListener(ma);
		}

		@Override
		public void paintComponent(Graphics g) {
			setBackground(Color.WHITE);
			super.paintComponent(g);
			for (AShape shape : shapes) {
				shape.draw(g);
			}

		}

	}

	public class StatusPane extends JPanel {

		public StatusPane() {
			setLayout(new FlowLayout(FlowLayout.LEFT));
			status = new JLabel(" ");
			add(status);
		}
	}

	public static void main(String[] args) {
		new draw();
	}

}
