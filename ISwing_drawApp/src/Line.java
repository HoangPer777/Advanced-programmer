import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends AShape {
	protected Point second;
	public Line(Point origin, Color colors) {
		super(origin, colors);
		// TODO Auto-generated constructor stub
		second = new Point(origin.x, origin.y);
	}

	@Override
	protected void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(colors);
		g.drawLine(origin.x, origin.y, second.x, second.y);
	}

	@Override
	protected void reSize(Point second) {
		// TODO Auto-generated method stub
		this.second = second;
	}

}
