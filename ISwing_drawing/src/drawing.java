import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
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
import model.Rect;

public class drawing extends JFrame {
	public static final int line = 1;
	public static final int square = 2;
	public static final int circle = 3;

	JLabel status;

	String statusText[] = { " " ,"Đường thẳng", "Hình chữ Nhật", "Hình tròn" };
	Color colors[] = { Color.black, Color.blue, Color.CYAN, Color.green, Color.lightGray, Color.MAGENTA };

	int type_shape = line;
	int colorIndex = 1;

	public drawing() {
		setTitle("drawing app");
		setSize(600, 500);

		this.add(new ToolBarPane(), BorderLayout.NORTH);
		this.add(new workSpace(), BorderLayout.CENTER);
		this.add(new statusPane(), BorderLayout.SOUTH);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class shape_icon extends JButton {
		static int padding = 10;
		int type_shape;

		public shape_icon(int type_shape, ActionListener action) {
			super();
			this.type_shape = type_shape;
			addActionListener(action);
			setActionCommand("" + type_shape);
			setPreferredSize(new Dimension(50, 50));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.darkGray);
			switch (type_shape) {
			case line: {
				g.drawLine(padding, padding, getWidth() - padding, getHeight() - padding);
				break;
			}
			case square: {
				g.drawRect(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
				break;
			}
			case circle: {
				g.drawOval(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
				break;
			}

			}

		}
	}

	class color_icon extends JButton {
		int colorIndex;

		public color_icon(int colorIndex, ActionListener action) {
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

			ActionListener iconAction = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					type_shape = Integer.parseInt(e.getActionCommand());

				}
			};

			ActionListener colorAction = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					colorIndex = Integer.parseInt(e.getActionCommand());
				}
			};

			add(new shape_icon(line, iconAction));
			add(new shape_icon(square, iconAction));
			add(new shape_icon(circle, iconAction));

			JPanel jpanel = new JPanel();
			jpanel.setLayout(new GridLayout(2, 3));
			for (int i = 0; i < 6; i++) {
				jpanel.add(new color_icon(i, colorAction));

			}
			add(jpanel);

		}

	}

	class workSpace extends JPanel {
		List<AShape> shapes = new ArrayList<>();
		boolean IsStated = false;
		AShape lastShape = null;

		public workSpace() {
			MouseAdapter ma = new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					if (IsStated) {
						IsStated = false;
						status.setText(" ");
						lastShape = null;

					} else {
						IsStated = true;
						status.setText(statusText[type_shape]);
						switch (type_shape) {
						case line: {
							lastShape = new Line(new Point(e.getX(), e.getY()), colors[colorIndex]);
							shapes.add(lastShape);
							break;
						}
						case square: {
							lastShape = new Rect(new Point(e.getX(), e.getY()), colors[colorIndex]);
							shapes.add(lastShape);
							break;
						}
						case circle: {
							lastShape = new Circle(new Point(e.getX(), e.getY()), colors[colorIndex]);
							shapes.add(lastShape);
							break;
						}

						}
					}

				};
				
				@Override
				public void mouseMoved(MouseEvent e) { // sử lý sự kiện chuột di chuyển isStarted = true
					if (IsStated) {
						lastShape.reSize(new Point(e.getX(), e.getY())); // resize trong các lớp con để chỉnh kích thước căn cứ vào lần đầu tiên kich chuột là lần thứ 2
						repaint(); // gọi ra để vẽ hình theo kích thước 
					}
				}

			};
			addMouseListener(ma);
			addMouseMotionListener(ma);
		}
		@Override
		public void paintComponent(Graphics g) {
			setBackground(Color.WHITE); // màu nền ở center là màu trắng
			super.paintComponent(g); // xóa và vẽ lại toàn bộ các đối tượng trên jpanel tránh giữ lại bất kì đối tượng nào đc vẽ trước đó
			for (AShape shape : shapes) // kêu từng loại hình trong danh sách hình vẽ hình của chính mình
				shape.draw(g); // bằng cách gọi lại hàm draw
		}

	}

	class statusPane extends JPanel {
		public statusPane() {
			status = new JLabel(" ");
			add(status);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			setBackground(Color.cyan);
//				setPreferredSize(new Dimension(getPreferredSize()));
			setPreferredSize(getPreferredSize());
		}
	}

	public static void main(String[] args) {
		new drawing();
	}

}
