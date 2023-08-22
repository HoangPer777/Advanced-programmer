package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AShape {
	int radius;

	public Circle(Point org, Color color) {
		super(org, color);
		radius = 0;
	}

	@Override
	public void draw(Graphics g) {
		int x1, y1;
		x1 = origin.x - radius;
		y1 = origin.y - radius;
		g.setColor(color);
		g.drawOval(x1, y1, 2 * radius, 2 * radius);
	}

	@Override
	public void resize(Point second) {
		int dx = second.x - origin.x;
		int dy = second.y - origin.y;
		radius = (int) Math.sqrt(dx * dx + dy * dy);
	}

}
