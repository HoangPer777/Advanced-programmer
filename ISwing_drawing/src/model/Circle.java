package model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AShape {
	int radius;
	

	public Circle(Point origin, Color color) {
		super(origin, color);
		// TODO Auto-generated constructor stub
		radius = 0;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		int x1, y1;
		x1 = origin.x - radius;
		y1 = origin.y - radius;
		g.setColor(color);
		g.drawOval(x1, y1, 2 * radius, 2 * radius);
		
	}

	@Override
	public void reSize(Point second) {
		// TODO Auto-generated method stub
		int dx = second.x - origin.x;
		int dy = second.y - origin.y;
		radius = (int) Math.sqrt(dx * dx + dy * dy);
	}

}
